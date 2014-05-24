/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.riot.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.jena.atlas.junit.BaseTest;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;
import org.junit.Test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.PrintUtil;

public class TestLangCSV extends BaseTest
{
	  @Test public void RDFDataMgrReadTest() throws FileNotFoundException{
		  String file = "src/test/resources/test.csv";
		  FileReader r= new FileReader(new File (file));
		  Model m = ModelFactory.createDefaultModel() ;
		  RDFDataMgr.read(m, r, file, RDFLanguages.CSV) ;
		  assertEquals(6, m.size()) ;
		  PrintUtil.printOut(m.listStatements());
	  }
}