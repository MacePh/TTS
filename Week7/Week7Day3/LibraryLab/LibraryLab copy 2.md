<body>
        <div id="page-content" class="row">
            <div id="region-main-box" class="col-xs-12">
                <section id="region-main">
                    <div class="card card-block">
                        <span class="notifications" id="user-notifications"></span>
                        <div role="main"><span id="maincontent"></span>
                            <h2>Submit: Library Lab</h2>
                            <div id="intro" class="box generalbox boxaligncenter p-y-1">
                                <div class="no-overflow">
                                    <p></p>
                                    <p>The libraries of SmallTownX need a new electronic rental system, and it is up
                                        to you to build it. SmallTownX has two libraries. Each library offers many
                                        books to rent. Customers can print the list of available books, borrow, and
                                        return books. </p>
                                    <p>We provide two classes, Book and Library, that provide the functionality for
                                        the book database. You must implement the missing methods to make these
                                        classes work. </p>
                                    <h5>Step One: Implement Book </h5>
                                    <p>First we need a class to model books. Start by downloading the attached <a
                                            href="https://titus.techtalentsouth.com/pluginfile.php/92435/mod_assign/intro/Book.java">Book.java</a>
                                        file This class defines methods to get the title of a book, find out if it
                                        is available, borrow the book, and return the book. However, the skeleton
                                        that we provide is missing the implementations of the methods. Fill in the
                                        body of the methods with the appropriate code. The main method tests the
                                        methods. When you run the program, the output should be: </p>
                                    <pre><p><b>Title (should be The Da Vinci Code): The Da Vinci Code 
        </b>Rented? (should be false): false
        Rented? (should be true): true
        Rented? (should be false): false </p></pre>
                                    <p>Hint: Look at the main method to see how the methods are used, then fill in
                                        the code for each method. </p>
                                    <h5>Step Two: Implement Library </h5>
                                    <p>Next we need to build the class that will represent each library, and manage
                                        a collection of books. All libraries have the same hours: 9 AM to 5 PM
                                        daily. However, they have different addresses and book collections (i.e., <a
                                            class="autolink" title="Arrays"
                                            href="https://titus.techtalentsouth.com/mod/url/view.php?id=64071">arrays</a>
                                        of Book objects). </p>
                                    <p>Download the attached <a
                                            href="https://titus.techtalentsouth.com/pluginfile.php/92435/mod_assign/intro/Library.java">Library.java</a>
                                        file. We provide a main method that creates two libraries, then performs
                                        some operations on the books. However, all the methods and member variables
                                        are missing. You will need to define and implement the missing methods. Read
                                        the main method and look at the compile errors to figure out what methods
                                        are missing. </p>
                                    <h5><b>Notes</b> </h5>
                                    <p></p>
                                    <ul>
                                        <li>Some methods will need to be static methods, and some need to be
                                            instance methods. </li>
                                        <li>Be careful when comparing Strings objects. Use string1.equals(string2)
                                            for comparing the contents of string1 and string2. </li>
                                        <li>You should get a small part working at a time. Start by commenting the
                                            entire main method, then uncomment it line by line. Run the program, get
                                            the first lines working, then uncomment the next line, get that working,
                                            etc. </li>
                                        <li>You must not modify the main method. </li>
                                    </ul>
                                    <p></p>
                                    <p>The output when you run this program should be similar to the
                                        following: </p>
                                    <pre>Library hours:
        Libraries are open daily from 9am to 5pm.
        Library addresses:
        10 Main St.
        228 Liberty St.</pre>
                                    <pre>Borrowing The Lord of the Rings:
        You successfully borrowed The Lord of the Rings
        Sorry, this book is already borrowed.
        Sorry, this book is not in our catalog. <br></pre>
                                    <pre>Books available in the first library:
        The Da Vinci Code
        Le Petit Prince
        A Tale of Two Cities <br></pre>
                                    <pre>Books available in the second library:
        No book in catalog <br>Returning The Lord of the Rings:
        You successfully returned The Lord of the Rings <br></pre>
                                    <pre>Books available in the first library:
        The Da Vinci Code
        Le Petit Prince
        A Tale of Two Cities
        The Lord of the Rings</pre>
                                    <h5><b>Submission</b></h5>
                                    <p>Push your completed version of both Book.java and Library.java to a Github
                                        repo and submit the URL for that repo.</p><br><br>
                                    <p></p>
                                </div>
                                <div id="assign_files_tree638d1f2f4c28b1">
                                    <ul>
                                        <li yuiConfig='{"type":"html"}'>
                                            <div><img class="icon icon" alt="Book.java" title="Book.java"
                                                    src="https://titus.techtalentsouth.com/theme/image.php/boost/core/1598035377/f/sourcecode" />
                                                <a target="_blank"
                                                    href="https://titus.techtalentsouth.com/pluginfile.php/92435/mod_assign/introattachment/0/Book.java?forcedownload=1">Book.java</a>
                                            </div>
                                        </li>
                                        <li yuiConfig='{"type":"html"}'>
                                            <div><img class="icon icon" alt="Library.java" title="Library.java"
                                                    src="https://titus.techtalentsouth.com/theme/image.php/boost/core/1598035377/f/sourcecode" />
                                                <a target="_blank"
                                                    href="https://titus.techtalentsouth.com/pluginfile.php/92435/mod_assign/introattachment/0/Library.java?forcedownload=1">Library.java</a>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="submissionstatustable">
                                <h3>Submission status</h3>
                                <div class="box boxaligncenter submissionsummarytable p-y-1">
                                    <table class="generaltable">
                                        <tbody>
                                            <tr class="">
                                                <td class="cell c0" style="">Submission status</td>
                                                <td class="cell c1 lastcol" style="">No attempt</td>
                                            </tr>
                                            <tr class="">
                                                <td class="cell c0" style="">Grading status</td>
                                                <td class="submissionnotgraded cell c1 lastcol" style="">Not graded
                                                </td>
                                            </tr>
                                            <tr class="">
                                                <td class="cell c0" style="">Last modified</td>
                                                <td class="cell c1 lastcol" style="">-</td>
                                            </tr>
                                            <tr class="lastrow">
                                                <td class="cell c0" style="">Submission comments</td>
                                                <td class="cell c1 lastcol" style="">
                                                    <div
                                                        class="box boxaligncenter plugincontentsummary summary_assignsubmission_comments_71184 p-y-1">
                                                        <div class="commentscontainer">
                                                            <div style="display:none" id="cmt-tmpl">
                                                                <div class="comment-message">
                                                                    <div class="comment-message-meta m-r-3"><span
                                                                            class="picture">___picture___</span><span
                                                                            class="user">___name___</span> - <span
                                                                            class="time">___time___</span></div>
                                                                    <div class="text">___content___</div>
                                                                </div>
                                                            </div>
                                                           
