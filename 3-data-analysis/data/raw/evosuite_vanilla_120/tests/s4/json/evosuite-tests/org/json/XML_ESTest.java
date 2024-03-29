/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 16:42:10 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XML_ESTest extends XML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = XML.unescape("&xT~VUpqnC}!");
      assertEquals("&xT~VUpqnC}!", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<5b><bytes>java.lang.Byte@0000000003</bytes><5b>java.lang.Integer@0000000006</5b><empty>java.lang.Boolean@0000000009</empty></5b>", false);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(2550, (float) 2550);
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject(",vzlsnUOk!C59v<!ro");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z_*t_)<VG+|X.>#");
      try { 
        XML.toJSONObject((Reader) stringReader0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag VG+|X. at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-<!*+b8i");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((Reader) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.noSpace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = XML.toString((Object) ")?PVh:%CAR`H{.}D", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = XML.toString((Object) "", "");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("sVO;[\try63u:a`{J", false);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<~>java.lang.String@0000000005</~>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = XML.stringToValue("=C(v|m");
      assertEquals("=C(v|m", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = XML.stringToValue("#`.my^i/X~[5O");
      assertEquals("#`.my^i/X~[5O", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(1766, (long) 1766);
      // Undeclared exception!
      XML.toString((Object) jSONArray0, "a)e0Z?Nt{<");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(1766, 5208L);
      // Undeclared exception!
      XML.toString((Object) jSONArray0, (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = XML.toString((Object) null, "hh");
      assertEquals("<hh>null</hh>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = XML.toString((Object) jSONObject0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&mC(,u8rm@C`>\u0007{");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("0");
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("9U9:,EW}d6zSm<!L");
      assertEquals("9U9:,EW}d6zSm<!L", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("7tX*(Sl4V e^m:!XF");
      assertEquals("7tX*(Sl4V e^m:!XF", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("-4q Qyg.]CSs5\"KnYri");
      assertEquals("-4q Qyg.]CSs5\"KnYri", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<gom><empty>java.lang.Boolean@0000000003</empty></gom>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<#></#>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        XML.toJSONObject("<V>null<V", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 9 [character 10 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        XML.toJSONObject("<V>nullTV>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag V at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        XML.toJSONObject("><@$xzJ?a!BH*=?A{;)");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("<#/>java.lang.String@0000000001</#/>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag # at 34 [character 35 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        XML.toJSONObject("<h%qrETY /-fv?`)></h%qrETY /-fv?`)>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("[QFv6<y umz}%kT&=J", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        XML.toJSONObject("[QFv6<y umz}%kT&=J");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("<>ull</V>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Missing '>' after '<!'.>java.lang.String@0000000001</Missing '>' after '<!'.>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 65 [character 66 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.toJSONObject("<T>null</V>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched T and V at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<?`Nz_|kUrK[tM7>java.lang.String@0000000002</?`Nz_|kUrK[tM7>");
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Missing '>' after '<!'.>java.lang.String@0000000001</Missing '>' after '<!'.>");
      char[] charArray0 = new char[2];
      stringReader0.read(charArray0);
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag Missing at 60 [character 61 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-<!*+b8i");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      try { 
        XML.noSpace("Missing '>' after '<!'.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'Missing '>' after '<!'.' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      try { 
        XML.noSpace("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Empty string.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XML.noSpace("YBi8fa`<[up^A");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.unescape("&apos;");
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape("<UFHK-HgCcV>java.lang.Integer@0000000001</UFHK-HgCcV>");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.escape("Missing '>' after '<!'.");
      assertEquals("Missing &apos;&gt;&apos; after &apos;&lt;!&apos;.", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.escape("^R &bJnJB#VoR5K\"");
      assertEquals("^R &amp;bJnJB#VoR5K&quot;", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<-><bytes>java.lang.Byte@0000000003</bytes><->java.lang.Integer@0000000006</-><empty>java.lang.Boolean@0000000009</empty></->");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<~><bytes>java.lang.Byte@0000000003</bytes><empty>java.lang.Boolean@0000000006</empty></~>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = XML.toString((Object) "Missing '>' after '<!'.");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "-");
      String string0 = XML.toString((Object) jSONObject0, "-");
      assertNotNull(string0);
  }
}
