The OpenShift `jbossas` cartridge documentation can be found at:

https://github.com/openshift/origin-server/tree/master/cartridges/openshift-origin-cartridge-jbossas/README.md

Data Table Request

http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getdatatable

Example input (1 or many areas):

{ "table":"religion", "areas":["E00100093","E05003422"] }

Notes:

1) One or many areas. 2) Tables - religion or population.

User Defined Table Request

http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getuserdefinedtable

Example inputs:

{ "table":"population", "areaCode":"E00100093", "dataItems": [ { "userDefinedCol":"males0-4", "columns":["0_Male","1_Male","2_Male","3_Male","4_Male"] }, { "userDefinedCol":"females0-4", "columns":["0_Female","1_Female","2_Female","3_Female","4_Female"] } ] }

or

{ "table":"religion", "areaCode":"E00100093", "dataItems": [ { "userDefinedCol":"males0-34-christian", "columns":["Males_Age_0_to_15_Christian","Males_Age_16_to_24_Christian","Males_Age_25_to_34_Christian"] }, { "userDefinedCol":"females0-34-christian", "columns":["Females_Age_0_to_15_Christian","Females_Age_16_to_24_Christian","Females_Age_25_to_34_Christian"] } ] }

Notes:

1) Single area. 2) Tables - religion or population. 3) columns array - must match db.

Example JavaScript function:

&lt;html&gt;
&lt;head&gt;
&lt;meta charset=&quot;ISO-8859-1&quot;&gt;
&lt;title&gt;Insert title here&lt;/title&gt;
&lt;script type=&quot;text/javascript&quot;
	src=&quot;http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js&quot;&gt;&lt;/script&gt;
&lt;script type=&quot;text/javascript&quot;&gt;

function getOutput(url, input, pos)
{
       $.ajax({  
           url:url,  
           type:'post',
           data :  input,  
           contentType: 'application/json',    
           success: function(response) { 
                    $(&quot;&lt;p&gt;&quot; + JSON.stringify(response) + &quot;&lt;/p&gt;&quot;).appendTo(pos)
               } 
       });  
}

getOutput('http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getdatatable',
		'{ &quot;table&quot;:&quot;religion&quot;, &quot;areas&quot;:[&quot;E00100093&quot;,&quot;E05003422&quot;] }', '#dtrr');
getOutput('http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getdatatable',
		'{ &quot;table&quot;:&quot;population&quot;, &quot;areas&quot;:[&quot;E00100093&quot;,&quot;E05003422&quot;] }', '#dtrp');
getOutput('http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getuserdefinedtable',
		'{ &quot;table&quot;:&quot;population&quot;, &quot;areaCode&quot;:&quot;E00100093&quot;, &quot;dataItems&quot;: [ { &quot;userDefinedCol&quot;:&quot;males0-4&quot;, &quot;columns&quot;:[&quot;0_Male&quot;,&quot;1_Male&quot;,&quot;2_Male&quot;,&quot;3_Male&quot;,&quot;4_Male&quot;] }, { &quot;userDefinedCol&quot;:&quot;females0-4&quot;, &quot;columns&quot;:[&quot;0_Female&quot;,&quot;1_Female&quot;,&quot;2_Female&quot;,&quot;3_Female&quot;,&quot;4_Female&quot;] } ] }', '#udtrp');
getOutput('http://onsdatarp-glassfishtest.rhcloud.com/datarp-web/rs/nessdatarp/getuserdefinedtable',
		'{ &quot;table&quot;:&quot;religion&quot;, &quot;areaCode&quot;:&quot;E00100093&quot;, &quot;dataItems&quot;: [ { &quot;userDefinedCol&quot;:&quot;males0-34-christian&quot;, &quot;columns&quot;:[&quot;Males_Age_0_to_15_Christian&quot;,&quot;Males_Age_16_to_24_Christian&quot;,&quot;Males_Age_25_to_34_Christian&quot;] }, { &quot;userDefinedCol&quot;:&quot;females0-34-christian&quot;, &quot;columns&quot;:[&quot;Females_Age_0_to_15_Christian&quot;,&quot;Females_Age_16_to_24_Christian&quot;,&quot;Females_Age_25_to_34_Christian&quot;] } ] }', '#udtrr');

&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;
	&lt;div id=&quot;test&quot;&gt;
		&lt;p&gt;
		&lt;h3&gt;Data Table Request&lt;/h3&gt;
		&lt;/p&gt;
		&lt;h4&gt;Religion&lt;/h4&gt;
		&lt;p&gt;Response:&lt;/p&gt;
		&lt;div id=&quot;dtrr&quot;&gt;&lt;/div&gt;
		&lt;h4&gt;Population&lt;/h4&gt;
		&lt;p&gt;Response:&lt;/p&gt;
		&lt;div id=&quot;dtrp&quot;&gt;&lt;/div&gt;
		&lt;p&gt;
		&lt;h3&gt;User Defined Table Request&lt;/h3&gt;
		&lt;/p&gt;
		&lt;h4&gt;Religion&lt;/h4&gt;
		&lt;p&gt;Response:&lt;/p&gt;
		&lt;div id=&quot;udtrr&quot;&gt;&lt;/div&gt;
		&lt;h4&gt;Population&lt;/h4&gt;
		&lt;p&gt;Response:&lt;/p&gt;
		&lt;div id=&quot;udtrp&quot;&gt;&lt;/div&gt;
	&lt;/div&gt;
&lt;/body&gt;
&lt;/html&gt;