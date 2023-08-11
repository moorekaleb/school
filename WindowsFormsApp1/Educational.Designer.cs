
namespace WindowsFormsApp1
{
    partial class Educational
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.animalShelterToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.learnButton = new System.Windows.Forms.Button();
            this.speciesLabel = new System.Windows.Forms.Label();
            this.animalTextBox = new System.Windows.Forms.TextBox();
            this.promptLabel = new System.Windows.Forms.Label();
            this.lifespanTextBox = new System.Windows.Forms.TextBox();
            this.liveLabel = new System.Windows.Forms.Label();
            this.soundLabel = new System.Windows.Forms.Label();
            this.movementLabel = new System.Windows.Forms.Label();
            this.legsLabel = new System.Windows.Forms.Label();
            this.lifespanLabel = new System.Windows.Forms.Label();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.animalShelterToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(576, 30);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // animalShelterToolStripMenuItem
            // 
            this.animalShelterToolStripMenuItem.Name = "animalShelterToolStripMenuItem";
            this.animalShelterToolStripMenuItem.Size = new System.Drawing.Size(120, 26);
            this.animalShelterToolStripMenuItem.Text = "Animal Shelter";
            this.animalShelterToolStripMenuItem.Click += new System.EventHandler(this.animalShelterToolStripMenuItem_Click);
            // 
            // learnButton
            // 
            this.learnButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.learnButton.Location = new System.Drawing.Point(230, 367);
            this.learnButton.Name = "learnButton";
            this.learnButton.Size = new System.Drawing.Size(119, 53);
            this.learnButton.TabIndex = 1;
            this.learnButton.Text = "Learn";
            this.learnButton.UseVisualStyleBackColor = true;
            this.learnButton.Click += new System.EventHandler(this.learnButton_Click);
            // 
            // speciesLabel
            // 
            this.speciesLabel.AutoSize = true;
            this.speciesLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.speciesLabel.Location = new System.Drawing.Point(16, 89);
            this.speciesLabel.Name = "speciesLabel";
            this.speciesLabel.Size = new System.Drawing.Size(357, 24);
            this.speciesLabel.TabIndex = 2;
            this.speciesLabel.Text = "What Animal do you want to learn about? ";
            // 
            // animalTextBox
            // 
            this.animalTextBox.Location = new System.Drawing.Point(379, 91);
            this.animalTextBox.Name = "animalTextBox";
            this.animalTextBox.Size = new System.Drawing.Size(126, 22);
            this.animalTextBox.TabIndex = 3;
            // 
            // promptLabel
            // 
            this.promptLabel.AutoSize = true;
            this.promptLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.promptLabel.Location = new System.Drawing.Point(82, 44);
            this.promptLabel.Name = "promptLabel";
            this.promptLabel.Size = new System.Drawing.Size(399, 24);
            this.promptLabel.TabIndex = 4;
            this.promptLabel.Text = "We know about Dogs, Cats, Lizards, and Birds.";
            // 
            // lifespanTextBox
            // 
            this.lifespanTextBox.Location = new System.Drawing.Point(379, 130);
            this.lifespanTextBox.Name = "lifespanTextBox";
            this.lifespanTextBox.Size = new System.Drawing.Size(126, 22);
            this.lifespanTextBox.TabIndex = 6;
            // 
            // liveLabel
            // 
            this.liveLabel.AutoSize = true;
            this.liveLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.liveLabel.Location = new System.Drawing.Point(16, 128);
            this.liveLabel.Name = "liveLabel";
            this.liveLabel.Size = new System.Drawing.Size(260, 24);
            this.liveLabel.TabIndex = 5;
            this.liveLabel.Text = "How many years do they live?";
            // 
            // soundLabel
            // 
            this.soundLabel.AutoSize = true;
            this.soundLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.soundLabel.Location = new System.Drawing.Point(25, 251);
            this.soundLabel.Name = "soundLabel";
            this.soundLabel.Size = new System.Drawing.Size(0, 24);
            this.soundLabel.TabIndex = 7;
            // 
            // movementLabel
            // 
            this.movementLabel.AutoSize = true;
            this.movementLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.movementLabel.Location = new System.Drawing.Point(25, 218);
            this.movementLabel.Name = "movementLabel";
            this.movementLabel.Size = new System.Drawing.Size(0, 24);
            this.movementLabel.TabIndex = 8;
            // 
            // legsLabel
            // 
            this.legsLabel.AutoSize = true;
            this.legsLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.legsLabel.Location = new System.Drawing.Point(25, 285);
            this.legsLabel.Name = "legsLabel";
            this.legsLabel.Size = new System.Drawing.Size(0, 24);
            this.legsLabel.TabIndex = 9;
            // 
            // lifespanLabel
            // 
            this.lifespanLabel.AutoSize = true;
            this.lifespanLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lifespanLabel.Location = new System.Drawing.Point(25, 186);
            this.lifespanLabel.Name = "lifespanLabel";
            this.lifespanLabel.Size = new System.Drawing.Size(0, 24);
            this.lifespanLabel.TabIndex = 10;
            // 
            // Educational
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(576, 450);
            this.Controls.Add(this.lifespanLabel);
            this.Controls.Add(this.legsLabel);
            this.Controls.Add(this.movementLabel);
            this.Controls.Add(this.soundLabel);
            this.Controls.Add(this.lifespanTextBox);
            this.Controls.Add(this.liveLabel);
            this.Controls.Add(this.promptLabel);
            this.Controls.Add(this.animalTextBox);
            this.Controls.Add(this.speciesLabel);
            this.Controls.Add(this.learnButton);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Educational";
            this.Text = "Educational";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem animalShelterToolStripMenuItem;
        private System.Windows.Forms.Button learnButton;
        private System.Windows.Forms.Label speciesLabel;
        private System.Windows.Forms.TextBox animalTextBox;
        private System.Windows.Forms.Label promptLabel;
        private System.Windows.Forms.TextBox lifespanTextBox;
        private System.Windows.Forms.Label liveLabel;
        private System.Windows.Forms.Label soundLabel;
        private System.Windows.Forms.Label movementLabel;
        private System.Windows.Forms.Label legsLabel;
        private System.Windows.Forms.Label lifespanLabel;
    }
}