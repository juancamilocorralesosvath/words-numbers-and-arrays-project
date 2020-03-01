
	import java.util.Scanner; 
	
	/** this class solves the first algorithms and programming 1 laboratory
	@author Juan Camilo Corrales Osvath
	*/

	public class Final{  

	  public final static int WORDS = 1;
	  public final static int NUMBERS = 2;
	  public final static int ARRAYS = 3;
	  public final static int SUM = 1;
	  public final static int SUBSTRACTION = 2;
	  public final static int MULTIPLICATION = 3;
	  public final static int EXIT = 4;
	  
	  static int option, option2, option3, numselect, numselect2, numchar1, numchar2, numchar3, operation2, mode, greater, number, lengthofnewarray3, accummulator1, accummulator2, accummulator3, greaternumber;
	  static String string1, string2, string3, together, array1, array2;
	  static Scanner sc; 
	  static double num1, num2, operation1; 
	  static int[] numbers1, numbers2, numbers3, selection1, selection2, newarray, newarray2, newarray3, bubblearray, flip;  
				
	  /** this method initializes the variables needed for the execution of the programm
	  *pre: 
	  *post: the variables are initialized so that they can be used without an error being thrown by the machine
	  */ 
	  public static void initialize(){ 
	  
	    option = 0;
		option2 = 0;
		option3 = 0;
		numselect = 0;
		numselect2 = 0;
		numchar1 = 0;
		numchar2 = 0;
		numchar3 = 0;
		operation2 = 0;
		mode = 0;
		greater = Integer.MIN_VALUE;
		number = 0;
		string1 = "";
		string2 = "";
		string3 = "";
		together = "";
		array1 = "";
		array2 = "";
		sc = new Scanner(System.in);
		num1 = 0;
		num2 = 0;
		operation1 = 0; 
		accummulator1 = 0;
		accummulator2 = 0;
		accummulator3 = 0;
		
		
	  }   
	  
	  /** this method solves the first part of the laboratory regarding strings,
	  it receives three strings, concatenates them, shows the length of each of them, 
      and prints the character selected for each of the string.
	  *pre:
	  *post: print the concatenation, the length, and the character selected of the strings.
	  
	  
	  */
	  
	  public static void words(){ 
	  
	               System.out.println("please, enter the first string");
				   string1 = sc.nextLine();
				   
				    System.out.println("please, enter the second string");
				   string2 = sc.nextLine(); 
				   
				    System.out.println("please, enter the third string");
				   string3 = sc.nextLine();
				   
				   together = string1+" "+string2+" "+string3;
	  
	               System.out.println("the lenght of the first string is: "+string1.length());
				   System.out.println("the lenght of the second string is: "+string2.length());
				   System.out.println("the lenght of the third string is: "+string3.length());
				   
				   for(int i = 0; i < 3; i++){  
				
				 System.out.println("please type the string you would like to select: \n (1)first \n (2)second \n (3)third");
				   numselect = sc.nextInt();
				   sc.nextLine(); 
				 
				  if(numselect == 1){ 
				   System.out.println("please type the position of the character you would like to see for this string");
				   numchar1 = sc.nextInt();
				   sc.nextLine();
				   
				   } else if(numselect == 2){ 
				      System.out.println("please type the position of the character you would like to see for this string");
					  numchar2 = sc.nextInt();
					  sc.nextLine();
			
				   
				   } else if(numselect == 3){ 
				      System.out.println("please type the position of the character you would like to see for this string");
					  numchar3 = sc.nextInt();
					  sc.nextLine();
				   
				   } else {
					   System.out.println("that's not a valid income, please try again.");
				   }
				} 
				   
				   System.out.println("the character selected for the first string was: "+string1.charAt(numchar1));
				   System.out.println("the character selected for the second string was: "+string2.charAt(numchar1));
				   System.out.println("the character selected for the third string was: "+string3.charAt(numchar1));
				  
				   
				   System.out.println("what would you like to do now? \n (1)work with words \n (2)work with numbers \n (3)work with arrays \n (4)leave the programm");
		           option = sc.nextInt();
		           sc.nextLine();  
	    
	  
	  
	  } 
	  
	  /** this method receives two integer numbers greaters than zero, 
	  prints their division and the whole part of the modulus.
	  *pre:
	  *post: the resul of dividing the first number between the second and the whole part of 
	  the modulus of the first number between the second.
	  
	  
	  */
	  
	  public static void numbers(){ 
	  
	               System.out.println("please type a number greater than zero");
				   num1 = sc.nextDouble();
				   sc.nextLine();
				   
				   System.out.println("please type a second number also greater than zero");
				   num2 = sc.nextDouble();
				   sc.nextLine();
				   
				   operation1 = num1 / num2;
				   operation2 = (int)num1 % (int)num2;
				   
				   
				   System.out.println("the result for the division is: "+operation1);
				   System.out.println("the result for the second operation is: "+operation2);
				   
				   
				   System.out.println("what would you like to do now? \n (1)work with words \n (2)work with numbers \n (3)work with arrays \n (4)leave the programm");
		                   option = sc.nextInt();
		                   sc.nextLine();
	                           
	  
	  } 
	  
	  /** method arrays is the largest one, it receives three arrays, shows them to the user,
	  calculate the mode, average and the greater value of the array selected by the user. 
	  it calculates the sum, subtraction or multiplication between the arrays selected by the user.
	  it makes the union of the arrays, makes an array without the repeated numbers, and an array 
	  with the interception of the arrays. Also, it can order the elements of an array(from lowest to greatest)
	  and move the positions of the elements to the n-th time.
	  *pre:
	  *post: to give the results of the processes mentioned above.
	  
	  
	  
	  */ 
	  
	  
	  public static void arrays(){ 
	  
	              System.out.println("for the first array: ");
	               numbers1 = enterarrays(numbers1);
				   
				  System.out.println("for the second array: ");
				   numbers2 = enterarrays(numbers2);
				   
				  System.out.println("for the third array: "); 
				   numbers3 = enterarrays(numbers3);
				   
				  
				  System.out.println("********************************************\n juan camilo corrales osvath, 2020\n ********************************************\n the first array is:\n");
				  
				    printarrays(numbers1); 
				  
				  System.out.println("********************************************\n juan camilo corrales osvath, 2020\n ********************************************\n the second array is:\n");
				   
				    printarrays(numbers2); 
				  
				  System.out.println("********************************************\n juan camilo corrales osvath, 2020\n ********************************************\n the third array is:\n");
				  
				    printarrays(numbers3); 
				  
				   
					
				System.out.println("now, for which array would you like to see the mode? \n (please type 'first', 'second' or 'third')");
				 array1 = sc.nextLine(); 
	
				 
				 if(array1.equalsIgnoreCase("first")){ 
				   
	               mode(numbers1);
				 } 
				 
				 if(array1.equalsIgnoreCase("second")){ 
				   
				   mode(numbers2);
				 }
				 
				 if(array1.equalsIgnoreCase("third")){ 
				   
				   mode(numbers3);
				 } 
				 
				 System.out.println("now, for which array would you like to see the average? \n (please type 'first', 'second' or 'third')");
				 array1 = sc.nextLine(); 
				 
				  if(array1.equalsIgnoreCase("first")){ 
				   
	               average(numbers1);
				 } 
				 
				 if(array1.equalsIgnoreCase("second")){ 
				   
				     average(numbers2);
				 }
				 
				 if(array1.equalsIgnoreCase("third")){ 
				   
				     average(numbers3);
				 }
				 
				 System.out.println("now, for which array would you like to see the greater value?(please type 'first', 'second' or 'third')");
				 array1 = sc.nextLine();
				 
				 
				 
				 if(array1.equalsIgnoreCase("first")){ 
				 
				   greaternumber = greatervalue(numbers1);
				 }
				 
				  if(array1.equalsIgnoreCase("second")){ 
				 
				   greaternumber = greatervalue(numbers2);
				 }
				 
				 
				  if(array1.equalsIgnoreCase("third")){ 
				 
				    greaternumber = greatervalue(numbers3);
				 } 
				 
				 System.out.println("the greater value is: "+ greaternumber);
				 		 
				 
				System.out.println("now, which operation would you like to do? \n (1)SUM \n (2)SUBSTRACTION \n (3)MULTIPLICATION");
				 option2 = sc.nextInt();
				 sc.nextLine(); 
				 
			if(numbers1.length == numbers2.length && numbers1.length == numbers3.length){
				
				 if(option2 == 1){
					 
					 System.out.println("how would you like to do it?: \n (1)first array + second array \n (2)second array + third array \n or \n (3)third array + first array");
					 option3 = sc.nextInt();
					 sc.nextLine();
					 
				 } else if(option2 == 2){ 
				 
				 
				    System.out.println("how would you like to do it?: \n (1)first array - second array \n (2)second array - third array \n or \n (3)third array - first array");
					 option3 = sc.nextInt();
					 sc.nextLine();
					 
				 
				 } else if(option2 == 3){ 
				 
				    System.out.println("how would you like to do it?: \n (1)first array * second array \n (2)second array * third array \n or \n (3)third array * first array");
					 option3 = sc.nextInt();
					 sc.nextLine();
					 
				 
				 } 
				 
	          }	else { 
			
			  System.out.println("\n*sorry, the lengths of the arrays are not the same, \nthey have to be equals for doing this operations*\n");
			 
			  }
			
				 
				 secondmenu(option2, option3);  
				 
				 System.out.println("now, for which array would you like to see the values ordered from less to more?(please type 'first', 'second' or 'third')");
				 array1 = sc.nextLine();
				 
				  if(array1.equalsIgnoreCase("first")){ 
				 
				    bubblearray = bubble(numbers1);
				 }
				 
				  if(array1.equalsIgnoreCase("second")){ 
				 
				   bubblearray =  bubble(numbers2);
				 }
				 
				 
				  if(array1.equalsIgnoreCase("third")){ 
				 
				    bubblearray =  bubble(numbers3);
				 } 
				 
				 System.out.println("the ordered array is: ");
				  printarrays(bubblearray);
				 
				 
				int[] combinationwithrepeated = combinationarrays(numbers1, numbers2, numbers3);
				 System.out.println("the combination of the three arrays is: ");
			     printarrays(combinationwithrepeated);
				
				 
				int[] arraywithoutrepeated = norepeatednumbersarray(combinationwithrepeated);
				
				 	System.out.println("THE ARRAY WITH NO REPEATED NUMBERS IS: ");
					printarrays(arraywithoutrepeated); 
					
					
				     interception(numbers1, numbers2, numbers3);
				   
				     
					
					
			System.out.println("now, for which array would you like to move its elements?(please type 'first', 'second' or 'third')");
				 array1 = sc.nextLine();
				 
				  if(array1.equalsIgnoreCase("first")){ 
				 
				     flip = moveelements(numbers1);
				 }
				 
				  if(array1.equalsIgnoreCase("second")){ 
				 
				    flip = moveelements(numbers2);
				 }
				 
				 
				  if(array1.equalsIgnoreCase("third")){ 
				 
				    flip = moveelements(numbers3);
				 } 
				 
				 System.out.println("the array is: ");
				  printarrays(flip);
				  
			
					
				
				System.out.println("what would you like to do now? \n (1)work with words \n (2)work with numbers \n (3)work with arrays \n (4)leave the programm");
		         option = sc.nextInt();
		         sc.nextLine(); 
	  
	   
	  }  
	  
	  /**this method asks the user for the length of an array and for its elements.
	  *pre: the array must have been initialized. 
	  *post: returns an array.
	  @param array. is the array which will be entered.
	  @return array. the array entered by the user.
	  
	  
	  */
	  public static int[] enterarrays(int[] array){ 
	  
	            int length = 0;
				int element = 0;
				
	            System.out.println("please type the length of the array");
				   length = sc.nextInt();
				   sc.nextLine();
				   
			array = new int[length];
			
			for(int i = 0; i < length; i++){ 
			  System.out.println("please enter the element number "+(i+1)+" of the array");
			   element = sc.nextInt();
			  sc.nextLine();
			  array[i] = element;
			}
			
			return array;
	  }
	  
	  /**this method is the menu the user will see and interact with, it will tell the 
	  client the options of the programm.
	  *pre:
	  *post: to allow the client to navigate throw the programm.
	  
	  
	  
	  */
	  
	  public static void menu(){ 

		System.out.println("welcome! what would you like to do? these are the options: \n (1)work with words \n (2)work with numbers \n (3)work with arrays \n (4)leave the programm");
		 option = sc.nextInt();
		 sc.nextLine(); 

	      
		while(option != 4){
	   
	     switch(option){ 
		 
		   case WORDS: 
		             words();
					 break; 
					 
		    case NUMBERS: 
			             numbers();
						 break; 
						 
			case ARRAYS:
			             arrays();
						 break;
					 
		 } 
		 
	}
		           
				   	 
	  
	  
	  
	  }  
	  
	  /**this method prints a given array.
	  *pre: the array exists. array != null.
	  *post: show in screen the array.
	  @param array. is the array to print.
	  
	  
	  
	  */
	  
	  public static void printarrays(int[]array){ 
	    
		 for(int i = 0; i < array.length; i++){ 
		
		  System.out.println(array[i]);
		}
	  
	  } 
	  
	  
	  /**this method calculates the number that is most repeated in a given array.
	  *pre: the array exists. array != null.
	  *post: finds the mode.
	  @param array. is the array in which the method will search the number.
	  
	  
	  */
	  public static void mode(int[] array){ 
	   
			  int times = 0;
			
		     for(int i = 0; i < array.length; i++){ 
				   
				     int number = array[i];
					 int accumm = 0;
					 
					 for(int j = 0; j < array.length; j++){ 

	                    if(number == array[j]){ 
						  accumm++;
						}
					   
					 }
				     if(accumm > times){ 
					   times = accumm;
					   mode = number;
					 }
				   } 
				   
				   System.out.println("the mode is: "+mode);
				   
	}

	 /**this method calculates the average of the numbers of a given array.
	 *pre: the array exists. array != null.
	 *post: the average of the numbers.
	 @param array is the array in which the method will calculate the average.



      */	 
	  public static void average(int[] array){ 
	  
	  int sumaverage = 0;
	  double average = 0;
	  
	    for(int i = 0; i < array.length; i++){ 
		
		  sumaverage += array[i];
		
		}
		
		average = sumaverage / array.length;

	    System.out.println("the average is: "+average);	
	  
	  }	 
	     
	  /**this method calculates the greater value in an array.
	  *pre: the array exists. array != null.
	  *post: the greater value of the array.
	  @param array. is the array in which the method will calculate the greater value. 
	  @return greater. the greater value of the array.
	  
	  
	  */
	  public static int greatervalue(int[] array){ 
	  
	     for(int i = 0; i < array.length; i++){ 
				   
				if(array[i] > greater){ 
				  greater = array[i];
					 }	
			 } 
			 
			return greater;
		
	  }
	  
	  /**this method calculates the sum between the elements of given arrays.
	  *pre: both of the arrays exists. array1 != null and array2 != null.
	   also, the arrays have the same length.
	  *post: the sum between the elements of the arrays.
	  @param array1. the first array
	  @param array2. the second array
	  
	  
	  
	  */
	  public static void sumarrays(int[] array1, int[] array2) {
		  
		  int[] newarray = new int[array1.length];
		  
	      for(int i = 0; i < newarray.length; i++){ 
			 
			     newarray[i] = array1[i] + array2[i];
			 
			 } 
			 
			 System.out.println("the new array with the sum is: ");
			  printarrays(newarray);
			 
		  
		  
		  
		  
	  }
	  
	  /** this method calculates the subtraction between the elements of given arrays.
	  *pre: both of the arrays exists. array1 != null and array2 != null.
	   also, the arrays have the same length.
	  *post: the subtraction between the elements of the arrays.
	  @param array1. the first array
	  @param array2. the second array
	  
	  
	  
	  
	  */
	  public static void substractionarrays(int[] array1, int[] array2){ 
	       
		   int[] newarray = new int[array1.length];
		                
						for(int i = 0; i < newarray.length; i++){ 
								 
								   newarray[i] = array1[i] - array2[i];
								 } 
						System.out.println("the new array with the substraction is: ");	 
						  printarrays(newarray); 
								  
								  
	  
	  }
	   
	   /** this method calculates the multiplication between the elements of given arrays.
	  *pre: both of the arrays exists. array1 != null and array2 != null.
	   also, the arrays have the same length.
	  *post: the multiplication between the elements of the arrays.
	  @param array1. the first array
	  @param array2. the second array
	  
	  
	  
	  
	  */
	  public static void multiplicationarrays(int[] array1, int[] array2){ 
	  
	  int[] newarray = new int[array1.length];
	    
				                  for(int i = 0; i < newarray.length; i++){ 
								 
								   newarray[i] = array1[i] * array2[i];
								 } 
								 
								  System.out.println("the new array with the multiplication is: ");
						             printarrays(newarray);
						          
	  
	  }
	  /**this method is a menu having the options of making the sum, subtraction or 
	  multiplication between arrays, depending on the choice made by the client.
	  
	  *pre: the two options(choices made by the client) exists. option1 != null and option2 != null.
	  *post: to make the operation selected by the client. 
	  @param option1. is the choice that indicates what kind of operation the user wants to do(
	  sum, subtraction or multiplication).
	  @param option2. is the choice that indicates between what arrays the user wants to make that operation.
	  
	  
	  */
	  public static void secondmenu(int option1, int option2){
		  
		   switch(option1){ 
			   
			     case SUM: 
				   
				          if(option2 == 1){ 
				      
				            sumarrays(numbers1, numbers2);
							
				        } else if(option2 == 2 ){ 
						
						  sumarrays(numbers2, numbers3);
						  
						} else if(option2 == 3){ 
						
						  sumarrays(numbers3, numbers1);
						}
				           
						  
				         
						 break;
						 
				case SUBSTRACTION:
				
				                 if(option2 == 1){ 
								 
								   substractionarrays(numbers1, numbers2);
								   
								 } else if(option2 == 2){ 
								 
								   substractionarrays(numbers2, numbers3);
								 } else if(option2 == 3){ 
								 
								   substractionarrays(numbers3, numbers1);
								 }
								  
								  break; 
								  
				case MULTIPLICATION: 
				 
				                if(option2 == 1){ 
								 
							       multiplicationarrays(numbers1, numbers2);
								   
								 } else if(option2 == 2){ 
								 
								   multiplicationarrays(numbers2, numbers3);
								 } else if(option2 == 3){ 
								 
								   multiplicationarrays(numbers3, numbers1);
								 }
				
				                   
								  
								  break; 
								  
				default:
				       
					   System.out.println("pease enter a valid value(1-3), dont be fucking stupid");
				                    
				                 
			   
			   }  
		  
	  }
	  /**this method makes the union of the arrays.
	  *pre: the three arrays exists. array1 != null and array2 != null and array3 != null.
	  *post: the union of the arrays.
	  @param array1. the first array.
	  @param array2. the second array.
	  @param array3. the third array. 
	  @return newarray2. the union of the three arrays.
	  
	  
	  
	  
	  */
	  public static int[] combinationarrays(int[] array1, int[] array2, int[] array3){ 
	  
	    
			   int sumlenghts = array1.length + array2.length + array3.length;
			   
			   newarray2 = new int[sumlenghts];
			   
			   int another = 0;
			   
			   for(int i = 0; i < array1.length; i++){ 
			   
			     newarray2[another] = array1[i];
				 another++;
				 number = another;
			   } 
			   
			   another = number;
			   
			   for(int i = 0; i < array2.length; i++){ 
			     newarray2[another] = array2[i];
				 another++;
				 number = another;
				 
			   }
			   
			   another = number;
			   
			   for(int i = 0; i < array3.length; i++){ 
			   
			     newarray2[another] = array3[i];
				 another++;
				
			   } 
			  
			   
				
				return newarray2;
			
	  }
	  
	 
	  /**this method creates the array without repeated numbers.
      *pre: the union of the arrays must have been already done.
      *post: the array without repeated numbers.
      @param array. is the union of the entered arrays.	  
	  @return newarray. the array with no repeated numbers.
	  */
	 
	  
	  public static int[] norepeatednumbersarray(int[] array){ 
	    
		
		int howmany = 0;
		
		int referencevalue = greatervalue(array) + 1;
		
		for(int i = 0; i < array.length; i++){ 
		
		  for(int j = i+1; j < array.length; j++){ 
		  
		    if(array[i] == array[j] && array[j] != referencevalue){ 
			
			 array[j] = referencevalue;
			  howmany++;
			}
		  }
		} 
		
		int[] newarray = new int[array.length - howmany];
		
		int y = 0;
		
		for(int i = 0; i < array.length; i++){ 
		
		 if(array[i] != referencevalue){
			
		  newarray[y] = array[i];
		  y++; 
		 }
		
		}
		
		return newarray; 
	  
	  
	  }
	   
	   /** this method organizes the elements of an array from the lowest to the 
       greatest value.
       *pre: the chosen array exists. array != null.
	   *post: the entered array but organized.
	   @param array. is the array. 
	   @return array. the organized array.
      	   
	   
	   */
	   public static int[] bubble(int[] array){ 
	    
	      int temp;
		  
		  
	      for(int i = array.length; i > 0; i--)
	      {
	        for(int j = 0;j < i-1;j++)
	        {
	          if(array[j] > array[j+1])
	          {
	            temp = array[j];
	            array[j] = array[j+1];
	            array[j+1] = temp;
	          }   
	        }
	      }
	     
	      return array;
	    }
	   /** this method moves the positions of the elements of an array to the n-th time(
	   the number the user wants).
	   *pre: the array exists. array != null.
	   *post: the array with it's elements moved.
	   @param array. is the array. 
	   @return array. is the array with its positions moved.
	   
	   */
	   public static int[] moveelements(int[] array){ 
	   
	    int step = 0;
		int lastone = 0;
		
	     System.out.println("please enter the step with which you want to move the array ");
	      step = sc.nextInt();
	      sc.nextLine();
		  
	for(int i=0; i<step; i++){	  
	  lastone = array[array.length - 1];
	  
	   for(int j = array.length - 1; j >0; j--){ 
	    
	    array[j] = array[j-1];
	  } 
	    array[0] = lastone;
	}
	    
	  
	   
	     return array; 
	   } 

    /** this method prints the repeated numbers 
	of the entered arrays.
	*pre: the user had to already enter the three arrays. array1 != null and array2 != null and array3 != null.
	*post: the interception of the arrays.
	 @param array1. the first array.
	 @param array2. the second array.
	 @param array3. the third array.
		
	*/

     public static void interception(int[] array1, int[] array2, int[] array3){  
	 
	   int i=0, j=0, k=0;
	   System.out.println("the interception is: ");
	   
	   while(i<array1.length && (j < array2.length && k < array3.length)){ 
	   
	     if(array1[i] == array2[j] && array2[j] == array3[k]){ 
		 
		   System.out.println(array1[i]);
		   i++;
		   j++;
		   k++;
		 }else if(array1[i] < array2[j]){ 
		   i++;
		 } else if(array2[j] < array3[k]){ 
		   j++;
		 }else{ 
		   k++;
		 }
	   
	   } 
           
       		   
	 
	  
	}
	   
	    
	  
	 
  public static void main(String[] args){ 
	  
	       initialize();
		   menu();	 
		 
		 }   
	   
	}
	  

	  




