/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * Cette classe contient le coeur du robot. La structure du robot (incluant les sous-systèmes,
 * les commandes et les boutons) devrait être déclarée ici, et non dans la classe Robot.
 */
public class RobotContainer {

  // Déclarez ici les sous-systèmes. Par exemple :
  private final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

  // Déclarez ici les manettes de jeu. Par exemple :
  // private Joystick joystick = new Joystick(0);
  // private XboxController xboxController = new XboxController(1);
  
  // Commande autonome. Vous pouvez changer le type utilisé.
  private final ExampleCommand autoCommand = new ExampleCommand(exampleSubsystem);


  /**
   * Constructeur.
   */
  public RobotContainer() {
    // Assigner les commandes par défaut. Par exemple :
    // exampleSubsystem.setDefaultCommand(new ExampleCommand(exampleSubsystem));

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Utilisez cette méthode pour définir les lien bouton->commande. Les boutons (JoystickButton)
   * peuvent être créer à partir d'un Joystick ou d'un XboxController.
   */
  private void configureButtonBindings() {
    // Par exemple :
    // new JoystickButton(joystick, 1).whenPressed(new ExampleCommand(exampleSubsystem));
  }


  /**
   * Utilisez cette méthode pour passer le commande du mode autonome à la classe principale Robot.
   *
   * @return la commande à exécuter en mode autonome
   */
  public Command getAutonomousCommand() {
    return autoCommand;
  }
}
