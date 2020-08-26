/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 21:13:01 GMT 2020
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
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      boolean boolean0 = jsonNull0.isJsonObject();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonNull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("DJp%sw@e");
      boolean boolean0 = jsonPrimitive0.isJsonArray();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Not a JSON Null: ");
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("Not a JSON Null: ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      String string0 = jsonArray0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(55L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)55, short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float((-2135.9F));
      jsonArray0.add((Number) float0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short) (-2135), short0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('6');
      jsonArray0.add(character0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((short)6, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Character character0 = new Character('3');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-67));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals((-67L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Character character0 = new Character('h');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertTrue(jsonPrimitive1.isString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertFalse(jsonPrimitive1.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long(700L);
      jsonArray0.add((Number) long0);
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertFalse(jsonArray1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1);
      Short short0 = new Short((short)0);
      jsonArray0.add((Number) short0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1602.0);
      jsonArray0.add((Number) float0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(1602, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) (byte) (-11));
      int int0 = jsonArray0.getAsInt();
      assertEquals((-11), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Short short0 = new Short((short)1);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-19));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals((-19.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Float float0 = new Float(133.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(133.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Long long0 = new Long((-362L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals((-362.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add(".:W9S");
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('.', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Character character0 = Character.valueOf('2');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('2', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.$Gson$Preconditions");
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('c', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double double0 = new Double(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Byte byte0 = new Byte((byte)103);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      byte byte1 = jsonPrimitive0.getAsByte();
      assertEquals((byte)103, byte1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Float float0 = new Float(133.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte) (-123), byte0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      boolean boolean0 = jsonPrimitive0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Byte byte0 = new Byte((byte)3);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      JsonElement jsonElement0 = jsonPrimitive0.deepCopy();
      assertSame(jsonElement0, jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = jsonNull0.deepCopy();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      JsonElement jsonElement0 = jsonArray0.deepCopy();
      assertNotSame(jsonArray0, jsonElement0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.deepCopy();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      Character character0 = Character.valueOf('(');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsNumber();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.JsonPrimitive", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Pl9r#!,]");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Pl9r#!,]\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("EUL\"Q");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("GpCtMPF-jH");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsCharacter();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Not a JSON Object: ");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Not a JSON Object: \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("End of input");
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
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      Float float0 = new Float(133.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertFalse(jsonPrimitive1.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject();
      assertSame(jsonObject0, jsonObject1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.isJsonArray();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      boolean boolean0 = jsonPrimitive0.isJsonPrimitive();
      assertTrue(boolean0);
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
      assertSame(jsonNull0, jsonNull1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: {}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsJsonPrimitive();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Primitive: null
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertFalse(jsonArray1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsJsonArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Array: null
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Long long0 = new Long((-362L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsJsonObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Object: java.lang.Long@0000000004
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsShort();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
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
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsInt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
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
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
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
  public void test78()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      String string0 = jsonObject0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
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
  public void test80()  throws Throwable  {
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
  public void test81()  throws Throwable  {
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
  public void test82()  throws Throwable  {
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
  public void test83()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }
}