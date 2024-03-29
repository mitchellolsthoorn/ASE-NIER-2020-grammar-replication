/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 10:29:17 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import java.io.PipedReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"([C)[[F\":false}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      JSONReader jSONReader1 = new JSONReader(defaultJSONParser0.lexer);
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":99,\"y\":[],\"z\":true,\"\":true,\"b\":{},\"getDeclaringClass\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("JG]A", 1);
      jSONReader0.readObject((Object) jSONReaderScanner0);
      assertNull(jSONReaderScanner0.stringDefaultValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("hJ", 3974);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.close();
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":true,\"y\":[],\"z\":true,\"b\":{\"org.springframework.aop.\":true},\"getDeclaringClass\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Object object0 = jSONReader0.readObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("99");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(99, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"([C)[[F\":\"a string\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      JSONReader jSONReader1 = new JSONReader(defaultJSONParser0.lexer);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 11, line 1, column 12{\"([C)[[F\":\"a string\"}
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":true,\"\":99,\"month\":false,\"\":null}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentHashMap<Object, String> concurrentHashMap0 = new ConcurrentHashMap<Object, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("illegal state : ");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) "illegal state : ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("iloTlegal state : ");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.getTimzeZone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      Feature[] featureArray0 = new Feature[0];
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(pipedReader0, featureArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      JSONReader jSONReader1 = null;
      try {
        jSONReader1 = new JSONReader(jSONReaderScanner0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // EOF error
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":99,\"z\":true,\"\":[]}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      jSONReader0.readLong();
      jSONReader0.readLong();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) parameterizedTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect '[', but string, pos 10, line 1, column 11{\"\":99,\"z\":true,\"\":[]}
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":99,\"y\":7,\"z\":true,\"a\":[],\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Feature feature0 = Feature.DisableSpecialKeyDetect;
      jSONReader0.config(feature0, false);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"yyyy-MM-dd HH:mm:ss.SSSSSSSSS\":-99,\"illegal state : \":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readLong();
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : illegal state : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{fw^Gjy,", 14);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      TreeMap<Method, String> treeMap0 = new TreeMap<Method, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) treeMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect ':' at 0, actual ^
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":[],\"org.joda.time.Duration\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      ConcurrentSkipListMap<Field, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<Field, String>();
      Object object0 = jSONReader0.readObject((Map) concurrentSkipListMap0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      Feature[] featureArray0 = new Feature[7];
      Feature feature0 = Feature.IgnoreNotMatch;
      featureArray0[0] = feature0;
      featureArray0[1] = featureArray0[0];
      featureArray0[2] = feature0;
      featureArray0[3] = featureArray0[1];
      featureArray0[4] = featureArray0[1];
      featureArray0[5] = feature0;
      featureArray0[6] = feature0;
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":true,\"\":99,\"\":99,\"month\":-99,\"xx\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":true,\")Z\":[-99,true],\"\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) parameterizedTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect '[', but string, pos 10, line 1, column 11\"a string\"
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":true,\"\":[],\"\":false,\"xx\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      Object object0 = jSONReader0.readObject();
      String string0 = jSONReader0.readString();
      assertFalse(string0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":true,\")Z\":[false],\"context is null\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {\"\":{},\")Z\":[{}],\"context is null\":{}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("A-ByQQ");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"javax.xml.bind.annotation.XmlAccessorType\":false}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"javax.xml.bind.annotation.XmlAccessorType\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"x\":99,\"y\":7,\"z\":true,\"a\":[],\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.hasNext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // context is null
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"([C)[[F\":\"a string\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":\"\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readLong();
      jSONReader0.readObject();
      jSONReader0.endObject();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":true,\"\":99,\"\":99,\"month\":-99,\"xx\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readObject();
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":true,\"\":99,\"\":99,\"month\":-99,\"xx\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":99,\"org.joda.time.Duration\":-99,\"illegal state : \":{\"illegal state : \":false}}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual string
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("en", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("illegal state: ");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"illegal state : \":true,\"\":{},\"xx\":-99,\"xxx\":false}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((TypeReference<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"([)[[F\":\"a string\"");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      jSONReader0.setTimzeZone(timeZone0);
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      Feature[] featureArray0 = new Feature[7];
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(stringReader0, featureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.Feature", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":\"\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect }, actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":{},\"number\":\"1\"}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Locale locale0 = Locale.FRENCH;
      jSONReader0.setLocale(locale0);
      assertEquals("fr", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":true,\"\":[],\"z\":{},\"b\":{},\"getDeclaringClass\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.close();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not close json text, token : {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":\"\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.endArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ], actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}
