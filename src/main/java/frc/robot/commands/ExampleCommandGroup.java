package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

/**
 * ExampleCommandGroup.
 * 
 * Dans cet exemple, la classe parent est SequentialCommandGroup. 
 * Elle peut être changée, au besoin. Les 4 choix possibles :
 * - SequentialCommandGroup
 * - ParallelCommandGroup
 * - ParallelRaceGroup
 * - ParallelDeadlineGroup
 */
public class ExampleCommandGroup extends SequentialCommandGroup {

    /**
     * Constructeur.
     * On doit ajouter, en paramètres, les sous-systèmes utilisés par le groupe.
     */
    public ExampleCommandGroup(/* ExampleSubsystem exampleSubsystem, ... */) {
        // Ajouter les commandes à exécuter dans le groupe.
        // super(command1, command2, ...);
        
    }
    
}