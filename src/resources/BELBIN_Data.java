package resources;

import Entities.Question;

/**
 * Created by mathiaslarsen on 21/11/2016.
 */

public class BELBIN_Data {

    public static final int [] QuestionNo_DATA = {

            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70

    };

           /****************************************************************
            * The below are all the questions belonging to the Belbin-test *
            ****************************************************************/

    public static final String [] BelbinWord_Data = {

            "Jeg tror, jeg hurtigt kan se og udnytte nye muligheder.",
            "Mener kommentarer er til både generelle og specifikke spørgsmål bliver godt modtaget.",
            "Jeg arbejder godt sammen med mange forskellige mennesker.",
            "At skabe idéer er et af mine naturlige aktiver.",
            "Min evne er at kunne trække folk frem, når jeg føler, at de har noget.",
            "Man kan stole på, at jeg færdiggører de opgaver, jeg påtager mig.",
            "Min faglige viden og erfaring er normalt mit vigtigste aktiv.",
            "Jeg er parat til at være direkte og ligefrem med henblik på at få de rigtige ting til at ske.",
            "Jeg kan normalt se, om en plan eller en idé passer ind i en given situation.",
            "Jeg kan give en velfunderet og objektiv begrundelse for alternative handlinger.",

            "Jeg har det ikke helt godt, hvis ikke møder er velstrukturerede og kontrollerede og i det hele taget ledes godt.",
            "Jeg er tilbøjelig til at være for gavmild over for andre, som også har et velbegrundet synspunkt, der ikke er blevet præsenteret godt nok.",
            "Jeg er ikke meget for at bidrage hvis emnet ikke lige er et, jeg har et stort kundskab til.",
            "Jeg er tilbøjelig til at snakke meget, når grupper kommer ind på et nyt emne.",
            "Jeg har en tendens til at undervurdere mit eget bidrags betydning.",
            "Mit objektive syn gør det svært for mig, nemt og entusiastisk, at tilslutte mig kollegaer.",
            "Jeg opfattes nogle gange som stærk og autoritær, når det drejer sig om vigtige emner.",
            "Jeg synes, at det er svært at lede fra toppen, måske fordi jeg er for lydhør over for atmosfæren i teamet.",
            "Jeg er tilbøjelig til at blive fanget af idéer, jeg lige får, og mister dermed forbindelsen med, hvad der foregår.",
            "Jeg siger nødig min mening om forslag eller planer, som ikke er fuldstændige eller ikke er tilstrækkeligt detaljerede.",

            "Er jeg godt til at påvirke folk uden at presse dem.",
            "Er jeg godt til  at forhindre, at sjuskefejl eller mangler ødelægger projektets succes.",
            "Vil jeg helst presse på for, at der skal ske noget og sikre, at mødet ikke blot er tidsspilde eller at man ikke taber de egentlige mål af synes.",
            "Kan man regne med, at jeg bidrager med noget originalt.",
            "Er jeg altid med på at støtte et godt forslag i teamets fælles interesse.",
            "Kan man regne med at jeg vil være mig selv.",
            "Er jeg hurtig til at se muligheder i nye idéer og udvikling.",
            "Forsøger jeg at forblive professionel.",
            "Tror jeg, at min evne til at bedømme kan være med til at fremme den rette beslutning.",
            "Kan man stole på, at jeg har en velorganiseret tilgang til jobbets krav.",

            "Jeg har en stille interesse i at lære mine kollegaer bedre at kende.",
            "Jeg bidrager, når jeg ved, hvad jeg taler om.",
            "Jeg er ikke bange for at udfordre andres synspunkter eller være uenig med de andre.",
            "Jeg kan normalt finde et argument, der maner ukloge forslag i jorden.",
            "Jeg mener, jeg har et talent for at få tingene til at fungere, når først en plan er ført ud i livet.",
            "Jeg foretrækker at undgå det oplagte og åbne op for nye ting, som ikke er udforsket.",
            "Jeg bringer et stænk perfektion til alle job, jeg udfører.",
            "Jeg holder af at være den, som skaber kontakter uden for gruppen eller virksomheden.",
            "Jeg nyder den sociale del af samarbejdet.",
            "Selvom jeg gerne vil høre alle synspunkter, tøver jeg ikke med at tage en beslutning, når der er tid til det.",

            "Jeg nyder at analysere situationer og afveje alle mulige valg.",
            "Jeg er interesseret i at finde praktiske løsninger på problemerne.",
            "Jeg kan lidt at føle, at jeg er med til at skabe et godt samarbejde.",
            "Jeg kan få stor indflydelse på beslutninger.",
            "Jeg får mulighed for at møde nye mennesker med andre idéer.",
            "Jeg kan få folk til at enes om prioriteter og mål.",
            "Jeg føler, at jeg er i mit rette element, når jeg kan give min opgave min fulde opmærksomhed.",
            "Jeg får mulighed for at  bruge min fantasi.",
            "Jeg føler, at jeg bruger min særlige kvalifikationer og uddannelse til noget godt.",
            "Jeg finder normalt et job, hvor jeg får mulighed for at udtrykke mig.",

            "Klarer jeg mig normalt, trods omstændighederne.",
            "Vil jeg gerne forberede mig så meget som muligt på emnet.",
            "Har jeg mest lyst til at finde en løsning selv og så forsøge at få de andre i teamet til at gå med på den.",
            "Er jeg klar til at arbejde sammen med den person, som viser sig mest positiv.",
            "Vil jeg finde en måde at reducere opgavens omfang på ved at finde ud af, hvordan de andre i teamet bedst kan bidrage.",
            "Vil min naturlige sans for at få opgaven udført hurtigt og effektivt hjælpe mig til at sikre, at vi ikke kommer bagud i forhold til tidsplanen.",
            "Jeg mener, jeg vil holde hovedet koldt og bevare mine tanker klart.",
            "Trods presset vil jeg mase på og få gjort, hvad der skal gøres.",
            "Vil jeg tage føringen, hvis teamet ikke gør nogen fremskridt.",
            "Vil jeg åbne diskussionen for at stimulere nye tanker og få gang i noget.",

            "Er jeg tilbøjelig til at overreagere, når folk forsinker fremdrift.",
            "Kritisere nogle mig for at analysere for meget.",
            "Er mit ønske om at kontrollere, at vi har rigtig fat om de vigtige detaljer, er ikke altid velkomment.",
            "Viser jeg nok, at jeg keder mig, hvis jeg ikke er aktivt engageret i at stimulere folk.",
            "Synes jeg, det er svært at komme i gang, hvis ikke målene er klare.",
            "Er jeg nogle gange for dårlig til at formidle komplekse ting, som jeg bliver opmærksom på.",
            "Er jeg bevidst om at kræve, der andre gør ting, jeg ikke selv kan.",
            "Synes jeg ikke, at de andre giver mig nok mulighed for at komme til orde.",
            "Er jeg tilbøjelig til at føle, at jeg spilder tiden og kunne klare det bedre selv.",
            "Tøver jeg med at udtrykke mine personlige synspunkter over for vanskelige eller ‘stærke’ folk."


    };
    public static final Question.questionType[] BELBINTYPE_Data = {
            Question.questionType.RI,
            Question.questionType.DROP,
            Question.questionType.TW,
            Question.questionType.PL,
            Question.questionType.CO,
            Question.questionType.CF,
            Question.questionType.SP,
            Question.questionType.SH,
            Question.questionType.IMP,
            Question.questionType.ME,
            Question.questionType.IMP,
            Question.questionType.CO,
            Question.questionType.SP,
            Question.questionType.RI,
            Question.questionType.DROP,
            Question.questionType.ME,
            Question.questionType.SH,
            Question.questionType.PL,
            Question.questionType.PL,
            Question.questionType.CF,
            Question.questionType.CO,
            Question.questionType.CF,
            Question.questionType.SH,
            Question.questionType.PL,
            Question.questionType.TW,
            Question.questionType.DROP,
            Question.questionType.RI,
            Question.questionType.SP,
            Question.questionType.ME,
            Question.questionType.IMP,
            Question.questionType.TW,
            Question.questionType.SP,
            Question.questionType.SH,
            Question.questionType.ME,
            Question.questionType.IMP,
            Question.questionType.PL,
            Question.questionType.CF,
            Question.questionType.RI,
            Question.questionType.DROP,
            Question.questionType.CO,
            Question.questionType.ME,
            Question.questionType.IMP,
            Question.questionType.TW,
            Question.questionType.SH,
            Question.questionType.RI,
            Question.questionType.CO,
            Question.questionType.CF,
            Question.questionType.PL,
            Question.questionType.SP,
            Question.questionType.DROP,
            Question.questionType.DROP,
            Question.questionType.SP,
            Question.questionType.PL,
            Question.questionType.TW,
            Question.questionType.CO,
            Question.questionType.CF,
            Question.questionType.ME,
            Question.questionType.IMP,
            Question.questionType.SH,
            Question.questionType.RI,
            Question.questionType.SH,
            Question.questionType.ME,
            Question.questionType.CF,
            Question.questionType.RI,
            Question.questionType.IMP,
            Question.questionType.PL,
            Question.questionType.CO,
            Question.questionType.DROP,
            Question.questionType.SP,
            Question.questionType.TW,


    };

}
