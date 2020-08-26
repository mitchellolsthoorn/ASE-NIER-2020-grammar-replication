/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 08:06:24 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONValidator;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONValidator_ESTest extends JSONValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte)8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)123;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("{\"x\":\"hello\",\"y\":[],\"z\":true,\"a\":[],\"b\":{}}");
      jSONValidator_UTF16Validator0.fieldName();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.next();
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("\"a string\"");
      jSONValidator_UTF16Validator0.next();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{},\"xx\":null}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.next();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.skipWhiteSpace();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace('^');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"fruit\":\"Apple\",\"\":true,\"color\":\"Red\",\"value\":{},\"value2\":{},\"\":\"1\"}");
      JSONValidator.Type jSONValidator_Type0 = JSONValidator.Type.Value;
      jSONValidator_UTF16Validator0.type = jSONValidator_Type0;
      JSONValidator.Type jSONValidator_Type1 = jSONValidator_UTF16Validator0.getType();
      assertEquals(JSONValidator.Type.Value, jSONValidator_Type1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("false");
      jSONValidator0.pos = (-1148);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3409), (byte)14);
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"\":true,\"value\":[],\"value2\":{}}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.close();
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("");
      jSONValidator_UTF16Validator0.pos = (-2901);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.fieldName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)34;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.any();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("1C8?p#)bkf@~>z2wV");
      jSONValidator_UTF16Validator0.pos = (-2855);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 1510);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)57;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 1510);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(dataInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("{\"x\":\"hello\",\"y\":7,\"z\":true,\"\":[true],\"b\":{\"x\":-99}}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"color\":99,\"value\":true,\"\":{}}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.validate();
      // Undeclared exception!
      jSONValidator_ReaderValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"x\":null,\"\":true,\"a\":99,\"\":{\"x\":-99}}");
      StringReader stringReader0 = new StringReader("{\"\":\"com.alibaba.fastjson.JSONException\",\"color\":\"Red\",\"value\":true,\"value2\":{},\"number\":-99}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      JSONValidator.from("{\"\":\"com.alibaba.fastjson.JSONException\",\"color\":\"Red\",\"value\":true,\"value2\":{},\"number\":-99}");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      jSONValidator_UTF8InputStreamValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-18), (byte) (-18));
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)9;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      stringReader0.reset();
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 2, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("null");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"com.alibaba.fastjson.JSONValidator$UTF8Validator\":null}");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("n&HWTFVta");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("false");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"\":[false]}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("falae");
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("faklse");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("fxDy@n=?cKAv+E[");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("true");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":{},\"\":true\"\":fale}");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 14
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("tQrue");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("\"A@|W.fVm+= mw");
      // Undeclared exception!
      jSONValidator_UTF16Validator0.validate();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("-");
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("{\"\":[true,[],true],\"y\":-99,\"z\":true,\"Object\":{\"\":-99}}");
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":[99,-99],\"^:[null],\"z\":true,\"b\":{\"\":-99}}");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 24
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":{},\"\":true\"\":fale}");
      jSONValidator_UTF16Validator0.pos = 15;
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 16
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":{\"\":false},\"y\":[null],\"\":false,\"x\":true}");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("8Sx");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("6");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)51;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.any();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("+Jc");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)52;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("\"a string\"");
      jSONValidator0.supportMultiValue = false;
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("nugmNl");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("{\"\":[true],\"y\":[nulS,\"z\":true,\"\":{\":true}}");
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 19
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      jSONValidator0.getType();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":{},\"\":true\"\":fale}");
      jSONValidator_UTF16Validator0.close();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-18), (byte) (-18));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(dataInputStream0);
      jSONValidator_UTF8InputStreamValidator0.close();
      assertNull(jSONValidator_UTF8InputStreamValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"x\":null,\"\":true,\"a\":99,\"\":{\"x\":-99}}");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }
}