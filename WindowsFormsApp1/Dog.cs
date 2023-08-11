using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class Dog : Animal
    {
        public int legs { get;}
        //Constructor
        public Dog(double lifespan, int limbs) : base(lifespan)
        {
            //assign avariables
            Lifespan = lifespan;
            legs = limbs;
            sound = "The dog makes the Woof sound";
            movement = "This dog can move by running and walking";
            age = 20;
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
