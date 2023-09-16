package OOP_Homework3.Book;

import java.util.Scanner;

public class BookTest {

  public static void main(String[] args) throws InterruptedException {
    MyBook myFirstBook = new MyBook();


    myFirstBook.setTitle("My Grandmother Asked Me to Tell You She's Sorry");
    myFirstBook.setAuthor("Fredrik Backman");

    myFirstBook.setPrice(13.00);
    System.out.println();
    myFirstBook.display();


    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] bookInfo = input.split(", ");
  while (!input.equals("Stop")){
    Book readbook=new MyBook(bookInfo[0], bookInfo[1], Double.parseDouble(bookInfo[2]));
    readbook.display();
    input= scanner.nextLine();
    bookInfo=input.split(", ");
    }
  }

    //Thread.sleep(1000);

  }



/*Създайте клас BookTest който чете книги от конзолата
 (преценете кога да спре четенето) и след това извежда книгите в конзолата

 Book Name	Authors Name
‘The India Story’, Bimal Jalal, 15.00
‘Listen to Your Heart: The London Adventure’, Ruskin Bond, 12.32
‘Business of Sports: The Winning Formula for Success’, Vinit Karnik, 52.32
‘A Place Called Home’,	Preeti Shenoy,24.23
‘Modi @20: Dreams Meeting Delivery’,	VP Venkaiah Naidu,23.45
'The Struggle for Police Reforms in India',	Ex-IPS Prakash Singh, 32.3
‘INDO-PAK WAR 1971- Reminiscences of Air Warriors’,	Rajnath Singh, 13.23
‘Leaders & Politicians & Citizens’,	Rasheed Kidwai, 15.12
“Crunch Time: Narendra Modi’s National Security Crises”,	Dr Sreeram Chauliahas, 13.23
“Queen of Fire”,	Devika Rangachari, 26.64
“Birsa Munda – Janjatiya Nayak”,	Dharmendra Pradhan, 14.15
“Decoding Indian Babudom”,	Ashwini Shrivastava, 15.14
‘The Maverick Effect’,	Harish Mehta,15.9
“Tiger of Drass: Capt. Anuj Nayyar 23 Kargil Hero”,	Meena Nayyar & Himmat Singh Shekhawat, 12.9
‘Hear Yourself’,	Indian Author Prem Rawat, 13.9
‘Not Just A Nightwatchman: My Innings with BCCI’,	Former CAG Vinod Rai, 13.3
“The Boy Who Wrote a Constitution ”,	Rajesh Talwar, 18.15
“My Research Works on Sikh History and Philosophy”,	Avinash Khemka & Abinash Mahapatra, 15.16
‘Chinese Spies: From Chairman Mao to Xi Jinping’,	Roger Faligot, 13.12
'Amit Shah Ani Bhajapachi Vatchal',	Dr Anirban Ganguly and Shiwanand Dwivedi, 16.54
‘The Millennial Yogi: A modern-day parable about reclaiming one’s life’, Deepam Chatterjee, 23.26
‘Udaan Ek Majdoor Bachhe Ki’,	Mithilesh Tiwari, 26.25

‘The Queen of Indian Pop: The Authorised Biography of Usha Uthup’,	Vikas Kumar Jha
‘The Blue Book: A Writer’s Journal',	Amitava Kumar
‘Role of Labour in India’s Development’,	Labour Minister Bhupendra Yadav
‘Soli Sorabjee: Life and Times’,	Abhinav Chandrachud
‘The Queen of Indian Pop’,	Usha Uthup
‘On Board: My Years in BCCI’,	Ratnakar Shetty’s
'Tomb of Sand',	Geetanjali Shree’s
‘Monsoon’,	Sahitya Akademi
‘More than Just Surgery: Life Lessons Beyond the OT’,	Dr Tehemton Erach Udwadia
‘Wrist Assured: An Autobiography’,	Former Cricketer G.R. Viswanath
‘Unfilled Barrels India’s oil story’,	Richa Mishra
‘The Little Book of Joy’,	Dalai Lama & Desmond Tutu
‘Spoorthi Pradatha Sri Somayya’,	K Syam Prasad
‘Fearless Governance’,	Dr. Kiran Bedi
‘Operation Khatma’, 	RC Ganjoo and Ashwini Bhatnagar
‘India, That is Bharat: Coloniality Civilisation Constitution’,	J Sai Deepak
‘Golden Boy Neeraj Chopra’,	Navdeep Singh Gill
‘Atal Bihari Vajpayee’,	Sagarika Ghose
‘India–Africa Relations: Changing Horizons’,	Rajiv Bhatia
‘How to Prevent the Next Pandemic’,	Bill Gates
‘Humane: How the United States Abandoned Peace and Reinvented War’,	Samuel Moyn
‘Dignity in a Digital Age: Making Tech Work for All of Us’,	Ro Khanna
‘A History of Sriniketan: Rabindranath Tagore’s Pioneering Work in Rural Construction’,	Uma Das Gupta
‘A Nation To Protect’,	Priyam Gandhi Mody
‘The Founders: The Story of Paypal and the Entrepreneurs Who Shaped Silicon Valley’,	Jimmy Soni
‘The Great Tech Game: Shaping Geopolitics and the Destinies of Nations’,	Anirudh Suri

‘Ratan N. Tata: The Authorized Biography’,	Dr. Thomas Matthew
‘Indomitable: A Working Woman’s Notes on Life & Work, and Leadership’,	Arundhati Bhattacharya
‘Bose: The untold story of an inconvenient nationalist’,	Chandrachur Ghose
'The Legend of Birsa Munda',	Tuhin A Sinha and Ankita Verma
‘India’s Women Unsung Heroes’,	Meenakshi Lekhi
‘A Little Book of India: Celebrating 75 years of Independence’,	Ruskin Bond
‘The $10 Trillion Dream’,	Subhash Chandra Garg*/