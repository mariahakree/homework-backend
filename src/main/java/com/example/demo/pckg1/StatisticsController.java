package com.example.demo.pckg1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

	@Autowired
	private Parent_repository parentRepository;
	@Autowired
	private KidRepository kidRepository;
	@Autowired
	private CategoryRepository categoryrepo;
	@Autowired
	private CourseRepository courserepo;
	@Autowired
	private MeetingRepository meetingRepo;
	
	
	//STUB
	@PostMapping("/initializeDB")
	public String initDB(){
		
		String[] FirstNames ={ "Mariah", "Yael", "Avital", "Mutlaq", "Dani", "Yossi"};
        String[] gmail ={ "Mariah@gmail.com", "Yael@gmail.com", "Avital@gmail.com",  "Mutlaq@gmail.com", "Dani@gmail.com","Yossi@gmail.com"};
        String[] pass ={ "Mariah!", "Yael12","Avital12",  "Mutlaq@12", "Dani12","Yossi12"};
//        String sDate1="21/08/2021";
//        String sDate2="1/02/2021";
//        String sDate3="1/08/2021";
//        String sDate4="1/08/2020";
//        String sDate5="1/07/2021";
//        String sDate6="23/08/2021";
//
//
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
//        Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//        Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(sDate4);
//        Date date5=new SimpleDateFormat("dd/MM/yyyy").parse(sDate5);
//        Date date6=new SimpleDateFormat("dd/MM/yyyy").parse(sDate6);
//        Date[] date={date1,date2,date3,date4,date5,date6};
        for (int i=0;i<30;i++){
        	 int j = (int)(Math.random() * 6);
            Parent p = new Parent(FirstNames[j],"050505050", gmail[j],pass[j]);
            parentRepository.addNewParent(p);
        }
         
        for (int i=0;i<30;i++){
        	int j = (int)(Math.random() * 6);
            Kid k = new Kid(FirstNames[j], Gender.Boy);
            kidRepository.addKid(k);
        }

		Parent new_parent = new Parent("my parent5","0541234567","ofraberendorf@gmail.com","ofraberendorf");
		Parent new_parent1 = parentRepository.addNewParent(new Parent("parentparent","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
		
		Parent new_parent2 = new Parent("my parent4","0541234567","ofraberendorf@gmail.com","ofraberendorf");
		Parent new_parent3 = parentRepository.addNewParent(new Parent("yaelyael","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
		
		Parent new_parent4 = new Parent("my parent3","0541234567","ofraberendorf@gmail.com","ofraberendorf");
		Parent new_parent5 = parentRepository.addNewParent(new Parent("mutlaqlaq","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
		
		Parent new_parent6 = new Parent("my parent2","0541234567","ofraberendorf@gmail.com","ofraberendorf");
		Parent new_parent7 = parentRepository.addNewParent(new Parent("avitalavitalparent","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
		

		Parent new_parent60 = new Parent("my parent1","0541234567","ofraberendorf@gmail.com","ofraberendorf");
		Parent new_parent70 = parentRepository.addNewParent(new Parent("avitalavitalparent","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
		
		
		Parent new_parent8 = parentRepository.changeStatus(new_parent5.getId());
		Parent new_parent9 = parentRepository.changeStatus(new_parent7.getId());
		Parent new_parent10 = parentRepository.changeStatus(new_parent1.getId());

		Parent newParent= parentRepository.changeActiveDate(new_parent3.getId(), new Date(1,9,2020));
				
		Course new_course10 = new Course("Avital's space",new Date(1,1,2021), new Date(1,1,2022),Day.Wednesday);
		Course new_course20 = new Course("Avital's art",new Date(2,5,2020), new Date(3,8,2021),Day.Saturday);
		Course new_course30 = new Course("Avital's music",new Date(1,5,2021), new Date(5,5,2021),Day.Wednesday);
		Course new_course40 = new Course("yaels music",new Date(1,10,2021), new Date(5,12,2021),Day.Wednesday);
		Course new_course50 = new Course("sciencefunn music",new Date(1,11,2020), new Date(5,5,2021),Day.Wednesday);


		Category new_category10 = new Category("Space");
		Category new_category20 = new Category("Art");
		Category new_category30 = new Category("Animal");
		Category new_category40 = new Category("music");
		Category new_category50 = new Category("science");

		Category new_category1=categoryrepo.createCategory(new_category10);
		Category new_category2=categoryrepo.createCategory(new_category20);
		Category new_category3=categoryrepo.createCategory(new_category30);
		Category new_category4=categoryrepo.createCategory(new_category40);
		Category new_category5=categoryrepo.createCategory(new_category50);



		//Course new_course1 = new Course("reem's art",new Date(2,5,1999), new Date(3,1,2000) ,Day.Monday);

		
		//new categort2
		//Category new_category2 = new Category("Space","spaceImage");
		//Category new_category3=categoryRepo.createCategory(new_category2);
		
		//Course new_course2=courseRepository.addANew_Course(new_course, new_category1.getId());
		Meeting new_meeting11 = new Meeting(new_course10.getID(),new Date(1,1,2021));
		Meeting new_meeting22 = new Meeting(new_course20.getID(),new Date(2,2,2021));
		Meeting new_meeting33 = new Meeting(new_course30.getID(),new Date(1,4,2021));
		Meeting new_meeting44 = new Meeting(new_course40.getID(),new Date(6,7,2021));


		//connect
		Course new_course3=courserepo.addANew_Course(new_course10, new_category1.getId());
		Course new_course4=courserepo.addANew_Course(new_course20, new_category2.getId());
		Course new_course5=courserepo.addANew_Course(new_course30, new_category3.getId());
		Course new_course6=courserepo.addANew_Course(new_course40, new_category4.getId());
		Course new_course7=courserepo.addANew_Course(new_course50, new_category5.getId());


//		Meeting new_meeting1= new Meeting(new_course3.getID(),new Date(0));
		
		
		Meeting meeting111= meetingRepo.addNewMeeting(new_meeting11);
		Meeting meeting122= meetingRepo.addNewMeeting(new_meeting22);	
		Meeting meeting133= meetingRepo.addNewMeeting(new_meeting33);
		Meeting meeting244= meetingRepo.addNewMeeting(new_meeting44);
		
		
		Kid new_kid1 = new Kid("mohammed", Gender.Boy);
		Kid new_kid2 = new Kid("yael", Gender.Girl);
		Kid new_kid3 = new Kid("mutlaq", Gender.Boy);
		Kid new_kid4 = new Kid("yoni", Gender.Boy);
		
		parentRepository.addKid(new_parent8.getId(), new_kid2);
		parentRepository.addKid(new_parent9.getId(), new_kid3);
		parentRepository.addKid(new_parent10.getId(), new_kid4);

		Kid addedKid=parentRepository.addKid(newParent.getId(), new_kid1);
		kidRepository.changeStatus(addedKid.getId());

		
		courserepo.addKidToCourse(new_course3.getID(), new_kid1.getId() );
		courserepo.addKidToCourse(new_course4.getID(), new_kid1.getId() );
		courserepo.addKidToCourse(new_course5.getID(), new_kid2.getId() );
		courserepo.addKidToCourse(new_course6.getID(), new_kid3.getId() );
		courserepo.addKidToCourse(new_course7.getID(), new_kid4.getId() );
		
		courserepo.addKidToCourse(new_course3.getID(), new_kid1.getId() );

		

		return "ALL GOOD";
	}
	
	//getting ALL ACTIVE parents
	@GetMapping("getallactiveparents")
	public List<Parent> getAllParents(){
		return parentRepository.getAllActiveparents();
	}
	
	//getting ALL ACTIVE parents NUMBER
	@GetMapping("getallactiveparentsnumber")
	public int getAllActiveParentsNumber(){
		return (int)(parentRepository.getAllActiveparents()).size();
	}
	
	//getting ALL ACTIVE parents by WEEK
	@GetMapping("getallactiveparentsbyweek/{number}")
	public HashMap<String, Integer> getAllActiveParentsByWeek(){
		return parentRepository.getNewParents(1);
	}
	
	//getting ALL ACTIVE parents by MONTH
	@GetMapping("getallactiveparentsbymonth/{number}")
	public HashMap<String, Integer> getAllActiveParentsByMonth(){
		return parentRepository.getNewParents(2);
	}
	
	//getting ALL ACTIVE parents by YEAR
	@GetMapping("getallactiveparentsbyyear/{number}")
	public HashMap<String, Integer> getAllActiveParentsByYear(){
		return parentRepository.getNewParents(3);
	}
	
	//getting PERCENT ACTIVE parents by WEEK
	@GetMapping("getpercentactiveparentsbyweek/{number}")
	public Integer getPercentActiveParentsByWeek(){
		HashMap<String, Integer>Activeparents= getAllActiveParentsByWeek();
		double totalparents,activeparents;
		totalparents=Activeparents.get("totalParents").doubleValue();
		activeparents=Activeparents.get("New Parents").doubleValue();
		return ((int)((activeparents/totalparents)*100));
	}
	
	//getting PERCENT ACTIVE parents by MONTH
	@GetMapping("getpercentactiveparentsbymonth/{number}")
	public Integer getPercentActiveParentsByMonth(){
		
		HashMap<String, Integer>Activeparents= getAllActiveParentsByMonth();
		double totalparents,activeparents;
		totalparents=Activeparents.get("totalParents").doubleValue();
		activeparents=Activeparents.get("New Parents").doubleValue();
		return ((int)((activeparents/totalparents)*100));	}
	
	//getting PERCENT ACTIVE parents by YEAR
	@GetMapping("getpercentactiveparentsbyyear/{number}")
	public Integer getPercentActiveParentsByYear(){
		
		HashMap<String, Integer>Activeparents= getAllActiveParentsByYear();
		double totalparents,activeparents;
		totalparents=Activeparents.get("totalParents").doubleValue();
		activeparents=Activeparents.get("New Parents").doubleValue();
		return ((int)((activeparents/totalparents)*100));
	}
	
	//=========================================
	
	//getting ALL ACTIVE kids by WEEK
	@GetMapping("getallactivekidsbyweek/{number}")
	public HashMap<String, Integer> getAllActiveKidsByWeek(){
	return kidRepository.getNewKids(1);
	}
	
	//getting ALL ACTIVE kids by MONTH
	@GetMapping("getallactivekidsbymonth/{number}")
	public HashMap<String, Integer> getAllActiveKidsByMonth(){
	return kidRepository.getNewKids(2);
	}
	
	//getting ALL ACTIVE kids by YEAR
	@GetMapping("getallactivekidsbyyear/{number}")
	public HashMap<String, Integer> getAllActiveKidsByYear(){
	return kidRepository.getNewKids(3);
	}
	
	
	//getting ALL kids INCLUDED NOT ACTIVE
	@GetMapping("getallactivekids")
	public List<Kid> getAllKids(){
	return kidRepository.getAllKids();
	}
	
	//getting ALL ACTIVE kids NUMBER
	@GetMapping("getallactivekidsnumber")
	public double getAllActiveKidsNumber(){
		List<Kid> temp= getAllKids();
		double counter=0;
		for(Kid kid: temp) {
			if(kid.getStatus().equals(Status.Active))
			{
				counter++;
			}
		}
		return counter;
	}
	
	//getting PERCENT ACTIVE kids by WEEK
	@GetMapping("getpercentactivekidsbyweek/{number}")
	public int getPercentActiveKidsByWeek(){
		
		HashMap<String, Integer>Activekids= getAllActiveKidsByWeek();
		double totalkid,activekid;
		totalkid=Activekids.get("totalKids").doubleValue();
		activekid=Activekids.get("New Kids").doubleValue();
		return ((int)((activekid/totalkid)*100));
	}
	
	//getting PERCENT ACTIVE kids by MONTH
	@GetMapping("getpercentactivekidsbymonth/{number}")
	public Integer getPercentActiveKidsByMonth(){
		HashMap<String, Integer>Activekids= getAllActiveKidsByMonth();
		double totalkid,activekid;
		totalkid=Activekids.get("totalKids").doubleValue();
		activekid=Activekids.get("New Kids").doubleValue();
		return ((int)((activekid/totalkid)*100));
	}
	
	//getting PERCENT ACTIVE kids by YEAR
	@GetMapping("getpercentactivekidssbyyear/{number}")
	public Integer getPercentActiveKidsByYear(){
		HashMap<String, Integer>Activekids= getAllActiveKidsByYear();
		double totalkid,activekid;
		totalkid=Activekids.get("totalKids").doubleValue();
		activekid=Activekids.get("New Kids").doubleValue();
		return ((int)((activekid/totalkid)*100));}
	//===============================================
	
	
	//get all active kids by category by week
	//@GetMapping("getlistofactivekidspercategoryperweek/{number}")
	//public HashMap<String, Integer> getActiveKidsOfCategoryByWeek()
	//{
	//	return categoryrepo.getKidsCountByCategory(1);
	//}
	
	//get all active kids by category by month
	//@GetMapping("getlistofactivekidspercategorypermonth/{number}")
	//public HashMap<String, Integer> getActiveKidsOfCategoryByMonth()
	//{
		//return categoryrepo.getKidsCountByCategory(2);
	//}
	
	//get all active kids by category
	@GetMapping("getlistofactivekidspercategory/{number}")
	public HashMap<String, Integer> getActiveKidsOfCategory()
	{
		return kidRepository.getKidsByCategories();
	}
	//get all activities in hour per year
		@GetMapping("getlistofactivekidspercategoryperyear/{number}")
		public HashMap<String,Integer[]> getKidsByCategoriesPeryear()		
		{
			return kidRepository.getKidsByCategoriesPerPeriod(3);
		}
		@GetMapping("getlistofactivekidspercategorypermonth/{number}")
		public HashMap<String,Integer[]> getKidsByCategoriesPermonth()		
		{
			return kidRepository.getKidsByCategoriesPerPeriod(2);
		}
		
		@GetMapping("getlistofactivekidspercategoryperweek/{number}")
		public HashMap<String,Integer[]> getKidsByCategoriesPerweek()		
		{
			return kidRepository.getKidsByCategoriesPerPeriod(1);
		}
		
		
	
	

	//get all activities in hour per week
	@GetMapping("getactivitiesperweek/{number}")
	public HashMap<String, Double> getActivitiesInHoursPerWeek()
	{
		return meetingRepo.getActivityTime(1);
	}
	
	//get all activities in hour per month
	@GetMapping("getactivitiespermonth/{number}")
	public HashMap<String, Double> getActivitiesInHoursPerMonth()
	{
		return meetingRepo.getActivityTime(2);
	}
	
	//get all activities in hour per year
	@GetMapping("getactivitiesperyear/{number}")
	public HashMap<String, Double> getActivitiesInHoursPerYear()
	{
		return meetingRepo.getActivityTime(3);
	}
	
	
}
