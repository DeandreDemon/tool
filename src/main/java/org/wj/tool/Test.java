package org.wj.tool;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://9.1.121.11:8003/webServiceCenter/services/CarPolicyQueryService?wsdl");
		  
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
		OutputStream os = connection.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		String requestMessage = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://serviceIndiv.webServiceCenter.sinosoft.com\" xmlns:xsd=\"http://ehmservice.services.dto.webServiceCenter.sinosoft.com/xsd\" xmlns:xsd1=\"http://common.ehmservice.services.dto.webServiceCenter.sinosoft.com/xsd\">\r\n" + 
				"   <soapenv:Header/>\r\n" + 
				"   <soapenv:Body>\r\n" + 
				"      <ser:getPolicyQuery>\r\n" + 
				"         <!--Optional:-->\r\n" + 
				"         <ser:ehmRequest>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:engineNo></xsd:engineNo>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:frameNo></xsd:frameNo>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:licenseNo>456456465</xsd:licenseNo>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:operator></xsd:operator>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:requestType>5</xsd:requestType>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:tXInsuranceRequestEhm>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:transExeDate></xsd1:transExeDate>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:transExeTime></xsd1:transExeTime>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:transRefGUID></xsd1:transRefGUID>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:transSubType></xsd1:transSubType>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:transType></xsd1:transType>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:iInsuranceExtensionEhm>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:maxRecords></xsd1:maxRecords>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:orderField></xsd1:orderField>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:orderFlag></xsd1:orderFlag>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:pageFlag></xsd1:pageFlag>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:pageRowNum></xsd1:pageRowNum>\r\n" + 
				"                  <!--Optional:-->\r\n" + 
				"                  <xsd1:rowNumStart></xsd1:rowNumStart>\r\n" + 
				"               </xsd1:iInsuranceExtensionEhm>\r\n" + 
				"            </xsd:tXInsuranceRequestEhm>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <xsd:tXInsuranceRequestExtensionEhm>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:operator></xsd1:operator>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <xsd1:operatorKey></xsd1:operatorKey>\r\n" + 
				"            </xsd:tXInsuranceRequestExtensionEhm>\r\n" + 
				"         </ser:ehmRequest>\r\n" + 
				"      </ser:getPolicyQuery>\r\n" + 
				"   </soapenv:Body>\r\n" + 
				"</soapenv:Envelope>";
		// 发起请求
		pw.println(requestMessage);
		
		InputStream is = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String temp = null;
		
		System.out.println("响应结果是：");
		while ((temp = br.readLine()) != null) {
		    System.out.println(temp);
		}
		pw.close();
		os.close();
		br.close();
		is.close();
	}
}
