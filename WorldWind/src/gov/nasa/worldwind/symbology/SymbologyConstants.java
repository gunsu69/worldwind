/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.symbology;

import java.util.*;

/**
 * Defines constants used by the World Wind symbology classes, including symbolic constants and modifier keys for
 * MIL-STD-2525 tactical symbols and tactical graphics.
 *
 * @author dcollins
 * @version $Id$
 */
public interface SymbologyConstants
{
    /**
     * Indicates the auxiliary equipment code associated with a MIL-STD-2525 symbol (SIDC positions 11-12). A symbol's
     * auxiliary equipment is currently used to define towed sonar arrays. See MIL-STD-2525C section 5.3.4.4 (page 27)
     * and table VII (page 28). When used as a key, the corresponding value must be one of the following:
     * <p/>
     * <ul> <li>AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_SHORT</li> <li>AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_LONG</li>
     * </ul>
     * <p/>
     * The auxiliary equipment codes are the same for all symbology schemes that use them, and are defined in each
     * appendix of the MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.f (page 51) and table A-II (pages 52-54)</li> </ul>
     */
    final String AUXILIARY_EQUIPMENT = "gov.nasa.worldwind.symbology.AuxiliaryEquipment";
    /**
     * The MIL-STD-2525 Towed Sonar Array (Long) auxiliary equipment code. See MIL-STD-2525C section 5.3.4.4 (page 27)
     * and table VII (page 28).
     */
    final String AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_LONG = "NL";
    /**
     * The MIL-STD-2525 Towed Sonar Array (Short) auxiliary equipment code. See MIL-STD-2525C section 5.3.4.4 (page 27)
     * and table VII (page 28).
     */
    final String AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_SHORT = "NS";
    /** List containing all recognized MIL-STD-2525 auxiliary equipment codes. */
    final List<String> AUXILIARY_EQUIPMENT_ALL = Arrays.asList(
        AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_SHORT,
        AUXILIARY_EQUIPMENT_TOWED_SONAR_ARRAY_LONG
    );

    /**
     * Indicates the battle dimension code associated with a MIL-STD-2525 symbol (SIDC position 3). A symbol's battle
     * dimension defines the primary mission area for the object being represented. See MIL-STD-2525C section 5.3.1.3
     * (page 17), table I (page 15) and table II (page 16). When used as a key, the corresponding value must be one of
     * the following:
     * <p/>
     * <ul> <li>BATTLE_DIMENSION_SPACE</li> <li>BATTLE_DIMENSION_AIR</li> <li>BATTLE_DIMENSION_GROUND</li>
     * <li>BATTLE_DIMENSION_SEA_SURFACE</li> <li>BATTLE_DIMENSION_SEA_SUBSURFACE</li> <li>BATTLE_DIMENSION_SOF</li>
     * <li>BATTLE_DIMENSION_OTHER</li> </ul>
     * <p/>
     * The battle dimension codes are the same for all symbology schemes that use them, and are defined in each appendix
     * of the MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.c (page 51) and table A-I (page 51)</li> <li>Signals Intelligence -
     * section D.5.2.1.c (page 963) and table D-I (page 964)</li> </ul>
     */
    final String BATTLE_DIMENSION = "gov.nasa.worldwind.symbology.BattleDimension";
    /**
     * The MIL-STD-2525 Air battle dimension code. Indicates a symbol who's mission area is between the surface of the
     * Earth and the space dimension. See MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_AIR = "A";
    /**
     * The MIL-STD-2525 Ground battle dimension code. Indicates a symbol who's mission area is on the land surface. See
     * MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_GROUND = "G";
    /**
     * The MIL-STD-2525 Other battle dimension code. Indicates a symbol who's mission area is not one of the pre-defined
     * areas: space, air, ground, sea surface, sea subsurface, or special operations forces. See MIL-STD-2525C section
     * 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_OTHER = "X";
    /**
     * The MIL-STD-2525 Sea Subsurface battle dimension code. Indicates a symbol who's mission area is below the sea
     * surface. See MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_SEA_SUBSURFACE = "U";
    /**
     * The MIL-STD-2525 Sea Surface battle dimension code. Indicates a symbol who's mission area is on the sea surface.
     * See MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_SEA_SURFACE = "S";
    /**
     * The MIL-STD-2525 Special Operations Forces (SOF) battle dimension code. See MIL-STD-2525C section 5.3.1.3 (page
     * 17).
     */
    final String BATTLE_DIMENSION_SOF = "F";
    /**
     * The MIL-STD-2525 Space battle dimension code. Indicates a symbol who's mission area is at the lower boundary of
     * the Earth's ionosphere or above. See MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_SPACE = "P";
    /**
     * The MIL-STD-2525 Unknown battle dimension code. Indicates a symbol who's battle dimension either has not been
     * determined or cannot be determined. See MIL-STD-2525C section 5.3.1.3 (page 17).
     */
    final String BATTLE_DIMENSION_UNKNOWN = "Z";
    /** List containing all recognized MIL-STD-2525 battle dimension codes. */
    final List<String> BATTLE_DIMENSION_ALL = Arrays.asList(
        BATTLE_DIMENSION_SPACE,
        BATTLE_DIMENSION_AIR,
        BATTLE_DIMENSION_GROUND,
        BATTLE_DIMENSION_SEA_SURFACE,
        BATTLE_DIMENSION_SEA_SUBSURFACE,
        BATTLE_DIMENSION_SOF,
        BATTLE_DIMENSION_OTHER,
        BATTLE_DIMENSION_UNKNOWN
    );
    /** List containing all recognized MIL-STD-2525 battle dimension codes for the Signals Intelligence scheme. */
    final List<String> BATTLE_DIMENSION_ALL_INTELLIGENCE = Arrays.asList(
        BATTLE_DIMENSION_SPACE,
        BATTLE_DIMENSION_AIR,
        BATTLE_DIMENSION_GROUND,
        BATTLE_DIMENSION_SEA_SURFACE,
        BATTLE_DIMENSION_SEA_SUBSURFACE,
        BATTLE_DIMENSION_OTHER,
        BATTLE_DIMENSION_UNKNOWN
    );

    /**
     * Indicates the category code associated with a MIL-STD-2525 symbol (SIDC position 3). The meaning of a symbol's
     * category and the recognized values depend on the specific MIL-STD-2525 symbology scheme the symbol belongs to,
     * and are defined in each appendix of the MIL-STD-2525C specification:
     * <p/>
     * <strong>Tactical Graphics</strong> <br/> See MIL-STD-2525C section B5.2.1.c (page 304) and table B-I (page 305).
     * <p/>
     * <ul> <li>CATEGORY_TASKS</li> <li>CATEGORY_COMMAND_CONTROL_GENERAL_MANEUVER</li>
     * <li>CATEGORY_MOBILITY_SURVIVABILITY</li> <li>CATEGORY_FIRE_SUPPORT</li> <li>CATEGORY_COMBAT_SERVICE_SUPPORT</li>
     * <li>CATEGORY_OTHER</li> </ul>
     * <p/>
     * <strong>Stability Operations</strong> <br/> See MIL-STD-2525C section E5.2.1.c (page 991) and table E-I (page
     * 991).
     * <p/>
     * <ul> <li>CATEGORY_VIOLENT_ACTIVITIES</li> <li>CATEGORY_LOCATIONS</li> <li>CATEGORY_OPERATIONS</li>
     * <li>CATEGORY_ITEMS</li> <li>CATEGORY_INDIVIDUAL</li> <li>CATEGORY_NONMILITARY_GROUP_ORGANIZATION</li>
     * <li>CATEGORY_RAPE</li> </ul>
     * <p/>
     * <strong>Emergency Management</strong> <br/> See MIL-STD-2525C table G-I (page 1032).
     * <p/>
     * <ul> <li>CATEGORY_INCIDENT</li> <li>CATEGORY_NATURAL_EVENTS</li> <li>CATEGORY_OPERATIONS</li>
     * <li>CATEGORY_INFRASTRUCTURE</li> </ul>
     */
    final String CATEGORY = "gov.nasa.worldwind.symbology.Category";
    /**
     * The MIL-STD-2525 Command and Control General Maneuver category code, used by symbols belonging to the Tactical
     * Graphics scheme.
     */
    final String CATEGORY_COMMAND_CONTROL_GENERAL_MANEUVER = "G";
    /**
     * The MIL-STD-2525 Combat Service Support category code, used by symbols belonging to the Tactical Graphics
     * scheme.
     */
    final String CATEGORY_COMBAT_SERVICE_SUPPORT = "S";
    /** The MIL-STD-2525 Fire Support category code, used by symbols belonging to the Tactical Graphics scheme. */
    final String CATEGORY_FIRE_SUPPORT = "F";
    /** The MIL-STD-2525 Incident category code, used by symbols belonging to the Emergency Management scheme. */
    final String CATEGORY_INCIDENT = "I";
    /** The MIL-STD-2525 Individual category code, used by symbols belonging to the Stability Operations scheme. */
    final String CATEGORY_INDIVIDUAL = "P";
    /** The MIL-STD-2525 Infrastructure category code, used by symbols belonging to the Emergency Management scheme. */
    final String CATEGORY_INFRASTRUCTURE = "F";
    /** The MIL-STD-2525 Items category code, used by symbols belonging to the Stability Operations scheme. */
    final String CATEGORY_ITEMS = "I";
    /** The MIL-STD-2525 Locations category code, used by symbols belonging to the Stability Operations scheme. */
    final String CATEGORY_LOCATIONS = "L";
    /**
     * The MIL-STD-2525 Mobility/Survivability category code, used by symbols belonging to the Tactical Graphics
     * scheme.
     */
    final String CATEGORY_MOBILITY_SURVIVABILITY = "M";
    /** The MIL-STD-2525 Natural Events category code, used by symbols belonging to the Emergency Management scheme. */
    final String CATEGORY_NATURAL_EVENTS = "N";
    /**
     * The MIL-STD-2525 Non-Military Group or Organization category code, used by symbols belonging to the Stability
     * Operations scheme.
     */
    final String CATEGORY_NONMILITARY_GROUP_ORGANIZATION = "G";
    /**
     * The MIL-STD-2525 Operations category code, used by symbols belonging to the Stability Operations and Emergency
     * Management schemes.
     */
    final String CATEGORY_OPERATIONS = "O";
    /** The MIL-STD-2525 Other category code, used by symbols belonging to the Tactical Graphics scheme. */
    final String CATEGORY_OTHER = "O";
    /** The MIL-STD-2525 Rape category code, used by symbols belonging to the Stability Operations scheme. */
    final String CATEGORY_RAPE = "R";
    /** The MIL-STD-2525 Tasks category code, used by symbols belonging to the Tactical Graphics scheme. */
    final String CATEGORY_TASKS = "T";
    /** The MIL-STD-2525 Violent Activities category code, used by symbols belonging to the Stability Operations scheme. */
    final String CATEGORY_VIOLENT_ACTIVITIES = "V";
    /** List containing all recognized MIL-STD-2525 category codes. */
    final List<String> CATEGORY_ALL = Arrays.asList(
        // Tactical Graphics category codes.
        CATEGORY_TASKS,
        CATEGORY_COMMAND_CONTROL_GENERAL_MANEUVER,
        CATEGORY_MOBILITY_SURVIVABILITY,
        CATEGORY_FIRE_SUPPORT,
        CATEGORY_COMBAT_SERVICE_SUPPORT,
        CATEGORY_OTHER,
        // Stability Operations category codes.
        CATEGORY_VIOLENT_ACTIVITIES,
        CATEGORY_LOCATIONS,
        CATEGORY_OPERATIONS,
        CATEGORY_ITEMS,
        CATEGORY_INDIVIDUAL,
        CATEGORY_NONMILITARY_GROUP_ORGANIZATION,
        CATEGORY_RAPE,
        // Emergency Management category codes (CATEGORY_OPERATIONS already included from Tactical Graphics).
        CATEGORY_INCIDENT,
        CATEGORY_NATURAL_EVENTS,
        CATEGORY_INFRASTRUCTURE
    );
    /** List containing all recognized MIL-STD-2525 category codes for the Tactical Graphics scheme. */
    final List<String> CATEGORY_ALL_TACTICAL_GRAPHICS = Arrays.asList(
        CATEGORY_TASKS,
        CATEGORY_COMMAND_CONTROL_GENERAL_MANEUVER,
        CATEGORY_MOBILITY_SURVIVABILITY,
        CATEGORY_FIRE_SUPPORT,
        CATEGORY_COMBAT_SERVICE_SUPPORT,
        CATEGORY_OTHER
    );
    /** List containing all recognized MIL-STD-2525 category codes for the Stability Operations scheme. */
    final List<String> CATEGORY_ALL_STABILITY_OPERATIONS = Arrays.asList(
        CATEGORY_VIOLENT_ACTIVITIES,
        CATEGORY_LOCATIONS,
        CATEGORY_OPERATIONS,
        CATEGORY_ITEMS,
        CATEGORY_INDIVIDUAL,
        CATEGORY_NONMILITARY_GROUP_ORGANIZATION,
        CATEGORY_RAPE
    );
    /** List containing all recognized MIL-STD-2525 category codes for the Emergency Management scheme. */
    final List<String> CATEGORY_ALL_EMERGENCY_MANAGEMENT = Arrays.asList(
        CATEGORY_INCIDENT,
        CATEGORY_NATURAL_EVENTS,
        CATEGORY_OPERATIONS,
        CATEGORY_INFRASTRUCTURE
    );

    /**
     * Indicates the country code associated with a MIL-STD-2525 symbol (SIDC positions 13-14). See <a
     * href="http://www.iso.org/iso/country_codes.htm" target="_blank">ISO 3166-1</a> for a definition of valid country
     * codes. The country codes are the same for all symbology schemes that use them:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.g and table A-I (page 51)</li> <li>Tactical Graphics - section B.5.2.1.g
     * (page 304) and table B-I (page 305)</li> <li>Signals Intelligence - section D.5.2.1.g and table D-I (page
     * 964)</li> <li>Stability Operations - section E.5.2.1.g and table E-I (page 991)</li> <li>Emergency Management -
     * table G-I (page 1032)</li> </ul>
     */
    final String COUNTRY_CODE = "gov.nasa.worldwind.symbology.CountryCode";

    /**
     * Indicates the echelon code associated with a MIL-STD-2525 symbol (SIDC position 12). A symbol's echelon defines
     * the command level of a unit represented by the symbol. See MIL-STD-2525 section 5.3.4.2 (page 25), section
     * 5.5.2.2 (page 40), and table V (pages 25-26). When used as a key, the corresponding value must be one of the
     * following:
     * <p/>
     * <ul> <li>ECHELON_TEAM_CREW</li> <li>ECHELON_SQUAD</li> <li>ECHELON_SECTION</li>
     * <li>ECHELON_PLATOON_DETACHMENT</li> <li>ECHELON_COMPANY_BATTERY_TROOP</li> <li>ECHELON_BATTALION_SQUADRON</li>
     * <li>ECHELON_REGIMENT_GROUP</li> <li>ECHELON_BRIGADE</li> <li>ECHELON_DIVISION</li> <li>ECHELON_CORPS</li>
     * <li>ECHELON_ARMY</li> <li>ECHELON_ARMY_GROUP_FRONT</li> <li>ECHELON_REGION</li> <li>ECHELON_COMMAND</li> </ul>
     * <p/>
     * The echelon codes are the same for all symbology schemes that use them, and are defined in each appendix of the
     * MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.f (page 51) and table A-II (pages 52-54)</li> <li>Tactical Graphics -
     * section B.5.2.1.f (page 304) and table B-II (page 305)</li> <li>Stability Operations - section E.5.2.1.f (page
     * 991) and table E-II (pages 992-994)</li> </ul>
     */
    final String ECHELON = "gov.nasa.worldwind.symbology.Echelon";
    /**
     * The MIL-STD-2525 Army echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_ARMY = "K";
    /**
     * The MIL-STD-2525 Army/Group/Front echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page
     * 40), and table V (pages 25-26).
     */
    final String ECHELON_ARMY_GROUP_FRONT = "L";
    /**
     * The MIL-STD-2525 Battalion/Squadron echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2
     * (page 40), and table V (pages 25-26).
     */
    final String ECHELON_BATTALION_SQUADRON = "F";
    /**
     * The MIL-STD-2525 Brigade echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_BRIGADE = "H";
    /**
     * The MIL-STD-2525 Command echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_COMMAND = "N";
    /**
     * The MIL-STD-2525 Company/Battery/Troop echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2
     * (page 40), and table V (pages 25-26).
     */
    final String ECHELON_COMPANY_BATTERY_TROOP = "E";
    /**
     * The MIL-STD-2525 Corps echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_CORPS = "J";
    /**
     * The MIL-STD-2525 Division echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40),
     * and table V (pages 25-26).
     */
    final String ECHELON_DIVISION = "I";
    /**
     * The MIL-STD-2525 Platoon/Detachment echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2
     * (page 40), and table V (pages 25-26).
     */
    final String ECHELON_PLATOON_DETACHMENT = "D";
    /**
     * The MIL-STD-2525 Section echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_SECTION = "C";
    /**
     * The MIL-STD-2525 Squad echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_SQUAD = "B";
    /**
     * The MIL-STD-2525 Team/Crew echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40),
     * and table V (pages 25-26).
     */
    final String ECHELON_TEAM_CREW = "A";
    /**
     * The MIL-STD-2525 Regiment/Group echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page
     * 40), and table V (pages 25-26).
     */
    final String ECHELON_REGIMENT_GROUP = "G";
    /**
     * The MIL-STD-2525 Region echelon code. See MIL-STD-2525 section 5.3.4.2 (page 25), section 5.5.2.2 (page 40), and
     * table V (pages 25-26).
     */
    final String ECHELON_REGION = "M";
    /** List containing all recognized MIL-STD-2525 echelon codes. */
    final List<String> ECHELON_ALL = Arrays.asList(
        ECHELON_TEAM_CREW,
        ECHELON_SQUAD,
        ECHELON_SECTION,
        ECHELON_PLATOON_DETACHMENT,
        ECHELON_COMPANY_BATTERY_TROOP,
        ECHELON_BATTALION_SQUADRON,
        ECHELON_REGIMENT_GROUP,
        ECHELON_BRIGADE,
        ECHELON_DIVISION,
        ECHELON_CORPS,
        ECHELON_ARMY,
        ECHELON_ARMY_GROUP_FRONT,
        ECHELON_REGION,
        ECHELON_COMMAND
    );

    /**
     * Symbol modifier key indicating whether a MIL-STD-2525 symbol's represented object is a feint/dummy. A feint/dummy
     * symbol indicates a unit, equipment, or installation designed to draw the enemy's attention away from the area of
     * the main attack. When a marked as a feint/dummy, a symbol's graphic is changed to include a dashed inverted "V"
     * above its frame. See MIL-STD-2525 section 5.3.4.7 (page 28). When used as a key, the corresponding value must be
     * a boolean value. The value is <code>true</code> if the symbol's represented object is a feint/dummy, and
     * <code>false</code> otherwise.
     * <p/>
     * The following symbology schemes support the feint/dummy modifier:
     * <p/>
     * <ul> <li>Warfighting</li> <li>Stability Operations</li> </ul>
     * <p/>
     */
    final String FEINT_DUMMY = "gov.nasa.worldwind.symbology.FeintDummy";

    /**
     * Indicates the function ID associated with a MIL-STD-2525 symbol (SIDC positions 5-10). The function IDs are
     * unique to each symbology schemes that uses them, and are defined in each appendix of the MIL-STD-2525C
     * specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.e (page 51) and table A-I (page 51)</li> <li>Tactical Graphics - section
     * B.5.2.1.e (page 304) and table B-I (page 305)</li> <li>Meteorological and Oceanographic - section C.5.2.1.d (page
     * 763) and table C-I (page 763)</li> <li>Signals Intelligence - section D.5.2.1.e (page 964) and table D-I (page
     * 964)</li> <li>Stability Operations - section E.5.2.1.e (page 991) and table E-I (page 991)</li> <li>Emergency
     * Management - table G-I (page 1032)</li> </ul>
     * <p/>
     */
    final String FUNCTION_ID = "gov.nasa.worldwind.symbology.FunctionId";

    /**
     * Symbol modifier key indicating whether a MIL-STD-2525 symbol's represented object is a headquarters. A
     * headquarters symbol indicates the headquarters associated with a unit, equipment, or installation. When a marked
     * as an headquarters, a symbol's graphic is changed to include a line extending downward from the left side of its
     * frame. See MIL-STD-2525 section 5.3.4.8 (page 29). When used as a key, the corresponding value must be a boolean
     * value. The value is <code>true</code> if the symbol's represented object is a headquarters, and
     * <code>false</code> otherwise.
     * <p/>
     * The following symbology schemes support the headquarters modifier:
     * <p/>
     * <ul> <li>Warfighting</li> <li>Stability Operations</li> </ul>
     */
    final String HEADQUARTERS = "gov.nasa.worldwind.symbology.Headquarters";

    /**
     * Symbol modifier key indicating the installation code associated with a MIL-STD-2525 symbol (SIDC positions
     * 11-12). When a marked as an installation, a symbol's represented object is a military camp or base. See
     * MIL-STD-2525 section 5.3.4.5 (page 28). When used as a key, the corresponding value must be one of the
     * following:
     * <p/>
     * <ul> <li>INSTALLATION_NORMAL</li> <li>INSTALLATION_FEINT_DUMMY</li>  </ul>
     * <p/>
     * The installation codes are the same for all symbology schemes that use them, and are defined in each appendix of
     * the MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.f (page 51) and table A-II (pages 52-54)</li> <li>Stability Operations -
     * section E.5.2.1.f (page 991) and table E-II (pages 992-994)</li> <li>Emergency Management - section G.5.5.5 (page
     * 1030) and table G-II (page 1032)</li> </ul>
     */
    final String INSTALLATION = "gov.nasa.worldwind.symbology.Installation";
    /**
     * The MIL-STD-2525 Normal (as opposed to Feint/Dummy) installation code. See MIL-STD-2525 section 5.3.4.5 (page
     * 28).
     */
    final String INSTALLATION_NORMAL = "H-";
    /** The MIL-STD-2525 Feint/Dummy installation code. See MIL-STD-2525 section 5.3.4.5 (page 28). */
    final String INSTALLATION_FEINT_DUMMY = "HB";
    /** List containing all recognized MIL-STD-2525 installation codes. */
    final List<String> INSTALLATION_ALL = Arrays.asList(
        INSTALLATION_NORMAL,
        INSTALLATION_FEINT_DUMMY
    );

    /**
     * Symbol modifier key indicating the equipment mobility code associated with a MIL-STD-2525 symbol (SIDC positions
     * 11-12). A symbol's mobility defines the mobility feature of the represented object, other than mobility intrinsic
     * to the represented object. Mobility codes are currently used only to describe mobility features of equipment. See
     * MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). When used as a key, the corresponding value
     * must be one of the following:
     * <p/>
     * <ul> <li>MOBILITY_WHEELED</li> <li>MOBILITY_CROSS_COUNTRY</li> <li>MOBILITY_TRACKED</li>
     * <li>MOBILITY_WHEELED_TRACKED_COMBINATION</li> <li>MOBILITY_TOWED</li> <li>MOBILITY_RAIL</li>
     * <li>MOBILITY_OVER_THE_SNOW</li> <li>MOBILITY_SLED</li> <li>MOBILITY_PACK_ANIMALS</li> <li>MOBILITY_BARGE</li>
     * <li>MOBILITY_AMPHIBIOUS</li> </ul>
     * <p/>
     * The mobility codes are the same for all symbology schemes that use them, and are defined in each appendix of the
     * MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.f (page 51) and table A-II (pages 52-54)</li> <li>Emergency Management -
     * section G.5.5.5 (page 1030) and table G-II (page 1032)</li> </ul>
     */
    final String MOBILITY = "gov.nasa.worldwind.symbology.Mobility";
    /**
     * The MIL-STD-2525 Amphibious Mobility mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI
     * (pages 26-27).
     */
    final String MOBILITY_AMPHIBIOUS = "MY";
    /** The MIL-STD-2525 Barge mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). */
    final String MOBILITY_BARGE = "MX";
    /**
     * The MIL-STD-2525 Cross Country mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages
     * 26-27).
     */
    final String MOBILITY_CROSS_COUNTRY = "MP";
    /**
     * The MIL-STD-2525 Over The Snow mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages
     * 26-27).
     */
    final String MOBILITY_OVER_THE_SNOW = "MU";
    /**
     * The MIL-STD-2525 Pack Animals mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages
     * 26-27).
     */
    final String MOBILITY_PACK_ANIMALS = "MW";
    /** The MIL-STD-2525 Rail mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). */
    final String MOBILITY_RAIL = "MT";
    /** The MIL-STD-2525 Sled mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). */
    final String MOBILITY_SLED = "MV";
    /** The MIL-STD-2525 Towed mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). */
    final String MOBILITY_TOWED = "MS";
    /** The MIL-STD-2525 Tracked mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and table VI (pages 26-27). */
    final String MOBILITY_TRACKED = "MQ";
    /**
     * The MIL-STD-2525 Wheeled/Limited Cross Country mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and
     * table VI (pages 26-27).
     */
    final String MOBILITY_WHEELED = "MO";
    /**
     * The MIL-STD-2525 Wheeled And Tracked Combination mobility code. See MIL-STD-2525 section 5.3.4.3 (page 26) and
     * table VI (pages 26-27).
     */
    final String MOBILITY_WHEELED_TRACKED_COMBINATION = "MR";
    /** List containing all recognized MIL-STD-2525 mobility codes. */
    final List<String> MOBILITY_ALL = Arrays.asList(
        MOBILITY_WHEELED,
        MOBILITY_CROSS_COUNTRY,
        MOBILITY_TRACKED,
        MOBILITY_WHEELED_TRACKED_COMBINATION,
        MOBILITY_TOWED,
        MOBILITY_RAIL,
        MOBILITY_OVER_THE_SNOW,
        MOBILITY_SLED,
        MOBILITY_PACK_ANIMALS,
        MOBILITY_BARGE,
        MOBILITY_AMPHIBIOUS
    );

    /**
     * Indicates the order of battle code associated with a MIL-STD-2525 symbol (SIDC position 15). A symbol's order of
     * battle provides additional information about the symbol in the operational environment. The recognized values
     * depend on the specific MIL-STD-2525 symbology scheme the symbol belongs to, and are defined in each appendix of
     * the MIL-STD-2525C specification:
     * <p/>
     * <strong>Warfighting, Signals Intelligence, Stability Operations, Emergency Management</strong> <br/> See
     * MIL-STD-2525C section A.5.2.1.h (page 51), table A-I (page 51), section D.5.2.1.h (page 964), table D-I (page
     * 964), section E.5.2.1.h (page 991), table E-I (page 991), and table G-I (page 1032).
     * <p/>
     * <ul> <li>ORDER_OF_BATTLE_AIR</li> <li>ORDER_OF_BATTLE_ELECTRONIC</li> <li>ORDER_OF_BATTLE_CIVILIAN</li>
     * <li>ORDER_OF_BATTLE_GROUND</li> <li>ORDER_OF_BATTLE_MARITIME</li> <li>ORDER_OF_BATTLE_STRATEGIC_FORCE_RELATED</li>
     * </ul>
     * <p/>
     * <strong>Tactical Graphics</strong> <br/> See MIL-STD-2525C section B5.2.1.h (page 304) and table B-I (page 305).
     * <p/>
     * <ul> <li>ORDER_OF_BATTLE_CONTROL_MARKINGS</li> </ul>
     */
    final String ORDER_OF_BATTLE = "gov.nasa.worldwind.symbology.OrderOfBattle";
    /** The MIL-STD-2525 Air order of battle code. */
    final String ORDER_OF_BATTLE_AIR = "A";
    /** The MIL-STD-2525 Civilian order of battle code. */
    final String ORDER_OF_BATTLE_CIVILIAN = "C";
    /** The MIL-STD-2525 Control Markings order of battle code. */
    final String ORDER_OF_BATTLE_CONTROL_MARKINGS = "X";
    /** The MIL-STD-2525 Electronic order of battle code. */
    final String ORDER_OF_BATTLE_ELECTRONIC = "E";
    /** The MIL-STD-2525 Ground order of battle code. */
    final String ORDER_OF_BATTLE_GROUND = "G";
    /** The MIL-STD-2525 Maritime order of battle code. */
    final String ORDER_OF_BATTLE_MARITIME = "N";
    /** The MIL-STD-2525 Strategic Force Related order of battle code. */
    final String ORDER_OF_BATTLE_STRATEGIC_FORCE_RELATED = "S";
    /** List containing all recognized MIL-STD-2525 order of battle codes. */
    final List<String> ORDER_OF_BATTLE_ALL = Arrays.asList(
        ORDER_OF_BATTLE_AIR,
        ORDER_OF_BATTLE_CIVILIAN,
        ORDER_OF_BATTLE_CONTROL_MARKINGS,
        ORDER_OF_BATTLE_ELECTRONIC,
        ORDER_OF_BATTLE_GROUND,
        ORDER_OF_BATTLE_MARITIME,
        ORDER_OF_BATTLE_STRATEGIC_FORCE_RELATED
    );
    /**
     * List containing all recognized MIL-STD-2525 order of battle codes for the Warfighting (UEI), Signals Intelligence
     * (SIGINT), Stability Operations (SO), and Emergency Management (EM) schemes.
     */
    final List<String> ORDER_OF_BATTLE_ALL_UEI_SIGINT_SO_EM = Arrays.asList(
        ORDER_OF_BATTLE_AIR,
        ORDER_OF_BATTLE_ELECTRONIC,
        ORDER_OF_BATTLE_CIVILIAN,
        ORDER_OF_BATTLE_GROUND,
        ORDER_OF_BATTLE_MARITIME,
        ORDER_OF_BATTLE_STRATEGIC_FORCE_RELATED
    );
    /** List containing all recognized MIL-STD-2525 order of battle codes for the Tactical Graphics scheme. */
    final List<String> ORDER_OF_BATTLE_ALL_TACTICAL_GRAPHICS = Arrays.asList(
        ORDER_OF_BATTLE_CONTROL_MARKINGS
    );

    /**
     * Indicates the scheme code associated with a MIL-STD-2525 symbol (SIDC position 1). A symbol's scheme defines the
     * specific MIL-STD-2525 symbology set that it belongs to. The scheme codes are defined in each appendix of the
     * MIL-STD-2525 specification. When used as a key, the corresponding value must be one of the following:
     * <p/>
     * <ul> <li>SCHEME_WARFIGHTING</li> <li>SCHEME_TACTICAL_GRAPHICS</li> <li>SCHEME_METOC</li>
     * <li>SCHEME_INTELLIGENCE</li> <li>SCHEME_STABILITY_OPERATIONS</li> <li>SCHEME_EMERGENCY_MANAGEMENT</li> </ul>
     */
    final String SCHEME = "gov.nasa.worldwind.symbology.Scheme";
    /** The MIL-STD-2525 Emergency Management (EM) scheme code. See MIL-STD-2525C table G-I (page 1032). */
    final String SCHEME_EMERGENCY_MANAGEMENT = "E";
    /** The MIL-STD-2525 Signals Intelligence (SIGINT) scheme code. See MIL-STD-2525C table D-I (page 964). */
    final String SCHEME_INTELLIGENCE = "I";
    /** The MIL-STD-2525 Meteorological and Oceanographic (METOC) scheme code. See MIL-STD-2525C table C-I (page 763). */
    final String SCHEME_METOC = "W";
    /** The MIL-STD-2525 Stability Operations (SO) scheme code. See MIL-STD-2525C table E-I (page 991). */
    final String SCHEME_STABILITY_OPERATIONS = "O";
    /** The MIL-STD-2525 Tactical Graphics scheme code. See MIL-STD-2525C table B-I (page 305). */
    final String SCHEME_TACTICAL_GRAPHICS = "G";
    /**
     * The MIL-STD-2525 Warfighting scheme code. This scheme is also referred to as Units, Equipment, and Installations
     * (UEI). See MIL-STD-2525C table A-I (page 51).
     */
    final String SCHEME_WARFIGHTING = "S";
    /** List containing all recognized MIL-STD-2525 scheme codes. */
    final List<String> SCHEME_ALL = Arrays.asList(
        SCHEME_WARFIGHTING,
        SCHEME_TACTICAL_GRAPHICS,
        SCHEME_METOC,
        SCHEME_INTELLIGENCE,
        SCHEME_STABILITY_OPERATIONS,
        SCHEME_EMERGENCY_MANAGEMENT
    );

    /**
     * Indicates whether to display a MIL-STD-2525 tactical symbol's fill color. See MIL-STD-2525 section 5.4.5 (page
     * 24) and table IX (page 35). When used as a key, the corresponding value must be a boolean value. The value is
     * <code>true</code> if the symbol's fill color should be displayed, and <code>false</code> otherwise.
     */
    final String SHOW_FILL = "gov.nasa.worldwind.symbology.ShowFill";
    /**
     * Indicates whether to display a MIL-STD-2525 tactical symbol's frame. See MIL-STD-2525 section 5.4.5 (page 24) and
     * table IX (page 35). When used as a key, the corresponding value must be a boolean value. The value is
     * <code>true</code> if the symbol's frame should be displayed, and <code>false</code> otherwise.
     */
    final String SHOW_FRAME = "gov.nasa.worldwind.symbology.ShowFrame";
    /**
     * Indicates whether to display a MIL-STD-2525 tactical symbol's icon. See MIL-STD-2525 section 5.4.5 (page 24) and
     * table IX (page 35). When used as a key, the corresponding value must be a boolean value. The value is
     * <code>true</code> if the symbol's icon should be displayed, and <code>false</code> otherwise.
     */
    final String SHOW_ICON = "gov.nasa.worldwind.symbology.ShowIcon";

    /**
     * Indicates the standard identity code associated with a MIL-STD-2525 symbol (SIDC position 2). A symbol's standard
     * identity defines the threat posed by the object being represented. See MIL-STD-2525C section 3.2.39 (page 10),
     * section 5.3.1.1 (page 17), table I (page 15), and table II (page 16). When used as a key, the corresponding value
     * must be one of the following:
     * <p/>
     * <ul> <li>STANDARD_IDENTITY_PENDING</li> <li>STANDARD_IDENTITY_UNKNOWN</li> <li>STANDARD_IDENTITY_ASSUMED_FRIEND</li>
     * <li>STANDARD_IDENTITY_FRIEND</li> <li>STANDARD_IDENTITY_NEUTRAL</li> <li>STANDARD_IDENTITY_SUSPECT</li>
     * <li>STANDARD_IDENTITY_HOSTILE</li> <li>STANDARD_IDENTITY_EXERCISE_PENDING</li>
     * <li>STANDARD_IDENTITY_EXERCISE_UNKNOWN</li> <li>STANDARD_IDENTITY_EXERCISE_ASSUMED_FRIEND</li>
     * <li>STANDARD_IDENTITY_EXERCISE_FRIEND</li> <li>STANDARD_IDENTITY_EXERCISE_NEUTRAL</li>
     * <li>STANDARD_IDENTITY_JOKER</li> <li>STANDARD_IDENTITY_FAKER</li> </ul>
     * <p/>
     * The standard identity codes are the same for all symbology schemes that use them, and are defined in each
     * appendix of the MIL-STD-2525 specification:
     * <p/>
     * <ul> <li>Warfighting - table A-I (page 51)</li> <li>Tactical Graphics - table B-I (page 305)</li> <li>Signals
     * Intelligence - table D-I (page 964)</li> <li>Stability Operations - table E-I (page 991)</li> <li>Emergency
     * Management - table G-I (page 1032)</li> </ul>
     */
    final String STANDARD_IDENTITY = "gov.nasa.worldwind.symbology.StandardIdentity";
    /**
     * The MIL-STD-2525 Assumed Friend standard identity code. Indicates a symbol assumed to be a friend because of its
     * characteristics or origin. See MIL-STD-2525C section 3.2.2 (page 7).
     */
    final String STANDARD_IDENTITY_ASSUMED_FRIEND = "A";
    /**
     * The MIL-STD-2525 Exercise Assumed Friend standard identity code. Indicates a symbol acting as an assumed friend
     * for exercise purposes.
     */
    final String STANDARD_IDENTITY_EXERCISE_ASSUMED_FRIEND = "M";
    /**
     * The MIL-STD-2525 Exercise Friend standard identity code. Indicates a symbol acting as a friend for exercise
     * purposes.
     */
    final String STANDARD_IDENTITY_EXERCISE_FRIEND = "D";
    /**
     * The MIL-STD-2525 Exercise Neutral standard identity code. Indicates a symbol acting as neutral for exercise
     * purposes.
     */
    final String STANDARD_IDENTITY_EXERCISE_NEUTRAL = "L";
    /**
     * The MIL-STD-2525 Exercise Pending standard identity code. Indicates a symbol which has not been subject to the
     * identification process for exercise purposes.
     */
    final String STANDARD_IDENTITY_EXERCISE_PENDING = "G";
    /**
     * The MIL-STD-2525 Exercise Unknown standard identity code. Indicates a symbol that as been evaluated but not
     * identified  for exercise purposes.
     */
    final String STANDARD_IDENTITY_EXERCISE_UNKNOWN = "W";
    /**
     * The MIL-STD-2525 Faker standard identity code.  Indicates a friendly symbol acting as hostile for exercise
     * purposes. See MIL-STD-2525C section 3.2.12 (page 8).
     */
    final String STANDARD_IDENTITY_FAKER = "K";
    /**
     * The MIL-STD-2525 Friend standard identity code. Indicates a symbol belonging to a declared friendly nation. See
     * MIL-STD-2525C section 3.2.16 (page 8).
     */
    final String STANDARD_IDENTITY_FRIEND = "F";
    /**
     * The MIL-STD-2525 Hostile standard identity code. Indicates a symbol belonging to any opposing nation or entity.
     * See MIL-STD-2525C section 3.2.19 (page 8).
     */
    final String STANDARD_IDENTITY_HOSTILE = "H";
    /**
     * The MIL-STD-2525 Joker standard identity code. Indicates a friendly symbol acting as suspect for exercise
     * purposes. See MIL-STD-2525C section 3.2.24 (page 8).
     */
    final String STANDARD_IDENTITY_JOKER = "J";
    /**
     * The MIL-STD-2525 Neutral standard identity code. Indicates a symbol who's characteristics or nationality
     * indicates that it is neither supporting nor opposing friendly forces. See MIL-STD-2525C section 3.2.29 (page 9).
     */
    final String STANDARD_IDENTITY_NEUTRAL = "N";
    /**
     * The MIL-STD-2525 Pending standard identity code. Indicates a symbol which has not been subject to the
     * identification process. See MIL-STD-2525C section 3.2.32 (page 9).
     */
    final String STANDARD_IDENTITY_PENDING = "P";
    /**
     * The MIL-STD-2525 Suspect standard identity code. Indicates a symbol which is potentially hostile because of its
     * characteristics or nationality. See MIL-STD-2525C section 3.2.42 (page 10).
     */
    final String STANDARD_IDENTITY_SUSPECT = "S";
    /**
     * The MIL-STD-2525 Unknown standard identity code. Indicates a symbol that as been evaluated but not identified.
     * See MIL-STD-2525C section 3.2.49 (page 10).
     */
    final String STANDARD_IDENTITY_UNKNOWN = "U";
    /** List containing all recognized MIL-STD-2525 standard identity codes. */
    final List<String> STANDARD_IDENTITY_ALL = Arrays.asList(
        STANDARD_IDENTITY_PENDING,
        STANDARD_IDENTITY_UNKNOWN,
        STANDARD_IDENTITY_ASSUMED_FRIEND,
        STANDARD_IDENTITY_FRIEND,
        STANDARD_IDENTITY_NEUTRAL,
        STANDARD_IDENTITY_SUSPECT,
        STANDARD_IDENTITY_HOSTILE,
        STANDARD_IDENTITY_EXERCISE_PENDING,
        STANDARD_IDENTITY_EXERCISE_UNKNOWN,
        STANDARD_IDENTITY_EXERCISE_ASSUMED_FRIEND,
        STANDARD_IDENTITY_EXERCISE_FRIEND,
        STANDARD_IDENTITY_EXERCISE_NEUTRAL,
        STANDARD_IDENTITY_JOKER,
        STANDARD_IDENTITY_FAKER
    );

    /**
     * Indicates the status code associated with a MIL-STD-2525 symbol (SIDC position 4). A symbol's status defines
     * whether the represented object exists at the time the symbol was generated, or is anticipated to exist in the
     * future. Additionally, a symbol's status can define its operational condition. See MIL-STD-2525C section 3.2.41
     * (page 10), section 5.3.1.4 (pages 17-18), and tables III and III-2 (pages 18-17). The recognized values depend on
     * the specific MIL-STD-2525 symbology scheme the symbol belongs to, and are defined in each appendix of the
     * MIL-STD-2525C specification:
     * <p/>
     * <strong>Warfighting, Signals Intelligence, Stability Operations</strong> <br/> See MIL-STD-2525C section
     * A.5.2.1.d (page 51), table A-I (page 51), section D.5.2.1.d (page 964), table D-I (page 964), section E.5.2.1.d
     * (page 991), and table E-I (page 991).
     * <p/>
     * <ul> <li>STATUS_ANTICIPATED</li> <li>STATUS_PRESENT</li> <li>STATUS_PRESENT_FULLY_CAPABLE</li>
     * <li>STATUS_PRESENT_DAMAGED</li> <li>STATUS_PRESENT_DESTROYED</li> <li>STATUS_PRESENT_FULL_TO_CAPACITY</li> </ul>
     * <p/>
     * <strong>Tactical Graphics</strong> <br/> See MIL-STD-2525C section B5.2.1.d (page 304) and table B-I (page 305).
     * <p/>
     * <ul> <li>STATUS_ANTICIPATED</li> <li>STATUS_SUSPECTED</li> <li>STATUS_PRESENT</li> <li>STATUS_KNOWN</li> </ul>
     * <p/>
     * <strong>Emergency Management</strong> <br/> See MIL-STD-2525C section G.5.2.4 (page 1028) and table G-I (page
     * 1032).
     * <p/>
     * <ul> <li>STATUS_ANTICIPATED</li> <li>STATUS_PRESENT</li> </ul>
     */
    final String STATUS = "gov.nasa.worldwind.symbology.Status";
    /**
     * The MIL-STD-2525 Anticipated/Planned status code. Indicates a symbol who's represented object is anticipated to
     * exist at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_ANTICIPATED = "A";
    /** The MIL-STD-2525 Known status code. See MIL-STD-2525C section 5.3.1.4 (pages 17-18). */
    final String STATUS_KNOWN = "K";
    /**
     * The MIL-STD-2525 Present/Fully Capable status code. Indicates a symbol who's represented object currently exists
     * at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_PRESENT = "P";
    /**
     * The MIL-STD-2525 Present/Damaged status code. Indicates a symbol who's represented object is damaged, and
     * currently exists at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_PRESENT_DAMAGED = "D";
    /**
     * The MIL-STD-2525 Present/Destroyed status code. Indicates a symbol who's represented object is destroyed, and
     * currently exists at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_PRESENT_DESTROYED = "X";
    /**
     * The MIL-STD-2525 Present/Full To Capacity status code. Indicates a symbol who's represented object's capacity is
     * full, and currently exists at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_PRESENT_FULL_TO_CAPACITY = "F";
    /**
     * The MIL-STD-2525 Present/Fully Capable status code. Indicates a symbol who's represented object is fully capable,
     * and currently exists at the symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_PRESENT_FULLY_CAPABLE = "C";
    /**
     * The MIL-STD-2525 Suspected status code. Indicates a symbol who's represented object is suspected to exist at the
     * symbol's location. See MIL-STD-2525C section 5.3.1.4 (pages 17-18).
     */
    final String STATUS_SUSPECTED = "S";
    /** List containing all recognized MIL-STD-2525 status codes. */
    final List<String> STATUS_ALL = Arrays.asList(
        // UEI, SIGINT, SO, and EM status codes.
        STATUS_ANTICIPATED,
        STATUS_PRESENT,
        STATUS_PRESENT_FULLY_CAPABLE,
        STATUS_PRESENT_DAMAGED,
        STATUS_PRESENT_DESTROYED,
        STATUS_PRESENT_FULL_TO_CAPACITY,
        // Tactical Graphics and METOC status codes (ANTICIPATED and PRESENT already included).
        STATUS_SUSPECTED,
        STATUS_KNOWN
    );
    /**
     * List containing all recognized MIL-STD-2525 status codes for the Warfighting (UEI), Signals Intelligence
     * (SIGINT), and Stability Operations (SO) schemes.
     */
    final List<String> STATUS_ALL_UEI_SIGINT_SO = Arrays.asList(
        STATUS_ANTICIPATED,
        STATUS_PRESENT,
        STATUS_PRESENT_FULLY_CAPABLE,
        STATUS_PRESENT_DAMAGED,
        STATUS_PRESENT_DESTROYED,
        STATUS_PRESENT_FULL_TO_CAPACITY
    );
    /**
     * List containing all recognized MIL-STD-2525 status codes for the Tactical Graphics and Meteorological and
     * Oceanographic (METOC) scheme.
     */
    final List<String> STATUS_ALL_TACTICAL_GRAPHICS_METOC = Arrays.asList(
        STATUS_ANTICIPATED,
        STATUS_SUSPECTED,
        STATUS_PRESENT,
        STATUS_KNOWN
    );
    /** List containing all recognized MIL-STD-2525 status codes for the Emergency Management scheme. */
    final List<String> STATUS_ALL_EMERGENCY_MANAGEMENT = Arrays.asList(
        STATUS_ANTICIPATED,
        STATUS_PRESENT
    );

    /**
     * Indicates the symbol modifier code associated with a MIL-STD-2525 symbol (SIDC positions 11-12). The symbol
     * modifier code defines what graphic symbol modifiers should be displayed around the symbol's icon, such as
     * feint/dummy, installation, task force, headquarters staff, equipment mobility, and auxiliary equipment. The
     * recognized values depend on the specific MIL-STD-2525 symbology scheme the symbol belongs to, and are defined in
     * each appendix of the MIL-STD-2525C specification:
     * <p/>
     * <ul> <li>Warfighting - section A.5.2.1.f (page 51) and table A-II (pages 52-54)</li> <li>Stability Operations -
     * section E.5.2.1.f (page 991) and table E-II (pages 992-994)</li> <li>Emergency Management - section G.5.5 (page
     * 1029) and table EG-II (page 1032)</li> </ul>
     */
    final String SYMBOL_MODIFIER = "gov.nasa.worldwind.symbology.SymbolModifier";

    /**
     * Symbol modifier key indicating whether a MIL-STD-2525 symbol's represented object is a task force. When a marked
     * as a task force, a symbol's graphic is changed to include a bracket above its echelon. See MIL-STD-2525 section
     * 5.3.4.6 (page 28). When used as a key, the corresponding value must be a boolean value. The value is
     * <code>true</code> if the symbol's represented object is a task force, and <code>false</code> otherwise.
     * <p/>
     * The following symbology schemes support the task force modifier:
     * <p/>
     * <ul> <li>Warfighting</li> <li>Stability Operations</li> </ul>
     */
    final String TASK_FORCE = "gov.nasa.worldwind.symbology.TaskForce";

    /**
     * The MIL-STD-2525 feint/dummy units and equipment symbol modifier code. Indicates a symbol that is a feint/dummy.
     * Appears in SIDC position 11. See {@link #FEINT_DUMMY}.
     */
    final String UNIT_EQUIPMENT_FEINT_DUMMY = "F";
    /**
     * The MIL-STD-2525 feint/dummy headquarters units and equipment symbol modifier code. Indicates a symbol that is a
     * feint/dummy and a headquarters. Appears in SIDC position 11. See {@link #FEINT_DUMMY} and {@link #HEADQUARTERS}.
     */
    final String UNIT_EQUIPMENT_FEINT_DUMMY_HEADQUARTERS = "C";
    /**
     * The MIL-STD-2525 feint/dummy task force units and equipment symbol modifier code. Indicates a symbol that is a
     * feint/dummy and a task force. Appears in SIDC position 11. See {@link #FEINT_DUMMY} and {@link #TASK_FORCE}.
     */
    final String UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE = "G";
    /**
     * The MIL-STD-2525 feint/dummy task force headquarters units and equipment symbol modifier code. Indicates a symbol
     * that is a feint/dummy, a task force, and a headquarters. Appears in SIDC position 11. See {@link #FEINT_DUMMY},
     * {@link #TASK_FORCE}, and {@link #HEADQUARTERS}.
     */
    final String UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE_HEADQUARTERS = "D";
    /**
     * The MIL-STD-2525 headquarters units and equipment symbol modifier code. Indicates a symbol that is a
     * headquarters. Appears in SIDC position 11. See {@link #HEADQUARTERS}.
     */
    final String UNIT_EQUIPMENT_HEADQUARTERS = "A";
    /**
     * The MIL-STD-2525 task force units and equipment symbol modifier code. Indicates a symbol that is a task force.
     * Appears in SIDC position 11. See {@link #TASK_FORCE}.
     */
    final String UNIT_EQUIPMENT_TASK_FORCE = "E";
    /**
     * The MIL-STD-2525 task force headquarters units and equipment symbol modifier code. Indicates a symbol that is a
     * task force and a headquarters. Appears in SIDC position 11. See {@link #TASK_FORCE} and {@link #HEADQUARTERS}.
     */
    final String UNIT_EQUIPMENT_TASK_FORCE_HEADQUARTERS = "B";
    /** List containing all recognized MIL-STD-2525 units and equipment symbol modifier codes. */
    final List<String> UNIT_EQUIPMENT_ALL = Arrays.asList(
        UNIT_EQUIPMENT_HEADQUARTERS,
        UNIT_EQUIPMENT_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_TASK_FORCE,
        UNIT_EQUIPMENT_FEINT_DUMMY,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE
    );
    /**
     * List containing all recognized MIL-STD-2525 units and equipment symbol modifier codes that indicate a
     * feint/dummy.
     */
    final List<String> UNIT_EQUIPMENT_ALL_FEINT_DUMMY = Arrays.asList(
        UNIT_EQUIPMENT_FEINT_DUMMY_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE
    );
    /**
     * List containing all recognized MIL-STD-2525 units and equipment symbol modifier codes that indicate a
     * headquarters.
     */
    final List<String> UNIT_EQUIPMENT_ALL_HEADQUARTERS = Arrays.asList(
        UNIT_EQUIPMENT_HEADQUARTERS,
        UNIT_EQUIPMENT_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE_HEADQUARTERS
    );
    /**
     * List containing all recognized MIL-STD-2525 units and equipment symbol modifier codes that indicate a task
     * force.
     */
    final List<String> UNIT_EQUIPMENT_ALL_TASK_FORCE = Arrays.asList(
        UNIT_EQUIPMENT_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE_HEADQUARTERS,
        UNIT_EQUIPMENT_TASK_FORCE,
        UNIT_EQUIPMENT_FEINT_DUMMY_TASK_FORCE
    );
}
