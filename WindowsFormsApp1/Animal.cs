using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class Animal
    {
        //initiate variables
        public List<string> list = new List<string>();
        public string sound { get; set; }
        public string movement { get; set; }
        public int age { get; set; }
        private double lifespan;

        //constructor
        public Animal(double lifespan)
        {
            //assign avariables
            Lifespan = lifespan;
            sound = "There are many different sounds that animals can make";
            movement = "Many animals can swim, crawl, run and even fly";
            age = 1000;
        }
        //get set method for lifespan
        public double Lifespan
        {
            get
            {
                return lifespan;
            }
            set
            {//if lifespan is less than 0 display out of range.

                if (value < 1)
                    throw new ArgumentOutOfRangeException();
                else
                    lifespan = value;

            }
        }

        //tests age against user input and returns higher, lower or equel value
        public string LifeTest(int age, double life)
        {
            double result = age - life;
            if (result < 0)
                return "You guessed a too high, they can live up too " + age + " years.";
            else if (result > 0)
                return "You guessed a too low, they can live up too " + age + " years.";
            else
                return "Wow you guessed right!";
        }
        //Info method to add information to a list for later use. 
        public virtual List<string> Info()
        {
            if(list.Count > 1)
                list.Clear();
            list.Add(sound);
            list.Add(movement);
            list.Add(LifeTest(age, lifespan));
            
            return list;
            
        }
    }
}
