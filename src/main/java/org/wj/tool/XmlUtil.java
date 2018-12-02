package org.wj.tool;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

@SuppressWarnings({"unchecked"})
public class XmlUtil {
	
	
	@SuppressWarnings({ "unused"})
	private Object xmlToBean(Element element, Object obj) throws Exception{
		
		List<Element> elements = element.elements();
		String propertyName = element.getName();
		String setMethodName = "set"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
		Class<?> clazz = obj.getClass();
		Field field = getClassField(clazz, propertyName);
		if (elements.isEmpty()) {
			String propertyValue = element.getTextTrim();
			clazz.getMethod(setMethodName, field.getType()).invoke(obj, propertyValue);
		}else {
			propertyName = "org.wj.tool."+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
			Class<?> subClazz = Class.forName(propertyName);
			Object subObj = subClazz.newInstance();
			for (int i= 0; i < elements.size(); i++) {
				xmlToBean(elements.get(i), subObj);
			}
			clazz.getMethod(setMethodName, field.getType()).invoke(obj, subObj);
		}
		return obj;
    }
	
	
	private Field getClassField(Class<?> clazz, String fieldName) {
		if(Object.class.getName().equals(clazz.getName())) {
			return null;
		}
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			if (fieldName.equals(field.getName())) {
				return field;
			}
		}
		Class<?> superClass = clazz.getSuperclass();
		if (superClass != null) {
			return getClassField(superClass, fieldName);
		}
		return null;
		
	}
	
	private Map<String, String> xmlToMap(Element element){
		Iterator<Element> elementIterator = element.elementIterator();
		Map<String, String> map = new HashMap<String, String>();
		while (elementIterator.hasNext()) {
			Element subElement = elementIterator.next();
			if (subElement.elements().isEmpty()) {
				map.put(subElement.getName(), subElement.getTextTrim());
			}
		}
		return map;
	}
	
	private Object mapToBean(Map<String, String> map, Class<?> clazz) throws Exception {  
        Object obj = clazz.newInstance();  
        if(map != null && map.size() > 0) {  
            for(Map.Entry<String, String> entry : map.entrySet()) {  
                String propertyName = entry.getKey();  
                Object value = entry.getValue();
                
                String setMethodName = "set"  
                        + propertyName.substring(0, 1).toUpperCase()  
                        + propertyName.substring(1);  
                Field field = getClassField(clazz, propertyName);
                if (field == null) {
					continue;
				}
                clazz.getMethod(setMethodName, field.getType()).invoke(obj, value);  
            }  
        }  
        return obj;  
    }
	
	
	public List<Accident> listAccident (String xml) throws Exception{
		Document document = DocumentHelper.parseText(xml);
		List<Accident> accidents = new ArrayList<Accident>();
    	Iterator<Element> accidentListElement = document.getRootElement().element("accidentList").elementIterator("accident");
    	XmlUtil xmlUtil = new XmlUtil();
    	while (accidentListElement.hasNext()) {
    		Element accidentElement = accidentListElement.next();
    		Map<String, String> accidentMap = xmlUtil.xmlToMap(accidentElement);
    		Accident accident = (Accident) xmlUtil.mapToBean(accidentMap, Accident.class);
    		Iterator<Element> registListElement = accidentElement.element("registList").elementIterator("regist");
    		List<Regist> regists = new LinkedList<Regist>();
    		while (registListElement.hasNext()) {
    			Element registElement = registListElement.next();
    			Map<String, String> registMap = xmlUtil.xmlToMap(registElement);
    			Regist regist = (Regist) xmlUtil.mapToBean(registMap, Regist.class);
    			regists.add(regist);
			}
    		accident.setRegistList(regists);
    		Element checkElement = accidentElement.element("check");
    		Map<String, String> checkMap = xmlUtil.xmlToMap(checkElement);
    		Check check = (Check) xmlUtil.mapToBean(checkMap, Check.class);
    		accident.setCheck(check);
    		accidents.add(accident);
    	}
    	return accidents;
	}
}
