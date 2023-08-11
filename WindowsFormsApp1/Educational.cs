using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Educational : Form
    {
        private Form CallingForm = null;
        //assigning a calling form
        public Educational(Form callingForm) : this()
        {
            this.CallingForm = callingForm;
        }

        public Educational()
        {
            InitializeComponent();
            //adding a form closing event
            this.FormClosing += new FormClosingEventHandler(Educational_FormClosing);
        }
        //if this form closes show the calling form.
        void Educational_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (this.CallingForm != null)
                this.CallingForm.Show();
        }
        //close the form and show other form
        private void animalShelterToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this.CallingForm != null)
            {
                this.Close();
            }
        }

        private void learnButton_Click(object sender, EventArgs e)
        {
            try
            {// initiate variables
                double lifespan = Double.Parse(lifespanTextBox.Text);
                string species = animalTextBox.Text.ToLower();
                
                //switch statement choosing which class will be used and display appropriate information. 
                switch (species)
                {
                    case "dog":
                        Dog dog = new Dog(lifespan, 4);
                        Display(dog.Info());
                        break;
                    case "cat":
                        Cat cat = new Cat(lifespan, 4);
                        Display(cat.Info());
                        break;
                    case "lizard":
                        Lizard lizard = new Lizard(lifespan, 4);
                        Display(lizard.Info());
                        break;
                    case "bird":
                        Bird bird = new Bird(lifespan, 2);
                        Display(bird.Info());
                        break;
                    default:
                        Animal animal = new Animal(lifespan);
                        Display(animal.Info());
                        break;
                }
            }catch(FormatException)
            {
                MessageBox.Show("Please enter a number please.");
            }catch(ArgumentOutOfRangeException)
            {
                MessageBox.Show("The lifespan must be greater than 0.");
            }
        }
        //display method to show all relevent information of the class. 
        public void Display(List<string> info)
        {
            //counter to go through list
            int counter = 0;
            //if list does have leg value display that value else ignore
            if (info.Count > 3)
            {
                legsLabel.Text = info[counter];
                counter++;
            }
            else
                legsLabel.Text = "";
            //display information to labels. 
            soundLabel.Text = info[counter];
            counter++;
            movementLabel.Text = info[counter];
            counter++;
            lifespanLabel.Text = info[counter];
        }
    }
}
