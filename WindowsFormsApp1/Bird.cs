using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class Bird : Animal
    {
        public int legs { get; }
        //Constructor
        public Bird(double lifespan, int limbs) : base(lifespan)
        {
            //assign avariables
            Lifespan = lifespan;
            legs = limbs;
            sound = "The bird makes the tweet sound";
            movement = "This bird can move by hopping, flying and walking";
            age = 15;
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
