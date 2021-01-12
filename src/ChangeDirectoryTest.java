import org.junit.Assert;
import org.junit.Test;

public class ChangeDirectoryTest {
  @Test
  public void test_Example1()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc",cd.changePath("/","abc"));
  }

  @Test
  public void test_Example2()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc/def/ghi",cd.changePath("/abc/def","ghi"));
  }




  @Test
  public void test_Example3()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc",cd.changePath("/abc/def",".."));
  }


  @Test
  public void test_Example4()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc",cd.changePath("/abc/def","/abc"));
  }


  @Test
  public void test_Example5()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc/klm",cd.changePath("/abc/def","/abc/klm"));
  }

  @Test
  public void test_Example6()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/",cd.changePath("/abc/def","../.."));
  }


  @Test
  public void test_Example7()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/",cd.changePath("/abc/def","../../.."));
  }

  @Test
  public void test_Example8()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc/def",cd.changePath("/abc/def","."));
  }


  @Test
  public void test_Example9()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("No Such Directory exist.",cd.changePath("/abc/def","..klm"));
  }


  @Test
  public void test_Example10()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/",cd.changePath("/abc/def","//////"));
  }

  @Test
  public void test_Example11()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("No Such Directory exist.",cd.changePath("/abc/def","......"));
  }

  @Test
  public void test_Example12()
  { ChangeDirectory cd=new ChangeDirectory();
    Assert.assertEquals("/abc/klm",cd.changePath("/abc/def","../gh///../klm/."));
  }



}
