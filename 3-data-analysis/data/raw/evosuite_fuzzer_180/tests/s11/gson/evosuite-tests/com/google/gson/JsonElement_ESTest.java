/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:38:38 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonElement_ESTest extends JsonElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'4v3Z\"n,mIg");
      Number number0 = jsonPrimitive0.getAsNumber();
      assertEquals("'4v3Z\"n,mIg", number0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.isJsonPrimitive();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.isJsonNull();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.isJsonArray();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('j');
      jsonArray0.add(character0);
      String string0 = jsonArray0.getAsString();
      assertEquals("j", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float float0 = new Float((-3316.7100396199157));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short) (-3316), short0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Byte byte0 = new Byte((byte)0);
      jsonArray0.add((Number) byte0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Byte byte0 = new Byte((byte)47);
      jsonArray0.add((Number) byte0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(47L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Float float0 = new Float((-66.53F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals((-66L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Character character0 = Character.valueOf('N');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertSame(jsonPrimitive1, jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Boolean boolean0 = new Boolean("20^b0of");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertTrue(jsonPrimitive1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float((-654.6210562));
      jsonArray0.add((Number) float0);
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertFalse(jsonArray1.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = Double.valueOf(2960.4285428534);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals(2960, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = Double.valueOf((-2309.66715175618));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals((-2309), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      float float1 = jsonPrimitive0.getAsFloat();
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(32);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(32.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Double double0 = new Double(1420.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      double double1 = jsonPrimitive0.getAsDouble();
      assertEquals(1420.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float((-1180.25038151));
      jsonArray0.add((Number) float0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals((-1180.2503662109375), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = Character.valueOf('*');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('*', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(3331);
      Character character0 = Character.valueOf('4');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('4', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long(0L);
      jsonArray0.add((Number) long0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long(0L);
      jsonArray0.add((Number) long0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(2311);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)7, byte0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer(2296);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte) (-8), byte0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-107));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      boolean boolean0 = jsonPrimitive0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Character character0 = Character.valueOf(']');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      JsonElement jsonElement0 = jsonPrimitive0.deepCopy();
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = jsonNull0.deepCopy();
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1525);
      JsonElement jsonElement0 = jsonArray0.deepCopy();
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.deepCopy();
      assertNotSame(jsonElement0, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("q~tLD.v[FJCa");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"q~tLD.v[FJCa\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.JsonPrimitive", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"true\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsCharacter();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsCharacter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBoolean();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"j\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'4v3Z\"n,mIg");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsBigDecimal();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigDecimal();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Double double0 = Double.valueOf((-2309.66715175618));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertSame(jsonPrimitive1, jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject();
      assertSame(jsonObject0, jsonObject1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'4v3Z\"n,mIg");
      boolean boolean0 = jsonPrimitive0.isJsonObject();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsInt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonArray();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      boolean boolean0 = jsonNull0.isJsonNull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonNull jsonNull1 = jsonNull0.getAsJsonNull();
      assertTrue(jsonNull1.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: []
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonPrimitive();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Primitive: []
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Array: {}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsShort();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsBigInteger();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsLong();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsJsonObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Object: java.lang.Float@0000000004
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsFloat();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsBoolean();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      String string0 = jsonNull0.toString();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsBigDecimal();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(3331);
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertEquals(0, jsonArray1.size());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsNumber();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsByte();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsCharacter();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }
}