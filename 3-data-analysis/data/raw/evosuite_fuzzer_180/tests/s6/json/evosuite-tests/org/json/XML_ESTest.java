/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 14:43:55 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
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
      Object object0 = XML.stringToValue("99");
      assertEquals(99, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.escape("' contains a space character.");
      assertEquals("&apos; contains a space character.", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("{\"fruit\":-99,\"size\":null,\"color\":\"Red\",\"value\":false,\"value2\":false,\"number\":\"'rcmg[5k)q\"}", true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<tull>null</tull>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      JSONArray jSONArray0 = new JSONArray((Collection<?>) linkedList0);
      jSONArray0.put(1716, (Collection<?>) linkedList0);
      // Undeclared exception!
      XML.toString((Object) jSONArray0, "iev_{)");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("missing '>' after '<!'.", true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject("e<'JO2|:(2&#;@qXnp>", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w9%.tETU< LOl-n(W,");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 19 [character 20 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      String string0 = XML.toString(object0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = XML.toString((Object) null, "tull");
      assertEquals("<tull>null</tull>", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "c(h^<SFZ|e}Bp{E!");
      String string0 = XML.toString((Object) jSONObject0, "CDT");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("sK|L@'}I&|QE");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<tull>null</tull>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = XML.stringToValue("org.json.XML");
      assertEquals("org.json.XML", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = XML.stringToValue("&_z@&$N_");
      assertEquals("&_z@&$N_", object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<S6><S6>java.lang.Integer@0000000008</S6><iyQ%.6h>>java.util.HashMap@0000000011</iyQ%.6h>></S6>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(395.265F);
      String string0 = XML.toString((Object) jSONArray0, "&_z@&$^BO");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(1299.0F);
      String string0 = XML.toString((Object) jSONArray1, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = XML.toString((Object) null);
      assertEquals("\"null\"", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("0");
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("000");
      assertEquals("000", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("5es1fh=l!v8qxj8%]!");
      assertEquals("5es1fh=l!v8qxj8%]!", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("5.j|2J{%72$}^TG)~N");
      assertEquals("5.j|2J{%72$}^TG)~N", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("5ES1FH=L!V8qXJ8%]!");
      assertEquals("5ES1FH=L!V8qXJ8%]!", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<S6><S6>java.lang.Integer@0000000008</S6></S6>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<CDT><bytes>java.lang.Byte@0000000003</bytes><bytes>java.lang.Byte@0000000006</bytes><bytes>java.lang.Byte@0000000009</bytes><bytes>java.lang.Byte@0000000012</bytes><bytes>java.lang.Byte@0000000015</bytes><bytes>java.lang.Byte@0000000018</bytes><bytes>java.lang.Byte@0000000021</bytes><bytes>java.lang.Byte@0000000024</bytes><bytes>java.lang.Byte@0000000027</bytes><bytes>java.lang.Byte@0000000030</bytes><bytes>java.lang.Byte@0000000033</bytes><bytes>java.lang.Byte@0000000036</bytes><bytes>java.lang.Byte@0000000039</bytes><bytes>java.lang.Byte@0000000042</bytes><bytes>java.lang.Byte@0000000045</bytes><bytes>java.lang.Byte@0000000048</bytes><empty>java.lang.Boolean@0000000051</empty></CDT>", true);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject(".8{<Qwj/p*S~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<\"3=j!akv~u6`n>java.lang.string@0000000001</\"3=j!akv~u6`n>");
      try { 
        XML.toJSONObject((Reader) stringReader0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 50 [character 51 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("<\"3=j!aKV~u6`N>java.lang.String@000000000</\"3=!aKV~u6`N>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing value at 48 [character 49 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        XML.toJSONObject("<\"3=j.aKV~Pu6`N>java.lang.String@0000000003</\"3=j.aKV~Pu6`N>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag 3=j.aKV~Pu6`N>java.lang.String@0000000003</ at 62 [character 63 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject(":w{$5m05L<=mfqK47k");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        XML.toJSONObject("<unable to write jsonobject value for key: >java.lang.string@0000000004</unable to write jsonobject value for key: >");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 83 [character 84 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.toJSONObject("<og7 >java.io.datainputstream@0007H0000</og:7 >");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched og7 and og:7 at 46 [character 47 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<v></v>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XML.noSpace("org.json.XML");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      try { 
        XML.noSpace("f< ^<1,j`:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'f< ^<1,j`:' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.unescape("1H5O*!DKJ&,Y%F`Z_+");
      assertEquals("1H5O*!DKJ&,Y%F`Z_+", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.unescape("&apos;");
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape("tull");
      assertEquals("t&#x7f;ull", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.escape("J*v<hu/S{5Z'En?");
      assertEquals("J*v&lt;hu/S{5Z&apos;En?", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.escape("8\"51|fB!K3mA>?(T&Wq");
      assertEquals("8&quot;51|fB!K3mA&gt;?(T&amp;Wq", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("D");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        XML.toJSONObject("<-/>java.lang.Object@0000000001</-/>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag - at 34 [character 35 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^fm~oSN)pf[h2<?aD");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "<unable o write jsonobject value for key: >java.lng.string@0000000004</unable to wrHte jsonobject value for2key: >");
      String string0 = XML.toString((Object) jSONObject0);
      String string1 = XML.toString((Object) jSONObject0);
      assertTrue(string1.equals((Object)string0));
  }
}
