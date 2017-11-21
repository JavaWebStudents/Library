package com.zime.maven.test;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.UUID;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zime.maven.dao.BmMapper;
import com.zime.maven.dao.InfoMapper;
import com.zime.maven.entity.Bm;
import com.zime.maven.entity.Info;
import com.zime.maven.service.BmService;
import com.zime.maven.service.InfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private BmMapper bmMapper;
	@Autowired
	private InfoMapper infoMapper;
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private BmService bmService;
	@Autowired
	private InfoService infoService;
	
	@Test
	public void test() {
		DataSource dataSource=applicationContext.getBean(DataSource.class);
		System.out.println(dataSource);
	}
	
	@Test
	public void testAddBm() {
		bmMapper.insertSelective(new Bm(null,"都市小说"));
	}
	
	@Test
	public void testAddBook() throws Exception {
		//时间格式转换，在这边没使用到
		/*SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		simpleDateFormat.setLenient(false);*/
		Info book_info=new Info(null, "钢铁是怎样炼成的", "AS000000", "123", "123", "fwefwe", 5, 3);
		infoMapper.insertSelective(book_info);
	}
	
	@Test
	public void testAddStudens() throws Exception {
		InfoMapper mapper=sqlSession.getMapper(InfoMapper.class);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		simpleDateFormat.setLenient(false);
		Random random=new Random();
		for(int i=0;i<50;i++) {
			String bookName=UUID.randomUUID().toString().substring(0,5)+i;
			Info book=new Info(null,bookName,"342", "2312","asdas", "姜洋",random.nextInt(3)+1,random.nextInt(3)+1);
			mapper.insertSelective(book);
		}
		
	}
	
	@Test
	public void testGetBm() {
		System.out.println(bmService.getAll());
	}
	
	@Test
	public void testGetBook() {
		System.out.println(infoService.getAll());
	}
	
	@Test
	public void testInfo() {
		infoMapper.selectByPrimaryKey(1);
	}

}
