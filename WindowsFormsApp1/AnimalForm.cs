using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Validation;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class AnimalForm : Form
    {
       
        public AnimalForm()
        {
            InitializeComponent();
        }

        private AnimalExamples.Animal_PoundEntities dbcontext = null;

        private void RefreshContents()
        {
            //if context is not empty, empty it
            if (dbcontext != null)
                dbcontext.Dispose();

            //fill context
            dbcontext = new AnimalExamples.Animal_PoundEntities();

            //order information by form
            dbcontext.Animals.OrderBy(entry => entry.Animal_ID).ThenBy(entry => entry.Species).ThenBy(entry => entry.Name).Load();
            //specify data source
            animalBindingSource.DataSource = dbcontext.Animals.Local;
            animalBindingSource.MoveFirst();//move to first tab
            findTextBox.Clear();//clear findtextboxes
        }

        private void AnimalForm_Load(object sender, EventArgs e)
        {
            //loads form with database information
            RefreshContents();
        }

        private void animalBindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            Validate();//ensure each text box has information entered
            animalBindingSource.EndEdit();//finish current edit

            try//try to save changes
            {
                dbcontext.SaveChanges();
            }
            catch ( DbEntityValidationException )
            {
                MessageBox.Show("The text boxes must contain a value to save.");
            }
            RefreshContents();
        }

        private void findButton_Click(object sender, EventArgs e)
        {
            //get information from database for search criteria
            var speciesQuery = from Animal in dbcontext.Animals
                               where Animal.Species.Equals(findTextBox.Text)
                               orderby Animal.Species, Animal.Name, Animal.Age
                               select Animal;

            //add list information to datasource
            animalBindingSource.DataSource = speciesQuery.ToList();
            animalBindingSource.MoveFirst();
            //disable navigator editing options
            bindingNavigatorAddNewItem.Enabled = false;
            bindingNavigatorDeleteItem.Enabled = false;
        }

        private void allButton_Click(object sender, EventArgs e)
        {
            //enable navigator editing options
            bindingNavigatorDeleteItem.Enabled = true;
            bindingNavigatorAddNewItem.Enabled = true;
            //provide all database entries
            RefreshContents();
        }

        private void form2Button_Click(object sender, EventArgs e)
        {
            this.Hide();
            Educational f2 = new Educational(this);
            f2.Show();
            
        }
    }
}
