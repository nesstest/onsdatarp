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