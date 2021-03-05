# Commits

## Commit messages

Each `git` commit must have a message. First line of the message is its title, never end it with a dot or any punctuation, this keeps title as short as possible and makes it look cleaner when viewed in the logs. Separate message title with a blank line from its body:

```
CLU-65 Implement K-means clustering

K-means is much faster algorithm, though it suffers from its inaccuracy due to random
selection of the initial centroids. However, speed payoff is enough to replace
Agglomerative clustering. 
```

Here, title of the commit is *"Implement K-means clustering"*, and rest of the message is its body. Notice the issue tag used as a prefix `CLU-65`. It links this commit to specific issue on an agile board. Each commit, whenever possible, must have an issue prefix. This helps reviewer to easily identify what this commit is trying to achieve and where to look for more information. It provides context, and most of the time, it eliminates need to include the body of the message, leaving just the title:

```
CLU-65 Implement K-means clustering
```

As far as the naming and wording of the message goes, these simple rules must be followed. They were taken from the blog post by Chris Beams. For more thorough reading, check out [his post][1].

## Use imperative mood in the title of the message:

Imperative means commanding or giving instructions on something:

- Implement new algorithm
- Change your clothes
- Wash dishes

Imperative mood is effective at delivering essence of the action with minimum amount of words. Whenever we work on some project, our commits usually involve these activities:

- Add some file / functionality
- Remove some file / functionality
- Fix some file / functionality
- Refactor some file / functionality

These are reflected in branch naming conventions (more on that later):

- `feature/[issue-prefix]/[branch-name]`
- `bugfix/[issue-prefix]/[branch-name]`
- `refactor/[issue-prefix]/[branch-name]`

So git title must encompass the core of your actions within the given commit. It should reflect what you did, but not explain it (we use diffs for that). Here are some examples of correct and incorrect commit titles:

#### Correct

- ISS-1 Initialize project
- ISS-2 Add frontend components
- ISS-3 Fix page loading error

#### Incorrect

- ISS-1 Initial
- ISS-2 Frontend components added, working on Footer
- ISS-3 Fix document.onload event listener not being fired by removing eternal while loop.

As a rule of thumb, you can test your commit message by checking if it fits to this sentence:

> *If applied this commit will* **[your-commit-message]**

## Use the body of the message to explain *what* and *why* vs *how*

Code should be self-explanatory. For specific changes we look at the [diff][2] of the commit. So message body should reflect reasoning behind those changes, and perhaps some explanation on some complex parts of the code to make it easier for reviewers and other team members to understand the changes. Here is an example of a proper commit message taken from the [linux core][3]:

```
iwmc3200top: remove driver for unavailable hardware

This hardware never became available to normal humans.  Leaving this
driver imposes unwelcome maintenance costs for no clear benefit.

Cc: Inaky Perez-Gonzalez <inaky.perez-gonzalez@intel.com>
Cc: Samuel Ortiz <samuel.ortiz@intel.com>
Signed-off-by: John W. Linville <linville@tuxdriver.com>
```

[Link to the commit]((https://github.com/torvalds/linux/commit/ce8126c334f4960fc091d57ad293b250be7f3a4f)).

## References

[1]: https://chris.beams.io/posts/git-commit/
[2]: https://en.wikipedia.org/wiki/Diff
[3]: https://github.com/torvalds/linux/

- [Chris Beams, Blog posts - Git commit][1]
- [Diff, Wikipedia][2]
- [Linux, Linus Torvalds][3]