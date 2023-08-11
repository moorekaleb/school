using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class Cat : Animal
    {
        public int legs { get; }
        //Constructor
        public Cat(double lifespan, int limbs) : base(lifespan)
        {
            //assign avariables
            Lifespan = lifespan;
            legs = limbs;
            sound = "The cat makes the meow sound";
            movement = "This cat can move by running and walking";
            age = 30;
        }

        //leg method to display amount of legs
        public string Legs(int legs)
        {
            return "This animal has " + legs + " legs";
        }
        //override Info to add new information.
        public override List<string> Info()
        {
            list.Add(Legs(legs));
            return base.Info();
        }
    }
}
