package org.eclipse.qvto.examples.xtext.qvtoperational.tests;


public class QVToXtextTestCase extends AbstractQVToXtextTestCase {

	
	public void testOCLInEcoreLoadAsString() throws Exception {
		
		String testFile =			
			"package mm1 : mm1 = 'mm1' {"				
			+	"class c1	{\n"
			+	"	attribute prop1 : String;\n" 
			+	"}\n" 
			+	"class c2 extends c1 {\n"
			+	"	property prop2 : c1;\n"
			+	"}\n"
			+"}";
		doLoadFromString(ocl, "loadAsString.oclinecore", testFile);
	}
	
	public void testQVToLoadAsString() throws Exception {
				
		String testFile =
			"metamodel mm1 {\n"
			+	"class c1 {\n"
			+	"	prop1 : String ;\n"	
			+	"};\n" 
			+	"class c2 extends c1 {\n"
			+	"	prop2 : c1;\n"
			+	"};\n"
			+"}";
		doLoadFromString("loadAsString.qvto2", testFile);
	}
	
	public void testSimpleMetamodelDefinition() throws Exception {
		String testFile =
				"metamodel mm1 {\n"
				+ "	datatype myDataType;" 
				+ "	class c1 {\n"
				+ "		prop1 : String ;\n"
				+ "	};"
				+ "};";
		doLoadFromString("simpleMetamodelDefinition.qvto2", testFile);
	}
	
	public void testSimpleMetamodelDefinitionWithoutOptionalSemicolon() throws Exception {
		String testFile =
				"metamodel mm1 {\n"
				+ "	datatype myDataType" 
				+ "	class c1 {\n"
				+ "		prop1 : String ;\n"
				+ "	}"
				+ "}";
		doLoadFromString("simpleMetamodelDefinitionWithouOptionalSemicolon.qvto", testFile);
	}
	
	public void testSimpleTransformationDefinition() throws Exception {
		String testFile =
				"transformation t1;";
		doLoadFromString("simpleTransformationDefinition.qvto2", testFile);
	}
	
	public void testSimpleMappingDefinition() throws Exception {
		String testFile =
				  "transformation t1 {\n"
				+ " mapping m1 (in p1 : String);\n"
				+ "}";
		doLoadFromString("simpleMappingDefinition.qvto2", testFile);
	}
}
