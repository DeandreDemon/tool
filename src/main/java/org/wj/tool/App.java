package org.wj.tool;


import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.sinosoft.webservicecenter.dto.services.ehmservice.xsd.CarPolicyQueryEhmRequest;
import com.sinosoft.webservicecenter.dto.services.ehmservice.xsd.CarPolicyQueryEhmResponse;
import com.sinosoft.webservicecenter.serviceindiv.CarPolicyQueryService;
import com.sinosoft.webservicecenter.serviceindiv.CarPolicyQueryServicePortType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
    	String xmlStr = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
    			"  <soapenv:Body>\r\n" + 
    			"    <ns:getPolicyQueryResponse xmlns:ns=\"http://serviceIndiv.webServiceCenter.sinosoft.com\">\r\n" + 
    			"      <ns:return xmlns:ax2316=\"http://ehmservice.services.dto.webServiceCenter.sinosoft.com/xsd\" xmlns:ax2317=\"http://common.ehmservice.services.dto.webServiceCenter.sinosoft.com/xsd\" type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.CarPolicyQueryEhmResponse\">\r\n" + 
    			"        <ax2316:carPolicyQueryList type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.CarPolicyQuery\">\r\n" + 
    			"          <ax2317:brandName>大众FV7142FBDWG轿车</ax2317:brandName>\r\n" + 
    			"          <ax2317:carKindCode>A0</ax2317:carKindCode>\r\n" + 
    			"          <ax2317:carOwner>宁静</ax2317:carOwner>\r\n" + 
    			"          <ax2317:channelType>07</ax2317:channelType>\r\n" + 
    			"          <ax2317:comCode>6300007001</ax2317:comCode>\r\n" + 
    			"          <ax2317:endDate>2018-09-08</ax2317:endDate>\r\n" + 
    			"          <ax2317:engineNo>456456465</ax2317:engineNo>\r\n" + 
    			"          <ax2317:enrollDate>2017-09-08</ax2317:enrollDate>\r\n" + 
    			"          <ax2317:frameNo>LFV2A215789798784</ax2317:frameNo>\r\n" + 
    			"          <ax2317:handler1Code>413025198309241244</ax2317:handler1Code>\r\n" + 
    			"          <ax2317:handler1Name>谈恩霞</ax2317:handler1Name>\r\n" + 
    			"          <ax2317:handlerCode>413025198309241244</ax2317:handlerCode>\r\n" + 
    			"          <ax2317:handlerName>谈恩霞</ax2317:handlerName>\r\n" + 
    			"          <ax2317:licenseNo>456456465</ax2317:licenseNo>\r\n" + 
    			"          <ax2317:policyNo>805072017630000000005</ax2317:policyNo>\r\n" + 
    			"          <ax2317:riskCode>0507</ax2317:riskCode>\r\n" + 
    			"          <ax2317:riskName>机动车交通事故责任强制保险</ax2317:riskName>\r\n" + 
    			"          <ax2317:serviceCode/>\r\n" + 
    			"          <ax2317:serviceName/>\r\n" + 
    			"          <ax2317:startDate>2017-09-09</ax2317:startDate>\r\n" + 
    			"        </ax2316:carPolicyQueryList>\r\n" + 
    			"        <ax2316:carPolicyQueryList type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.CarPolicyQuery\">\r\n" + 
    			"          <ax2317:brandName>大众FV7142FBDWG轿车</ax2317:brandName>\r\n" + 
    			"          <ax2317:carKindCode>A0</ax2317:carKindCode>\r\n" + 
    			"          <ax2317:carOwner>宁静</ax2317:carOwner>\r\n" + 
    			"          <ax2317:channelType>07</ax2317:channelType>\r\n" + 
    			"          <ax2317:comCode>6300007001</ax2317:comCode>\r\n" + 
    			"          <ax2317:endDate>2018-09-08</ax2317:endDate>\r\n" + 
    			"          <ax2317:engineNo>456456465</ax2317:engineNo>\r\n" + 
    			"          <ax2317:enrollDate>2017-09-08</ax2317:enrollDate>\r\n" + 
    			"          <ax2317:frameNo>LFV2A215789798784</ax2317:frameNo>\r\n" + 
    			"          <ax2317:handler1Code>413025198309241244</ax2317:handler1Code>\r\n" + 
    			"          <ax2317:handler1Name>谈恩霞</ax2317:handler1Name>\r\n" + 
    			"          <ax2317:handlerCode>413025198309241244</ax2317:handlerCode>\r\n" + 
    			"          <ax2317:handlerName>谈恩霞</ax2317:handlerName>\r\n" + 
    			"          <ax2317:licenseNo>456456465</ax2317:licenseNo>\r\n" + 
    			"          <ax2317:policyNo>805112017630000000003</ax2317:policyNo>\r\n" + 
    			"          <ax2317:riskCode>0511</ax2317:riskCode>\r\n" + 
    			"          <ax2317:riskName>机动车综合商业保险</ax2317:riskName>\r\n" + 
    			"          <ax2317:serviceCode/>\r\n" + 
    			"          <ax2317:serviceName/>\r\n" + 
    			"          <ax2317:startDate>2017-09-09</ax2317:startDate>\r\n" + 
    			"        </ax2316:carPolicyQueryList>\r\n" + 
    			"        <ax2316:carPolicyQueryList type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.CarPolicyQuery\">\r\n" + 
    			"          <ax2317:brandName>思威DHW6464(CR-V 2.4 i-VTEC M)多用途乘用车</ax2317:brandName>\r\n" + 
    			"          <ax2317:carKindCode>A0</ax2317:carKindCode>\r\n" + 
    			"          <ax2317:carOwner>王雷</ax2317:carOwner>\r\n" + 
    			"          <ax2317:channelType>06</ax2317:channelType>\r\n" + 
    			"          <ax2317:comCode>4205976010</ax2317:comCode>\r\n" + 
    			"          <ax2317:endDate>2016-11-26</ax2317:endDate>\r\n" + 
    			"          <ax2317:engineNo>456456465</ax2317:engineNo>\r\n" + 
    			"          <ax2317:enrollDate>2015-11-26</ax2317:enrollDate>\r\n" + 
    			"          <ax2317:frameNo>L5562654515665162</ax2317:frameNo>\r\n" + 
    			"          <ax2317:handler1Code>420502197811134567</ax2317:handler1Code>\r\n" + 
    			"          <ax2317:handler1Name>测试二</ax2317:handler1Name>\r\n" + 
    			"          <ax2317:handlerCode>420502197811134567</ax2317:handlerCode>\r\n" + 
    			"          <ax2317:handlerName>测试二</ax2317:handlerName>\r\n" + 
    			"          <ax2317:licenseNo>456456465</ax2317:licenseNo>\r\n" + 
    			"          <ax2317:policyNo>805112015420597000237</ax2317:policyNo>\r\n" + 
    			"          <ax2317:riskCode>0511</ax2317:riskCode>\r\n" + 
    			"          <ax2317:riskName>机动车综合商业保险</ax2317:riskName>\r\n" + 
    			"          <ax2317:serviceCode/>\r\n" + 
    			"          <ax2317:serviceName/>\r\n" + 
    			"          <ax2317:startDate>2015-11-27</ax2317:startDate>\r\n" + 
    			"        </ax2316:carPolicyQueryList>\r\n" + 
    			"        <ax2316:carPolicyQueryList type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.CarPolicyQuery\">\r\n" + 
    			"          <ax2317:brandName>思威DHW6464(CR-V 2.4 i-VTEC M)多用途乘用车</ax2317:brandName>\r\n" + 
    			"          <ax2317:carKindCode>A0</ax2317:carKindCode>\r\n" + 
    			"          <ax2317:carOwner>王雷</ax2317:carOwner>\r\n" + 
    			"          <ax2317:channelType>06</ax2317:channelType>\r\n" + 
    			"          <ax2317:comCode>4205976010</ax2317:comCode>\r\n" + 
    			"          <ax2317:endDate>2016-11-26</ax2317:endDate>\r\n" + 
    			"          <ax2317:engineNo>456456465</ax2317:engineNo>\r\n" + 
    			"          <ax2317:enrollDate>2015-11-26</ax2317:enrollDate>\r\n" + 
    			"          <ax2317:frameNo>L5562654515665162</ax2317:frameNo>\r\n" + 
    			"          <ax2317:handler1Code>420502197811134567</ax2317:handler1Code>\r\n" + 
    			"          <ax2317:handler1Name>测试二</ax2317:handler1Name>\r\n" + 
    			"          <ax2317:handlerCode>420502197811134567</ax2317:handlerCode>\r\n" + 
    			"          <ax2317:handlerName>测试二</ax2317:handlerName>\r\n" + 
    			"          <ax2317:licenseNo>456456465</ax2317:licenseNo>\r\n" + 
    			"          <ax2317:policyNo>805072015420597000283</ax2317:policyNo>\r\n" + 
    			"          <ax2317:riskCode>0507</ax2317:riskCode>\r\n" + 
    			"          <ax2317:riskName>机动车交通事故责任强制保险</ax2317:riskName>\r\n" + 
    			"          <ax2317:serviceCode/>\r\n" + 
    			"          <ax2317:serviceName/>\r\n" + 
    			"          <ax2317:startDate>2015-11-27</ax2317:startDate>\r\n" + 
    			"        </ax2316:carPolicyQueryList>\r\n" + 
    			"        <ax2316:requestType>5</ax2316:requestType>\r\n" + 
    			"        <ax2316:tXInsuranceResponseEhm type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.TXInsuranceResponseEhm\">\r\n" + 
    			"          <ax2317:transExeDate/>\r\n" + 
    			"          <ax2317:transExeTime/>\r\n" + 
    			"          <ax2317:transRefGUID/>\r\n" + 
    			"          <ax2317:transResultEhm type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.TransResultEhm\">\r\n" + 
    			"            <ax2317:errorNo xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:nil=\"true\"></ax2317:errorNo>\r\n" + 
    			"            <ax2317:errorType>ALL</ax2317:errorType>\r\n" + 
    			"            <ax2317:resultCode>1</ax2317:resultCode>\r\n" + 
    			"            <ax2317:resultInfoDesc>通用配置数据查询成功！</ax2317:resultInfoDesc>\r\n" + 
    			"            <ax2317:stackTrace xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:nil=\"true\"></ax2317:stackTrace>\r\n" + 
    			"          </ax2317:transResultEhm>\r\n" + 
    			"          <ax2317:transSubType/>\r\n" + 
    			"          <ax2317:transType/>\r\n" + 
    			"          <ax2317:oInsuranceExtensionEhm type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.OInsuranceExtensionEhm\">\r\n" + 
    			"            <ax2317:maxRecords>0</ax2317:maxRecords>\r\n" + 
    			"          </ax2317:oInsuranceExtensionEhm>\r\n" + 
    			"        </ax2316:tXInsuranceResponseEhm>\r\n" + 
    			"        <ax2316:tXInsuranceResponseExtensionEhm type=\"com.sinosoft.webServiceCenter.dto.services.ehmservice.common.TXInsuranceResponseExtensionEhm\">\r\n" + 
    			"          <ax2317:operator/>\r\n" + 
    			"          <ax2317:operatorKey/>\r\n" + 
    			"        </ax2316:tXInsuranceResponseExtensionEhm>\r\n" + 
    			"      </ns:return>\r\n" + 
    			"    </ns:getPolicyQueryResponse>\r\n" + 
    			"  </soapenv:Body>\r\n" + 
    			"</soapenv:Envelope>";
    	Document document = DocumentHelper.parseText(xmlStr);
    	Element element = document.getRootElement();
    	Element body = element.element("Body");
    	Element getPolicyQueryResponseElement = body.element("getPolicyQueryResponse");
    	System.out.println(getPolicyQueryResponseElement.asXML());
    }

    /**
     * 通过文件名查找文件夹下是否有该文件，递归查找
     * @param file
     * @param fileName
     * @return 存在返回该文件，不存在返回null
     */
    public File getFileByName(File file, String fileName){
        if (file.isFile()){
            if (file.getName().equals(fileName)){
                return file;
            }
        }else{
            for(String str : file.list()){
                return getFileByName(new File(file.getPath()+File.separator+str),fileName);
            }
        }
        return  null;
    }

    /**
     * 临时文件上传，下载路径
     * @param id 唯一标识路径
     * @return 临时路径
     */
    public String getTempPath(String id){
        String pathName = System.getProperty("java.io.tmpdir") + "logs" +File.separator +id;
        File tempFile = new File(pathName);
        if (!tempFile.exists()){
            tempFile.mkdirs();
        }
        return pathName;
    }
    
    
    
}
