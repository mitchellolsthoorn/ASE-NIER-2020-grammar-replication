/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 10:51:41 GMT 2020
 */

package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter1.name("xr9f");
      // Undeclared exception!
      try { 
        jsonWriter2.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value("{\"com.google.gson.stream.JsonWriter\":[],\"b\":-99,\"y\":7,\"z\":true,\"Dangling name: \":-99}");
      assertEquals("\"{\\\"com.google.gson.stream.JsonWriter\\\":[],\\\"b\\\":-99,\\\"y\\\":7,\\\"z\\\":true,\\\"Dangling name: \\\":-99}\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonWriter1.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value(true);
      assertEquals("true", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(true);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value(false);
      assertEquals("false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value("\"SoGzF+WuBX");
      assertEquals("\"\\\"SoGzF+WuBX\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value("java.lang.Float@0000000002");
      assertSame(jsonWriter0, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Float float0 = new Float(1.0F);
      jsonWriter0.value((Number) float0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      Short short0 = new Short((short) (-1118));
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value((Number) short0);
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Boolean boolean0 = Boolean.valueOf("]RI(&xXuZa");
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Boolean boolean0 = Boolean.valueOf(true);
      jsonWriter0.value(boolean0);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((Boolean) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(0L);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((-1367L));
      assertEquals("-1367", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(7.783275911578121);
      assertEquals("7.783275911578121", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((-2797.51));
      assertEquals("-2797.51", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.nullValue();
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(6);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.nullValue();
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.name("43`:.wrF+Suq4O|l");
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.name("");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.jsonValue("VF1");
      assertEquals("VF1", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.jsonValue("$6");
      assertEquals("$6", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.jsonValue("#'/L<z");
      assertEquals("#'/L<z", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      boolean boolean0 = jsonWriter0.isHtmlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter0.setHtmlSafe(true);
      jsonWriter1.endObject();
      assertTrue(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      jsonWriter0.endObject();
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setLenient(true);
      jsonWriter1.endArray();
      assertEquals("[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter1.endArray();
      assertTrue(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setSerializeNulls(false);
      jsonWriter1.endArray();
      assertEquals("[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.beginObject();
      jsonWriter0.endObject();
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.beginObject();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginObject();
      jsonWriter0.endObject();
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.beginArray();
      assertEquals("[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.beginArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.beginArray();
      assertEquals("[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter1.value(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      Byte byte0 = new Byte((byte) (-17));
      // Undeclared exception!
      try { 
        jsonWriter1.value((Number) byte0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        jsonWriter1.value(boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((-1462L));
      // Undeclared exception!
      try { 
        jsonWriter0.value((-1462L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.setIndent((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.value("");
      // Undeclared exception!
      try { 
        jsonWriter1.jsonValue("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      jsonWriter0.name("");
      jsonWriter0.jsonValue("");
      // Undeclared exception!
      try { 
        jsonWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("<sqooz5Z4NC^@H\"OkQ$");
      jsonWriter1.beginObject();
      assertEquals("{\"<sqooz5Z4NC^@H\\\"OkQ$\":{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter1.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("Zp?eTwzE| )");
      jsonWriter1.nullValue();
      // Undeclared exception!
      try { 
        jsonWriter0.value("Zp?eTwzE| )");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.beginObject();
      assertEquals("[null,{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setIndent("0d,}1V");
      jsonWriter0.beginObject();
      assertEquals("[\n0d,}1V{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value("\u2028");
      assertEquals("\"\\u2028\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      jsonWriter1.close();
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter0.close();
      // Undeclared exception!
      try { 
        jsonWriter1.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.flush();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Byte byte0 = new Byte((byte)52);
      JsonWriter jsonWriter1 = jsonWriter0.value((Number) byte0);
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((Number) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.value(0.0);
      jsonWriter1.value(0L);
      assertEquals("0.00", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.name("ku7%e");
      // Undeclared exception!
      try { 
        jsonWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.jsonValue((String) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((String) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.value("n)O[HtOx?,UeN2@Mf");
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter1.name("n)O[HtOx?,UeN2@Mf");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("");
      // Undeclared exception!
      try { 
        jsonWriter1.name("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.name((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter0.close();
      // Undeclared exception!
      try { 
        jsonWriter1.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter1.name("\u2028");
      // Undeclared exception!
      try { 
        jsonWriter2.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Dangling name: \u2028
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setIndent("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JsonWriter jsonWriter0 = null;
      try {
        jsonWriter0 = new JsonWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // out == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.nullValue();
      jsonWriter1.endArray();
      assertEquals("[null]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isHtmlSafe();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      assertTrue(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.name("");
      assertFalse(jsonWriter0.getSerializeNulls());
      
      jsonWriter1.nullValue();
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value("");
      assertEquals("\"\"", stringWriter0.toString());
  }
}