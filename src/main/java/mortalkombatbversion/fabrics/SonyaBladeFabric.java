/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mortalkombatbversion.fabrics;


import mortalkombatbversion.gamecompnonets.Player;
import mortalkombatbversion.heroes.SonyaBlade;

/**
 *
 * @author Мария
 */
public class SonyaBladeFabric implements EnemyFabricInterface {

    @Override
    public Player create() {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}
