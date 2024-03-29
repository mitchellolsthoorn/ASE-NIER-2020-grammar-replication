/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 15:50:04 GMT 2020
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
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      String string0 = linkedHashTreeMap0.put(">g8sLm;7'", ">g8sLm;7'");
      assertNull(string0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet1 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap0.entrySet();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node1, (String) null, 0, linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node1, (String) null, 16, linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      Comparator<Map.Entry<String, Object>> comparator1 = Map.Entry.comparingByKey();
      Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String> linkedHashTreeMap2 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String>(comparator2);
      boolean boolean0 = linkedHashTreeMap2.containsKey(comparator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = linkedHashTreeMap_Node0.setValue(integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Integer integer0 = linkedHashTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = linkedHashTreeMap_Node0.getKey();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, LinkedHashTreeMap<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, LinkedHashTreeMap<String, String>>();
      Integer integer0 = new Integer((-1779));
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      linkedHashTreeMap0.size = 1;
      Set<AbstractMap.SimpleEntry<Object, Object>> set0 = linkedHashTreeMap0.keySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      linkedHashTreeMap0.size = (-845);
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertEquals((-845), set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>();
      linkedHashTreeMap0.get("");
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, String>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, String>, String>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_AvlBuilder0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap0, "6dX,_8&61:");
      linkedHashTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>) null, false);
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
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.get("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
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
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, LinkedHashTreeMap<Integer, String>>, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, Integer>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, Integer>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, Integer>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>();
      LinkedHashTreeMap.Node<Integer, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
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
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.reset(4);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>();
      LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>(linkedHashTreeMap_Node0, "", 714, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Map.Entry<String, Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(8, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(4, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      Integer integer0 = new Integer(1427);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>(" is not Comparable", integer0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 2485, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "", 7, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "AkCL91zMr", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>((LinkedHashTreeMap.Node<String, Integer>) null, "LFT6Dz0t`", 358, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      Set<Integer> set0 = linkedHashTreeMap0.keySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>(comparator0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>> set0 = (Set<Map.Entry<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Integer, Object>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      Integer integer0 = new Integer(1427);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>(" is not Comparable", integer0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 2485, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap1.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0.prev);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Object>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.find("", true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, Object>, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      linkedHashTreeMap_NodeArray0[3] = linkedHashTreeMap_NodeArray0[0];
      linkedHashTreeMap1.table = linkedHashTreeMap_NodeArray0;
      linkedHashTreeMap1.remove((Object) linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap0.put(">g8sLm;7'", ">g8sLm;7'");
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<String, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<String, String>, Object>((Comparator<? super Map.Entry<String, String>>) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Map.Entry<String, String>) null, "com.google.gson.internal.LinkedHashTreeMap$LinkedTreeMapIterator");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>, Map.Entry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>, Map.Entry<Object, Integer>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, String>();
      Integer integer0 = new Integer(560);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedHashTreeMap2, integer0);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Integer>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(abstractMap_SimpleEntry1);
      AbstractMap.SimpleImmutableEntry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>(linkedHashTreeMap1, abstractMap_SimpleImmutableEntry0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry1, abstractMap_SimpleEntry1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, String>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, String>, String>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap_AvlBuilder0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap1, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Integer integer0 = new Integer(0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedHashTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.threshold = (-1130);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$AvlIterator", true);
      assertNotNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>, String>((Comparator<? super Map.Entry<LinkedHashTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>>) null);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }
}
