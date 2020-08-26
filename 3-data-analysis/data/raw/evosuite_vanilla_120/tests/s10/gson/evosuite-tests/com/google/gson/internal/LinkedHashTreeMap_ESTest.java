/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 19:09:59 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      String string0 = linkedHashTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<Integer, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, LinkedHashTreeMap<Integer, Integer>>();
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, String>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.get(linkedHashTreeMap1);
      assertEquals(0, linkedHashTreeMap1.size());
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.findByObject("");
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      linkedHashTreeMap0.find("", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.find("", true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedHashTreeMap<String, Object>>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = linkedHashTreeMap0.containsKey(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Integer, Map.Entry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<String, String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>((Comparator<? super Object>) null);
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedHashTreeMap<String, Object>>();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(integer0, linkedHashTreeMap0);
      LinkedHashTreeMap<String, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.put(abstractMap_SimpleImmutableEntry0, linkedHashTreeMap2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Integer>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove("");
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Integer integer0 = new Integer(12);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_KeySet0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node1);
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "1r L", (-1376), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      assertFalse(linkedHashTreeMap_Node1.equals((Object)linkedHashTreeMap_Node0));
      
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(2, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 5);
      LinkedHashTreeMap.Node<Object, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(10, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(936);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, 2791, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>();
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>(linkedHashTreeMap_Node1, abstractMap_SimpleEntry0, (-1399), linkedHashTreeMap_Node2, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node3.equals(linkedHashTreeMap_Node1);
      assertFalse(linkedHashTreeMap_Node1.equals((Object)linkedHashTreeMap_Node3));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("E,!1Jme(2K^<>N+`<", "l2d'c?+T");
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-407), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
      
      String string0 = linkedHashTreeMap_Node1.toString();
      assertEquals("{}=null", string0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      Set<Map.Entry<String, AbstractMap.SimpleImmutableEntry<String, String>>> set0 = (Set<Map.Entry<String, AbstractMap.SimpleImmutableEntry<String, String>>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>>();
      Integer integer0 = new Integer((-1996));
      LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>>(linkedHashTreeMap_Node0, integer0, (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap<Integer, Map.Entry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<String, String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.find(linkedHashTreeMap0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer((-2238));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, String>();
      linkedHashTreeMap0.put(integer0, linkedHashTreeMap1);
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap2 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap2.new EntrySet();
      linkedHashTreeMap0.put(integer0, linkedHashTreeMap_EntrySet0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      linkedHashTreeMap0.put(integer0, (Object) null);
      linkedHashTreeMap0.put(integer0, (Object) null);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object>();
      Object object0 = new Object();
      linkedHashTreeMap0.remove(object0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(2450);
      linkedHashTreeMap0.putIfAbsent(integer0, integer0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((String) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      Integer integer0 = new Integer((-1214));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge("", integer0, biFunction0);
      linkedHashTreeMap0.entrySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(2, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Integer>();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Map.Entry<String, String>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(integer0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = linkedHashTreeMap_Node1.setValue(abstractMap_SimpleEntry0);
      assertNull(abstractMap_SimpleEntry1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "H", 4693, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node1);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node2, "H", 0, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>(comparator0);
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap2 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleImmutableEntry<Object, String>, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleImmutableEntry<Object, String>, String>();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object> linkedHashTreeMap3 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object>();
      Object object0 = new Object();
      Object object1 = linkedHashTreeMap3.remove(object0);
      assertNull(object1);
  }
}