# Git

[Git][0] is a free and open-source version control system (VCS), and its one of
the best tools in developer's toolbox. It helps you to keep history of your
changes and gives you ability to travel back in time to an older version of your
codebase. It helps small and large teams to synchronize their code and it serves
as a basis for larger communication platforms. Overall, it is an essential tool
in developer's everyday life.

## Installing Git

Visit [git's download page][1] for full installation instructions. It is quite
simple and straightforward process. If you are on a linux system, chances are
that you already have git installed.

To check if you have git installed on your system, run this command in your
terminal:

```bash
git --version # git version x.y.z
```

It should print out the version of git.

## Initializing Git repository

To start working with git, you need to initialize it inside of your project:

```bash
cd <path-to-my-project>
git init
```

This will create a `.git` directory inside of your project. This is where git
stores all of its files and data. If you would ever want to remove git from your
project, then you would just have to delete that directory. That would also
remove all of the history that git has stored, so you would loose all of your
commits.

## Committing

Once you have initialized git, it is time to make your very first commit! But
before you do that, check status of your repository:

```bash
git status
```

This should print out files and directories from your project as *unstaged*.
This means that git is not tracking any files yet. To start tracking changes in
files you have to add them. This is done with `add` command of git:

```bash
git add <path-to-a-file-or-directory>
```

Path can be a file or a directory. In latter case, git would include all files
from that directory. So you could do something like this to add all files of
your project:

```bash
git add .
```

But often we have files that we don't want git to track. Such files often
include OS specific files, and configuration files. To exclude them, we can
create a `.gitignore` file that would contain names, and patterns of files that
we want to ignore. Its content could look something like this:

```
.my-secrets
.DS_Store
```

Everything listed in this file will be ignored.

Sometimes you stage the file with `git add`, but then you remember that you
actually didn't want that file to be tacked by git. To fix this, you can run
`remove` command with `--cached` option:

```bash
git remove --cached <path>
```

This will instruct git to remove specified file or directory from its track
list.

You can learn more about `.gitignore` and all of its options [here][3].

But once you have staged all of your files, you can commit them:

```bash
git commit
```

This will open up default editor specified in git's configuration (which usually
is the legendary `vim` editor 😎).

In editor you will be tasked to specify commit message. First line of the
message is the commit title, and it is separated by a newline from the rest of
the message, which is the body. There you can write changes that this commit
brings. For example, it could be:

```
Add localization for ru-RU

Support full localization for russian language. Refactor internationalization
module for better extensibility.
```

As you can see, message above has title:

*"Add localization for ru-RU"*

And body:

*"Support full localization for russian language. Refactor internationalization
module for better extensibility."*

> Refer to the [Commits](/git/commits) section of these docs to learn about our
> conventions regarding commit messages.

Since this is your first commit, your commit message could be simply:
```
Initial
```

From now on, every time to you make a significant change, you should commit your
changes. Try to commit often and avoid large commits, because it makes it harder
to trace back to specific changes and complicates code review process.

## Branches

When a team of developers is working on a project, they often work on different
things in parallel.

Let's say we have team was of two people - **Jade** and **Alex**. They are working on a
website. **Jade** is designing a navigation panel, while **Alex** is developing a
contact form. To separate their work, they create separate branches for their
tasks:

```bash
git branch feature/navigation # Jade
```

```bash
git branch feature/contact-form # Alex
```

But before they start coding, they have to *checkout* to their new branch:

```bash
git checkout feature/navigation # Jade
```

```bash
git checkout feature/contact-form # Alex
```

> There is also a shorthand to *create and checkout* to a new branch:
> ```bash
> git checkout -b <branch-name>
> ```

Now their work is separated. All commits they make will be in that branch only.
When one of them completes their task, they can merge changes to the main
branch, and work of the other wouldn't be interrupted.

> But if **Jade** were to complete their task first and merge it to the main
> branch, and **Alex's** work somehow depended on changes that **Jade** made,
> then **Alex** would have to rebase their branch.

In practice, we never merge directly into the main branch. We create so called
pull-requests, where other team members review our changes and if everything is
ok, they *approve* and *merge* them.

Read more about [branching in git][8].

## Pushing

When you make a commit, git stores all of your changes locally. To be able to
work with your teammates and share your changes, you need to push your commits
to a remote repository.

Remote repository is a server that has git installed on it, and it enables you
to *push* your local changes to that server, where all of your teammates can
*pull* them.

Platforms such [GitHub][5], [GitLab][6], and [BitBucket][7] are popular choices
for hosting git repositories.

To push your changes to a remote repository, you first have to add it:

```bash
git remote add <remote-name> <remote-link>
```

Here, `<remote-name>` is going to be an alias to the `<remote-link>`. Usually,
there is only one remote repository and its commonly called `origin`:

```bash
git remote add origin <remote-link>
```

Once you have added link to your remote repository, you can push your changes:

```bash
git push --set-upstream origin <your-branch-name>
```

`--set-upstream` option is required only on the first push of your branch. It
tells git that *this local branch* is bound to *that remote branch*. So in
future pulls and pushes you won't have to specify remote name and branch name.
You would simply run:

```bash
git push # or git pull
```

Read more about remotes [here][4].

## More Git commands

Git has plethora of commands, and these docs can't possible cover them all. So
here is a link to a simple [git cheat sheet by github][2] that contains all of
the essential commands that you may require during your development.

## References

[0]: https://git-scm.com/
[1]: https://git-scm.com/downloads
[2]: https://education.github.com/git-cheat-sheet-education.pdf
[3]: https://git-scm.com/docs/gitignore
[4]: https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes
[5]: https://github.com/
[6]: https://gitlab.com/
[7]: https://bitbucket.org/
[8]: https://www.atlassian.com/git/tutorials/using-branches

- [Git, git-scm.com][0]
- [Git downloads, git-scm.com][1]
- [Git cheat sheet, education.github.com][2]
- [`gitignore`, git-scm.com/docs/gitignore][3]
- [Working with remotes, git-scm.com][4]
- [GitHub, github.com][5]
- [GitLab, gitlab.com][6]
- [BitBucket, bitbucket.org][7]
- [Using Git Branches, atlassian.com][8]