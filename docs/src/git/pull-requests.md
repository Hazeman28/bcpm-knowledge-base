# Pull Requests

### PR titles

Title of a pull request must abide same rules as the title of a commit message. Commit message title encompasses overall changes made by the commit, and PR message encompasses overall changes made by the issue it resolves. If you find it hard to compress all changes into single sentence, then it may indicate that you are trying to apply too many changes within single PR. Same applies for the commit message titles.

### Branch naming

There are several common issue types:

- Bugfix - fixing existing functionality
- Feature - Adding new functionality
- Refactor - refactoring existing codebase

These issue types are reflected as branch types for each project:

- `bugfix`
- `feature`
- `refactor`

Naming convention for branches is:

```
[issue-type]/[issue-tag]/[name]
```

This clearly categorizes each branch and gives context on what kind of work is being done on a specific branch. There are no restrictions, nor specific rules on the `[name]` part of the branch, but general best practice is too keep it short and relevant to the work you are doing. You may even apply same rules as for commit message titles, but keep it even shorter to avoid long branch names. For example:

```
feature/ISS-1/initialize-project
```

or 

```
feature/ISS-1/project-initialization
```