const prompt = require ('prompt-sync')();

const name = prompt("Enter your name:    ");

console.log("WELCOME TO MYERS-BRIGGS PERSONALITY TEST  ");


	let selectionA1 = 0;
	let selectionB1 = 0;
	let selectionA2 = 0;
	let selectionB2 = 0;
	let selectionA3 = 0;
	let selectionB3 = 0;
	let selectionA4 = 0;
	let selectionB4 = 0;	


do
{
	question1 = prompt("A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one      ");

	if(question1 == "A"){
		selectionA1++;
		console.log("A")
		break;
	}


	if (question1 == "B") {
		selectionB1++;
		console.log("B  ")
		break;
	}
	}while(question1 != "A" | question1 != "B" && question1.length > 0);

 
do
{
	question2 = prompt("A.  More outgoing, think out loud         B. More reserved, think to yourself     ");

	if(question2 == "A"){
		selectionA1++;
		console.log("A")
		break;
	}


	if (question2 == "B") {
		selectionB1++;
		console.log("B  ")
		break;
	}
	}while(question2 != "A" | question2 != "B" && question2.length > 0);


do
{
question3 = prompt("A. Seek many tasks, Public activities, Interation with Others         B. Seek private, Solitary activities with quiet to concentrate    ");

	if(question3 == "A"){
		selectionA1++;
		console.log("A")
		break;
	}


	if (question3 == "B") {
		selectionB1++;
		console.log("B  ")
		break;
	}
	}while(question3 != "A" | question3 != "B" && question3.length > 0);


do
{
	question4 = prompt("A. External, Communicate, Express yourself         B. Internal, Reticient, keep to yourself     ");

	if(question4 == "A"){
		selectionA1++;
		console.log("A")
		break;
	}


	if (question4 == "B") {
		selectionB1++;
		console.log("B  ")
		break;
	}
	}while(question4 != "A" | question4 != "B" && question4.length > 0);


do
{
	question5 = prompt("A. active, initiate        B.  reflective, deliberate     ");

	if(question5 == "A"){
		selectionA1++;
		console.log("A")
		break;
	}


	if (question5 == "B") {
		selectionB1++;
		console.log("B  ")
		break;
	}
	}while(question5 != "A" | question5 != "B" && question5.length > 0);


do
	{
	question6 = prompt("A. Interpet literally         B. Look for meaning and possibility  ")

	if (question6 == "A") {
			selectionA2++;
			break;
	}
	
		if (question6 == "B") {
			selectionB2++;
			break;
	}
		
	}while(question6 != "A" | question6 != "a" && question6.length > 0) ;

do
	{
	question7 = prompt("A. practical, realistic, experiential	B. imaginative, innovative, theoretical  ")

	if (question7 == "A") {
			selectionA2++;
			break;
	}
	
		if (question7 == "B") {
			selectionB2++;
			break;
	}
		
	}while(question7 != "A" | question7 != "a" && question7.length > 0) ;


do
	{
	question8 = prompt("A.  standard,  usual, conventional		B.  different, novel, unique  ")

	if (question8 == "A") {
			selectionA2++;
			break;
	}
	
		if (question8 == "B") {
			selectionB2++;
			break;
	}
		
	}while(question8 != "A" | question8 != "a" && question8.length > 0) ;


do
	{
	question9 = prompt("A. focus on here-and-now,  look to the future	     B.  global perspective, big picture  ")

	if (question9 == "A") {
			selectionA2++;
			break;
	}
	
		if (question9 == "B") {
			selectionB2++;
			break;
	}
		
	}while(question9 != "A" | question9 != "a" && question9.length > 0) ;


do
	{
	question10 = prompt("A. Logical, Thinking, questioning         B. Empatethic, Feeling, Accomodating  ")

	if (question10 == "A") {
			selectionA2++;
			break;
	}
	
		if (question10 == "B") {
			selectionB2++;
			break;
	}
		
	}while(question10 != "A" | question10 != "a" && question10.length > 0) ;




do
	{
	question11 = prompt("A. Candid, Straight Forward, Frank         B. Tactful, Kind, Encouraging  ")

	if (question11 == "A") {
			selectionA3++;
			break;
	}
	
		if (question11 == "B") {
			selectionB3++;
			break;
	}
		
	}while(question11 != "A" | question11 != "a" && question11.length > 0) ;



do
	{
	question12 = prompt("A. Firm, Tend to critisize, Hold the line         B. Gentle, tend to appreciate, conciliate  ")

	if (question12 == "A") {
			selectionA3++;
			break;
	}
	
		if (question12 == "B") {
			selectionB3++;
			break;
	}
		
	}while(question12 != "A" | question12 != "a" && question12.length > 0) ;



do
	{
	question13 = prompt("A. Tough minded, just         B. Tender Hearted, Merciful  ")

	if (question13 == "A") {
			selectionA3++;
			break;
	}
	
		if (question13 == "B") {
			selectionB3++;
			break;
	}
		
	}while(question13 != "A" | question13 != "a" && question13.length > 0) ;



do
	{
	question14 = prompt("A. Matter of fact, Issue-Oriented         B. Sensitive, People Oriented, Passionate  ")

	if (question14 == "A") {
			selectionA3++;
			break;
	}
	
		if (question14 == "B") {
			selectionB3++;
			break;
	}
		
	}while(question14 != "A" | question14 != "a" && question14.length > 0) ;




do
	{
	question15 = prompt("A. Organized, Orderly         B. Flexible, Adaptable  ")

	if (question15 == "A") {
			selectionA3++;
			break;
	}
	
		if (question15 == "B") {
			selectionB3++;
			break;
	}
		
	}while(question15 != "A" | question15 != "a" && question15.length > 0) ;



do
	{
	question16 = prompt("A. Plan, Schedule         B. Unplanned, Spontaneous  ")

	if (question16 == "A") {
			selectionA4++;
			break;
	}
	
		if (question16 == "B") {
			selectionB4++;
			break;
	}
		
	}while(question16 != "A" | question16 != "a" && question16.length > 0) ;



do
	{
	question17 = prompt("A. regulated, structured       B. easy-going, live and let live  ")

	if (question17 == "A") {
			selectionA4++;
			break;
	}
	
		if (question17 == "B") {
			selectionB4++;
			break;
	}
		
	}while(question17 != "A" | question17 != "a" && question17.length > 0) ;



do
	{
	question18 = prompt("A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go  ")

	if (question18 == "A") {
			selectionA4++;
			break;
	}
	
		if (question18 == "B") {
			selectionB4++;
			break;
	}
		
	}while(question18 != "A" | question18 != "a" && question18.length > 0) ;



do
	{
	question20 = prompt("A.  control, govern        B.  latitude, freedom  ")

	if (question20 == "A") {
			selectionA4++;
			break;
	}
	
		if (question20 == "B") {
			selectionB4++;
			break;
	}
		
	}while(question20 != "A" | question20 != "a" && question20.length > 0) ;




console.log("\n  ");
console.log("\n  ");
console.log("\n  ");
console.log("\n  ");



		let thequestion1a = "A. expend energy, enjoy groups";        
		let thequestion1b =  "B. Conserve energy, enjoy one-on-one";
		let thequestion2a = "A. More outgoing, think out loud";      
		let thequestion2b = "B. More reserved, think to yourself";
		let thequestion3a = "A. Seek many tasks, Public activities, Interation with Others";   
   
		let thequestion3b =  "B. Seek private, Solitary activities with quiet to concentrate";
		let thequestion4a = "A. External, Communicate, Express yourself";        
		let thequestion4b = "B. Internal, Reticient, keep to yourself";
		let thequestion5a = "A. active, initiate";      
		let thequestion5b = "B. reflective, deliberate"; 

		let thequestion6a = "A. Interpet literally";
		let thequestion6b = "B. Look for meaning and possibility";
		let thequestion7a = "A. practical, realistic, experiential";
		let thequestion7b = "B. imaginative, innovative, theoretical";
		let thequestion8a = "A. standard,  usual, conventional";
 
		let thequestion8b = "B. different, novel, unique";
		let thequestion9a = "A. focus on here-and-now,  look to the future";
		let thequestion9b = "B. global perspective, big picture";
		let thequestion10a = "A. facts, things, what is";
		let thequestion10b = "B. ideas, dreams, what could be , philosophical";


		
		let thequestion11a = "A. Logical, Thinking, questioning ";
		let thequestion11b = "B. Empatethic, Feeling, Accomodating";
		let thequestion12a = "A. Candid, Straight Forward, Frank  ";
		let thequestion12b = "B. Tactful, Kind, Encouraging";
		let thequestion13a = "A. Firm, Tend to critisize, Hold the line ";

		let thequestion13b = "B. Gentle, tend to appreciate, conciliate";
		let thequestion14a = "A. Tough minded, just";
		let thequestion14b = "B. Tender Hearted, Merciful";
		let thequestion15a = "A. Matter of fact, Issue-Oriented ";
		let thequestion15b = "B. Sensitive, People Oriented, Passionate";

		let thequestion16a = "A. Organized, Orderly";
		let thequestion16b = "B. Flexible, Adaptable";
		let thequestion17a = "A. Plan, Schedule ";
		let thequestion17b = "B. Unplanned, Spontaneous";
		let thequestion18a = "A. regulated, structured";
		
		let thequestion18b = "B. easy-going, live and let live";
		let thequestion19a = "A. Preparation, Plan ahead ";
		let thequestion19b = "B. Go with the flow, Adapt as you go";
		let thequestion20a = "A. control, govern";
		let thequestion20b = "B. latitude, freedom";
		

		console.log(`Hello ${name} You selected`);


		// 1
		if(question1 == "A" | question1 == "a") {
		console.log(thequestion1a);
		}
		
		if(question1 == "B" | question1 == "b") {
		console.log(thequestion1b);
		}

		//2

		if(question2 == "A" | question2 == "a") {
		console.log(thequestion2a);
		}
		
		if(question2 == "B" | question2 == "b") {
		console.log(thequestion2b);
		}

		//3

			
		if(question3 == "A" | question3 == "a") {
		console.log(thequestion3a);
		}
		
		if(question3 == "B" | question3 == "b") {
		console.log(thequestion3b);
		}


		//4
	
		if(question4 == "A" | question4 == "a") {
		console.log(thequestion4a);
		}
		
		if(question4 == "B" | question4 == "b") {
		console.log(thequestion4b);
		}

		
		//5

		if(question5 == "A" | question5 == "a") {
		console.log(thequestion5a);
		}
		
		if(question5 == "B" | question5 == "b") {
		console.log(thequestion5b);
		}

		console.log("\n");
		console.log(`Number of A selected: ${selectionA1}`);
		console.log(`Number of B selected:  ${selectionB1}`);
		console.log("\n");


		
		// 6
		if(question6 == "A" | question6 == "a") {
		 console.log(thequestion6a);
		}
		
		if(question6 == "B" | question6 == "b") {
		 console.log(thequestion6b);
		}


		//7

		if(question7 == "A" | question7 == "a") {
		 console.log(thequestion7a);
		}
		
		if(question7 == "B" | question7 == "b") {
		 console.log(thequestion7b);
		}

		//8

			
		if(question8 == "A" | question8 == "a") {
		 console.log(thequestion8a);
		}
		
		if(question8 == "B" | question8 == "b") {
		 console.log(thequestion8b);
		}


		//9
	
		if(question9 == "A" | question9 == "a") {
		 console.log(thequestion9a);
		}
		
		if(question9 == "B" | question9 == "b") {
		 console.log(thequestion9b);
		}
		
		//10

		if(question10 == "A" | question10 == "a") {
		 console.log(thequestion10a);
		}
		
		if(question10 == "B" | question10 == "b") {
		 console.log(thequestion10b);
		}

		
		 console.log("\n");
		 console.log(`Number of A selected:  ${selectionA2}`);
		 console.log(`Number of B selected:  ${selectionB2}`);
		 console.log("\n");


		if(question10 == "A" | question10 == "a") {
		 console.log(thequestion11a);
		}
		
		if(question10 == "B" | question10 == "b") {
		 console.log(thequestion11b);
		}


		// 11

		if(question11 == "A" | question11 == "a") {
		 console.log(thequestion12a);
		}
		
		if(question11 == "B" | question11 == "b") {
		 console.log(thequestion12b);
		}
		
			
		// 12

		if(question12 == "A" | question12 == "a") {
		 console.log(thequestion13a);
		}
		
		if(question12 == "B" | question12 == "b") {
		 console.log(thequestion13b);
		}

	
		// 13

		if(question13 == "A" | question13 == "a") {
		 console.log(thequestion14a);
		}
		
		if(question13 == "B" | question13 == "b") {
		 console.log(thequestion14b);
		}
		

		// 14

		if(question14 == "A" | question14 == "a") {
		 console.log(thequestion15a);
		}
		
		if(question14 == "B" | question14 == "b") {
		 console.log(thequestion15b);
		}
		
		
		 console.log("\n");
		 console.log(`Number of A selected: ${selectionA3}`);
		 console.log(`Number of B selected:  ${selectionB3}`);
		 console.log("\n");


			// 15

		if(question15 == "A" | question15 == "a") {
		console.log(thequestion16a);
		}
		
		if(question15 == "B" | question15 == "b") {
		console.log(thequestion16b);
		}
		
		//16

		if(question16 == "A" | question16 == "a") {
		console.log(thequestion17a);
		}
		
		if(question16 == "B" | question16 == "b") {
		console.log(thequestion17b);
		}
		
		
		//17

		if(question17 == "A" | question17 == "a") {
		console.log(thequestion18a);
		}
		
		if(question17 == "B" | question17 == "b") {
		console.log(thequestion18b);
		}
		

		// 18

		if(question18 == "A" | question18 == "a") {
		console.log(thequestion19a);
		}
		
		if(question18 == "B" | question18 == "b") {
		console.log(thequestion19b);
		}
		

		//19

		if(question19 == "A" | question19 == "a") {
		console.log(thequestion20a);
		}
		
		if(question19 == "B" | question19 == "b") {
		console.log(thequestion20b);
		}
		
		
		console.log("\n");
		console.log("Number of A selected: " + selectionA4);
		console.log("Number of B selected: " + selectionB4);
		console.log("\n");


		

				//E							//N					//F				         	//J

		if (selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
			console.log("ENFJ	\nTHE GIVER\nENFJs are individuals who are people-centered. \nThey rely mostly on their intuition and feelings and tend to live through their imagination. \nThey focus on abstracts and what could happen in the future. \nThey are highly empathetic not just to their close friends and family but to people in general. \nThe ENFJ generally loves feedback and they can be referred to as people pleasers. \nTheir dominant cognitive function is an extraverted feeling that helps them be in tune with other people’s feelings. \nTheir auxiliary functions are introverted intuition that makes them focus on the future as opposed to the present moment.\nThey thrive in jobs where they can encourage others and push them to grow. \nThis also includes humanitarian-focused jobs. In relationships, they are supportive and always willing to understand their partners");
			
		
 		}




			System.out.println();



				//I						//N							//F					//J
			
		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4 ) {
			
		console.log("INFJ\nThe Counselor\nINFJs are visionaries who have a different view of the world. \nThey love introspection and refuse to take things at a surface level.\n	They could be termed weird by others because of how they see life. \nThe INFJ are idealists who love understanding complex issues.\nThey are reserved leaders who are usually creatives due to how easily they get inspired.\nAlso known as the diplomats, the INFJ prefers to cooperate with members of their team as opposed to conflict.\nThe dominant cognitive function of an INFJ is introverted intuition which helps them focus on internal insights and generally influences their decision-making.\nTheir tertiary cognitive function is an extraverted feeling which makes them highly sensitive to the feeling of others or what others refer to as being empathetic. \nThe INFJ thrives in jobs that require a deal of compassion, psychology, and/or collaboration.\n");
		}

			
				//I						//N							//T						//J

		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		 console.log("INTJ\nThe Mastermind\nINTJs are introverts who are comfortable being by themselves. \nThey would avoid socializing as it drains their energy. \nThey excel at developing plans and strategies. \nAs analytical problem solvers, this personality type is strategic and innovative\nTheir dominant cognitive function is Introverted intuition which they use to read between the lines and unravel patterns. \nThe auxiliary function is extraverted thinking which makes them deliberate about solutions and highly organized. \nAlso known as the architects, the INTJ thrives in jobs that require logical systems and innovative solutions. \nThey usually prefer to work alone. In relationships, they are loyal and are great at encouraging their partners. \n");

		}


				//I							//S						//T						//P
		
		 if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		console.log("ISTP\nThe Craftsman\nISTPs are a mysterious, rational, and highly logical bunch. \nThey are spontaneous and unpredictable most times albeit oblivious to those around them because they are experts at hiding their true nature.\nTheir dominant cognitive function is introverted thinking which makes them focus on the logical aspect of a situation. \nThe ISTP’s auxiliary cognitive function is extraverted sensing which helps them focus on abstract things. \nThey thrive in jobs that require technical expertise and physical activity. In relationships, they are calm lovers who prefer being handy around the house.\n");
		
		}

	
		
				//E						//S					//F								//J
		if(selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
		console.log("ESFJ\nThe Provider\nESFJs are stereotypically known to be extroverts. \nThey are cheerleaders and raise the spirits of those around them earning them popularity. \nBecause of their nature, they are easily liked and people easily warm up to them.\nTheir dominant cognitive function is an extroverted feeling which makes them work and make decisions based on their gut feeling. \nThe ESFJ’s auxiliary cognitive function is introverted sensing which helps them focus on the present instead of the future or other abstract details.\nThey thrive in jobs that require processes and interpersonal skills. In relationships, they are the traditional partners who believe in structure and stability.\n");
		}

		

				//I							//N						//F								//P
		
		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		console.log("INFP\nThe Idealist\nINFPs are usually reserved and introverted. \nThey usually spend time all by themselves in quiet places. \nThey love analyzing signs and symbols and using them to draw inferences in explaining what is happening around them.\nTheir dominant cognitive function is an introverted feeling which helps them with processing emotions internally.\nThe INFP auxiliary cognitive function is the extraverted intuition that helps them focus on the big picture through imagination.\nThey thrive in jobs that require visions and align with their goals/ interests. In relationships take time to select their friends and they are quite big on comprise. \n");
		}
			


				//E					//S						//F								//P

		if (selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		console.log("ESFP\nThe Performer\nESFPs are mostly perceived to be entertainers. \nThey enjoy being in the spotlight. \nThey enjoy exploring and learning to share what they’ve learned with others through their strong interpersonal skills.\nTheir dominant cognitive function is extraverted sensing which helps them stick to facts instead of abstract ideas. \nThe ESFP’s auxiliary cognitive function is an introverted feeling which helps them make decisions.\nThey thrive in work environments where they can be spontaneous, move around often, and involves the use of artistic values.\n In relationships, the ESFP will prioritize their family and loved ones over anything although they can also strongly dislike a structured life.\n");
	
		}


				//E						//N						//F						  //P
		if (selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 &  selectionA4 < selectionB4) {
		console.log("ENFP\nThe Champion\nENFPs are highly individualistic and refuse to live their lives inside a box. \nThey strive to create their own methods of doing things. They operate with their feelings and are highly perceptive and thoughtful\nTheir dominant cognitive function is extraverted intuition which allows them to focus on abstract thoughts and patterns. \nThe auxiliary cognitive function is introverted feelings which make them focus on their feelings rather than logic.\nIn relationships, the ENFP is always expressive and shares affection openly. They also thrive in jobs that demand creativity and imaginative solutions.\n");
		}



				//I						//S						//F						//J
	
		 if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
		console.log("ISFJ\nQueit, friendly, responsible and conscientious, committed and steady in meeting their obligations. \nThorough, painstaking and accurate.\nLoyal , considerate , notice and remember specifics about people who are important to them,\nStrive to create an orderly and harmonious enviroment at work and at home.\n");

		}
	
		

				//I					//N						//F				//J
		
		if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4)  {
		console.log("INFJ\n Seek meaning and connection in ideas, relationships, and material possessions. \nWant to understand what motivates people and are insightful about others. \nConscientious and committed to their firm values. \nDevelop a clear vision about how best to serve the common good. \nOrganized and decisive in implementing their vision.\n");

		}


				//I							//S						//F						//P
		
		if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		console.log("ISFP\nQuiet, friendly, sensitive, and kind. \nEnjoy the present moment, what's going on around them. \nLike to have their own space and to work within their own time frame. \nLoyal and committed to their values and to people who are important to them. \nDislike disagreements and conflicts; don't force their opinions or values on others.\n");
		}

		

				//E				//S					//T					//p
		
		if(selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		console.log("ESTP\n Flexible and tolerant, take a pragmatic approach focused on immediate results. \nBored by theories and conceptual explanations; want to act energetically to solve the problem. \nFocus on the here and now, spontaneous, enjoy each moment they can be active with others. \nEnjoy material comforts and style. Learn best through doing.\n");
		}


				//E					//N					//T					//P
		
		if(selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		console.log("ENTP \nQuick, ingenious, stimulating, alert, and outspoken. \nResourceful in solving new and challenging problems. \nAdept at generating conceptual possibilities and then analyzing them strategically. \nGood at reading other people. \nBored by routine, will seldom do the same thing the same way, apt to turn to one new interest after another.\n");

		}

		
		
			//E					//S						//T						//J

		if(selectionA1 > selectionB1 &  selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		console.log("ESTJ\nPractical, realistic, matter-of-fact. \nDecisive, quickly move to implement decisions. \nOrganize projects and people to get things done, focus on getting results in the most efficient way possible. \nTake care of routine details. \nHave a clear set of logical standards, systematically follow them and want others to also. \nForceful in implementing their plans.\n");
		}


		
				//E					//N 				//T					//J
	
		if(selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		console.log("ENTJ\nFrank, decisive, assume leadership readily. \nQuickly see illogical and inefficient procedures and policies, develop and implement comprehensive systems to solve organizational problems. \nEnjoy longterm planning and goal setting. Usually well informed, well read, enjoy expanding their knowledge and passing it on to others. \nForceful in presenting their ideas.\n");
		}







console.log(selectionA1);
console.log(selectionB1);
console.log(`Selection 2: ${selectionA2}`);
console.log(`Selection 2: ${selectionB2}`);

