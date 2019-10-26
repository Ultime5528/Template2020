/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * Une commande ExampleCommand qui utilise ExampleSubsystem.
 * Habituellement, on décrit ici ce que la commande fait concrètement.
 */
public class ExampleCommand extends CommandBase {
  
  // Déclarez ici les attributs de la commande, incluant les sous-systèmes qu'elle utilisent.
  private final ExampleSubsystem subsystem;

  /**
   * Constructeur. Il doit recevoir en paramètres le ou les sous-systèmes utilisés.
   */
  public ExampleCommand(ExampleSubsystem _subsystem) {
    // Conserve les sous-systèmes en attribut.
    subsystem = _subsystem;

    // Ajoute le ou les sous-systèmes dans les "requirements".
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {
    // Cette méthode sera appelée une fois, lorsque la commande débute son exécution.

  }
  
  @Override
  public void execute() {
    // Cette méthode sera appelée périodiquement, tant que la commande s'exécute..
    
  }

  @Override
  public boolean isFinished() {
    // Si la commmande retourne true, elle terminera son exécution.
    return false;
  }

  @Override
  public void end(boolean interrupted) {
    // Cette méthode sera appelée une fois, à la fin de l'exécution de la méthode.
    // Le booléen interrupted indique si la commande a été interrompue ou si elle s'est 
    // terminée par elle-même.

  }

}
