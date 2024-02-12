package pl.roka.it.lesson8.interfaces;

import pl.roka.it.lesson3.Arrays;
import pl.roka.it.lesson8.Rec;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Remote tvRemote1 = new LgTvRemote();
        Remote tvRemote2 = new AkaiTvRemote();
        Remote conditionerRemote = new LgConditionerRemote();
        List<Remote> remotes = new ArrayList<>();
        remotes.add(tvRemote1);
        remotes.add(conditionerRemote);
        remotes.add(tvRemote2);

        remotes.forEach(remote -> {
            if (remote instanceof LgTvRemote) {
                ((TvRemote) remote).switchProgramUp();
                ((TvRemote) remote).switchProgramUp();
            } else if( remote instanceof TvRemote) {
                ((TvRemote) remote).switchProgramUp();
            }
            System.out.println(remote);
            remote.turnOn();
            System.out.println(remote);
            remote.turnOff();
            System.out.println(remote);
            System.out.println();
        });

    }
}
