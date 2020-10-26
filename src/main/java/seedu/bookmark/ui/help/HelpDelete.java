package seedu.bookmark.ui.help;

public class HelpDelete implements HelpAction {

    private static final String DELETE_INTRO = "DELETE A BOOK!";
    private static final String DELETE_COMMAND = "COMMAND: delete {Index}";
    private static final String DELETE_EXAMPLE = "EXAMPLE: delete 3";
    private static final String DELETE_RESPONSE = "RESPONSE: Deleted Book: Tokyo Ghoul Genre: Anime Total Pages: 1000 "
            + "Bookmarked at: 3 Tags: [Japanese]";
    private static final String LB = " \n";

    public HelpDelete() {}

    @Override
    public String helpIntro() {
        return DELETE_INTRO;
    }

    @Override
    public String helpMessage() {
        return DELETE_COMMAND + LB + DELETE_EXAMPLE + LB + DELETE_RESPONSE;
    }
}
