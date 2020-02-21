<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Create an hoh stay for today.</description>
   <name>Create HoH Stay</name>
   <tag></tag>
   <elementGuidId>2dd2307f-029e-4bf8-92e1-baf2579dcc33</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;source\&quot;: \&quot;manual\&quot;,\n    \&quot;channel\&quot;: \&quot;${channel}\&quot;,\n    \&quot;requiresSyncToBookingSync\&quot;: false,\n    \&quot;checkinTime\&quot;: \&quot;${checkin_time}\&quot;,\n    \&quot;checkinTimeState\&quot;: \&quot;unconfirmed\&quot;,\n    \&quot;bagDropTime\&quot;: null,\n    \&quot;checkoutTime\&quot;: \&quot;${checkout_time}\&quot;,\n    \&quot;checkoutTimeConfirmed\&quot;: false,\n    \&quot;guests\&quot;: 2,\n    \&quot;numberOfChildren\&quot;: 0,\n    \&quot;guestName\&quot;: null,\n    \&quot;guestEmail\&quot;: null,\n    \&quot;guestPhoneNumber\&quot;: null,\n    \&quot;arrivalNotes\&quot;: null,\n    \&quot;reasonForTravel\&quot;: null,\n    \&quot;comments\&quot;: null,\n    \&quot;housekeepingRequired\&quot;: true,\n    \&quot;linenRequired\&quot;: true,\n    \&quot;checkinRequired\&quot;: true,\n    \&quot;isHostInStayType\&quot;: false,\n    \&quot;ignoredInSga\&quot;: false,\n    \&quot;status\&quot;: \&quot;confirmed\&quot;,\n    \&quot;propertyId\&quot;: ${property_id},\n    \&quot;sourceRevenue\&quot;: 300,\n\t\&quot;currency\&quot;: \&quot;GBP\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${auth_token}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api-staging.hostmaker.co/api/v1/hoh_stays</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.g_channel</defaultValue>
      <description></description>
      <id>78220fec-54c9-4b08-a331-c185527e7f96</id>
      <masked>false</masked>
      <name>channel</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.g_property_id</defaultValue>
      <description></description>
      <id>ce6e74ff-e5a0-4b8a-a343-43825501e056</id>
      <masked>false</masked>
      <name>property_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.g_checkin_time</defaultValue>
      <description></description>
      <id>63db1b25-b5b3-4095-b0ee-cb152b78e0f2</id>
      <masked>false</masked>
      <name>checkin_time</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.g_checkout_time</defaultValue>
      <description></description>
      <id>b6a5ad7c-51e5-4711-80e7-9d6571081475</id>
      <masked>false</masked>
      <name>checkout_time</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.g_auth_token</defaultValue>
      <description></description>
      <id>01cad8e5-6c48-4388-93aa-89a4c881a319</id>
      <masked>true</masked>
      <name>auth_token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
