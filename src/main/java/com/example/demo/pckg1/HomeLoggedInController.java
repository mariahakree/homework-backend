//package com.example.demo.pckg1;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeLoggedInController {
//	@Autowired
//	private Parent_repository parentRepository;
//	@Autowired
//	private MeetingRepository meetingRepository;
//	@Autowired
//	private KidRepository kidRepo;
//	@Autowired
//	private CourseRepository courseRepository;
//	@Autowired
//	private CategoryRepository categoryRepo;
//	@Autowired
//	private MeetingRepository meetingRepo;
//	
//	@PostMapping("/initializeparent")
//	public Kid returnallparentlist(){
//		
//		
////		Calendar cal = Calendar.getInstance();
////		cal.set(Calendar.YEAR, 1988);
////		cal.set(Calendar.MONTH, Calendar.JANUARY);
////		cal.set(Calendar.DAY_OF_MONTH, 1);
////		Date dateRepresentation = cal.getTime();
////		
////		Calendar cal1 = Calendar.getInstance();
////		cal.set(Calendar.YEAR, 2000);
////		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
////		cal.set(Calendar.DAY_OF_MONTH, 8);
////		Date dateRepresentation1 = cal.getTime();
////		
////		Calendar cal2 = Calendar.getInstance();
////		cal.set(Calendar.YEAR, 2021);
////		cal.set(Calendar.MONTH, Calendar.JANUARY);
////		cal.set(Calendar.DAY_OF_MONTH,30);
////		Date dateRepresentation2 = cal.getTime();
////		
////		Calendar cal3 = Calendar.getInstance();
////		cal.set(Calendar.YEAR, 2022);
////		cal.set(Calendar.MONTH, Calendar.JANUARY);
////		cal.set(Calendar.DAY_OF_MONTH,15);
////		Date dateRepresentation3 = cal.getTime();
////		
////		Calendar cal4 = Calendar.getInstance();
////		cal.set(Calendar.YEAR, 2019);
////		cal.set(Calendar.MONTH, Calendar.MARCH);
////		cal.set(Calendar.DAY_OF_MONTH,9);
////		Date dateRepresentation4 = cal.getTime();
////		
////		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
////		Date starting= simpleDateFormat2.parse(startTime);
//		
////		Parent new_parent = new Parent("dffddf dfdfd","0541234567","ofraberendorf@gmail.com","ofraberendorf");
//		Parent new_parentrepo = parentRepository.addNewParent(new Parent("dffddf dfdfd","0541234567","ofraberendorf@gmail.com","ofraberendorf"));
//		Course new_course = new Course("Avital's space",new Date(), new Date(),Day.Wednesday);
//		Category new_category = new Category("Space","spaceImage");
//		Category new_category1=categoryRepo.createCategory(new_category);
//		
//		//Date mtDate= new StringToDate.main("12/12/12";)
//		
//		
//		//new course2
//		Course new_course1 = new Course("reem's art",new Date(), new Date() ,Day.Monday);
//
//		
//		//new categort2
//		Category new_category2 = new Category("Space","spaceImage");
//		Category new_category3=categoryRepo.createCategory(new_category2);
//		
//		Course new_course2=courseRepository.addANew_Course(new_course, new_category1.getId());
//		Meeting new_meeting = new Meeting(new_course2.getID(),new Date());
//		
//		
//		//connect
//		Course new_course3=courseRepository.addANew_Course(new_course1, new_category3.getId());
//		Meeting new_meeting1= new Meeting(new_course3.getID(),new Date(0));
//		
//		
//		Meeting meeting1= meetingRepo.addNewMeeting(new_meeting);
//		
//		Meeting meeting2= meetingRepo.addNewMeeting(new_meeting1);
//		
//		Kid new_kid = new Kid("mohammed", new Date(0), Gender.Boy);
//		Kid new_kid1 = parentRepository.addKid(new_parentrepo.getId(), new_kid);
//		
//		//Kid kid= kidRepo.addNewKid(new_kid);
//		Kid temp = parentRepository.addKidToCourse (new_parentrepo.getId(), new_kid1.getId(), new_course2.getID());
//		temp= parentRepository.addKidToCourse (new_parentrepo.getId(), new_kid1.getId(), new_course3.getID());
//		
//		//		addCourse(new_course.getID());
//		//new_parentrepo1.addKid(new_kid.getId());
//
//		
//	//	return parentRepository.getAllParents();
//		return temp; 
//		//return new_parentrepo;  
//		//return parentRepository.GetAllKidsOfParent(new_parent.getId());
//	}
//	
//
//	
//	
//	
//	@GetMapping("getkidslistbyparent/{id}")
//	public List<Kid> getAllKidsOfParent(@PathVariable String id){
//		return parentRepository.GetAllKidsOfParent(id);
//	}
//	
//	
//	//GET ALL kids ACTIVE courses
////	@GetMapping("getkidscourses/{id}")
////	public List<Course> getAllKidsActiveCourses(@PathVariable String id){
////		List<Kid> kidsList= getAllKidsOfParent(id);
////		List<Course> courses= new ArrayList();
////		for(Kid kid: kidsList)
////		{
////			List<String> temp= kid.getActiveCourses();
////			for(String string: temp)
////			{
////				courses.add(courseRepository.findCourseByID(string));
////			}
////		}
////		return courses;
////	}
//	
//	
////	//GET ALL kids FINISHED courses
////	@GetMapping("getkidsfinishedcourses/{id}")
////	public List<Course> getAllKidsFinishedCourses(@PathVariable String id){
////		List<Kid> kidsList= getAllKidsOfParent(id);
////		List<Course> courses= new ArrayList();
////		for(Kid kid: kidsList)
////		{
////			List<String> temp= kid.getCompletedCourses();
////			for(String string: temp)
////			{
////				courses.add(courseRepository.findCourseByID(string));
////			}
////		}
////		return courses;
////	}
//	
//	//GET all FINISHED courses SORTED
//	@GetMapping("getkidsfinishedcoursessortedlist/{id}")
//	public List<Meeting> getAllKidsFinishedCoursesSorted(@PathVariable String id){
//		List<Course> temp= getAllKidsFinishedCourses(id);
//		List<Meeting> meetings= new ArrayList();
//		if(!temp.isEmpty())
//		{
//
//			for(Course course: temp)
//			{
//				List<Meeting> tempMeeting= new ArrayList();
//				tempMeeting=meetingRepository.getAllCourseMeetings(course.getID());
//				if(!tempMeeting.isEmpty())
//				{
//					for(Meeting meeting: tempMeeting)
//					{
//						meetings.add(meeting);
//					}
//				}
//			}
//		}
//		
//		Collections.sort(meetings);
//		return meetings;
//	}
//	
//	//GET all Active courses SORTED
//	@GetMapping("getkidsactivecoursessortedlist/{id}")
//	public List<Meeting> getAllKidsActiveCoursesSorted(@PathVariable String id){
//		List<Course> temp= getAllKidsActiveCourses(id);
//		List<Meeting> meetings= new ArrayList();
//		if(!temp.isEmpty()) {
//			for(Course course: temp)
//			{
//				List<Meeting> tempMeeting= new ArrayList();
//				System.out.println (course.getID());
//				tempMeeting=meetingRepository.getAllCourseMeetings(course.getID());
//				if(!tempMeeting.isEmpty())
//				{
//					for(Meeting meeting: tempMeeting){
//					meetings.add(meeting);}
//				}	
//			}
//		}
//
//		Collections.sort(meetings);
//		return meetings;
//	}
//}