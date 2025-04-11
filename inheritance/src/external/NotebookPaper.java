package external;

import internal.Paper;

    public class NotebookPaper extends Paper {
        public void bind() {
            System.out.println("NotebookPaper: Bound together in a notebook.");
        }

        @Override
        public void write() {
            System.out.println("NotebookPaper: Lined pages for better writing.");
        }
    }
