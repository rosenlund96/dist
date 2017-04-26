package resources;

import Entities.AbstractItem;

public class ItemDefinition {

    public final static int [] TESTNo_DATA = {

            1,2,3
    };

    public static final String [] TESTName_DATA = {

            "DISC",
            "BELBIN",
            "ThreeSixty"
    };

    public static final String [] TESTDescription_DATA = {

            "Dette værktøj anvender vi til at identificere kommunikationsstile, adfærd og motivationsfaktorer hos individer, – og hos teams bruger vi det til at fremhæve ligheder og forskelle indenfor teamet.\n\nMålet for vores indsatser er at få endnu mere værdi ud af både ligheder og forskelle, både i forhold til teamet og til omgivelserne, og DiSC™ Person Profil er uhyre effektivt til at igangsætte en sådan proces.",
            "Belbin Teamudvikling er et værktøj, der optimerer sammensætningen af teams.\n\nAnalysen fortæller ikke noget om den enkeltes kompetencer, eller vurderer den enkelte som et godt eller dårligt teammedlem, men fokuserer på, hvilken roller hver medarbejder spiller i teamet.\n\nSelve profilen består af et analyseskema, du selv udfylder, og en række spørgeskemaer, som udfyldes af kollegerne.\n\n" + "Teamrolle analysen har stor værdi arbejdet med Teamudvikling, både for den enkelte og for hele teamet.",
            "Denne test er ikke tilgængelig på nuværende tidspunkt."
    };

    public static final double [] TESTPrice_DATA = {

        29.95,49.95,79.95

        };


    public static final AbstractItem.testType[] testType  = {

        AbstractItem.testType.DISC,
        AbstractItem.testType.BELBIN,
        AbstractItem.testType.THREESIXTY

        };


        }

