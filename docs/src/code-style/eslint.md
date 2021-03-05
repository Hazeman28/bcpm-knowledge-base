# Eslint

[Eslint][0] is a linting utility program that helps to keep consistent and good
looking code through the scope of an entire project.

## Install eslint

To add eslint to your project, simply install it via [`npm`][5] or [`yarn`][6]:

```bash
$ npm install eslint --save-dev
```
or with yarn:
```bash
$ yarn add eslint --dev
```

## Configuring eslint

When Eslint is launched, it checks all source files against rules defined in a
special file called `.eslintrc`. That `rc` at the end, might be familiar to you
if you are a user of a unix/linux system. It means [*run commands*][1] and
indicates that commands defined in the file suffixed with `rc` are executed
right after the launch of that program. But in modern days, and especially in
the world of JavaScript, `rc` suffixed files are usually closer to
*configuration files* that define some global variables and settings for a
program.

`.eslintrc` can have multiple extensions:
  - `.json`
  - `.yml`
  - `.js`

We use `.yml`, which is a shortened version of the [YAML][2] which stands for:

*"YAML Ain't Markup Language"*

Which is a recursive definition of the abbreviation. This is quite common in the
world of open source and unix/linux software.

## Why YAML?

Because its syntax is clean and concise. Again, it is a standard that we impose
without asking anyone's permission, but if entire team would rather use
[JSON][3] then we would have no choice, but to abide to the common desire. In
regards to YAML, visit its home page to learn more about its syntax.

## Writing your own configuration

As stated above `.eslintrc` contains definitions of all rules used to check
source files. In this repository, we provide our most common `.eslintrc` files.
If you wish to learn more about configuring eslint, then visit its
[documentation page][4].

## Creating test scripts

On every project we want to ensure quality and consistency of the code. To
achieve this, we can create test scripts in the `package.json` file of our
project:

```json
{
  ...
  "scripts": {
    "test:lint": "eslint ."
  }
  ...
```

Then, you could run this script like so:

```bash
$ npm run test:lint
```
or if you are using yarn:

```bash
$ yarn test:lint
```

Eslint takes path to the source directory as its argument, so by specifying `.`
we tell eslint to start checking from the current directory. If all of your code
lies somewhere else, then you would replace `.` with path to that directory.

### Auto fixing errors

You can also add `--fix` option to the command to let eslint fix all fixable
problems that may occur during the test. Keep in mind, that not all eslint rules
are fixable, it's usually stated in the description of a rule whether it is auto
fixable or not. You don't have to add `--fix` option to the script if you don't
want to. You can simply append it during the execution of the script:

```bash
$ npm run test:lint --fix
```
or with yarn:
```bash
$ yarn test:lint --fix
```

## Pre-commit hooks

Scripts are a fine tool to run linting tests on your code, but it never prevents
you from committing a flawed code. To battle this, we can create a *pre-commit*
git hook.

Git hooks are script files that are hooked to specific git commands. Pre-commit
hook as its name implies, is a hook that is executed *before* git accepts your
commit.

As all hooks, pre-commit hook is located at `.git/hooks/pre-commit`. To add
functionality to the hook, simply open it with any editor and start writing your
pre-commit logic. Git hooks are shell scripts, so code you put into that script
must be executable by your shell.

You can read more about git hooks [here][7].

To create a hook that would run our linting test before we commit our code, we
could write something like this:

```bash
npm run test:lint
# or yarn test:lint
```

At this point you might be thinking:

*"Should I do this for every project? Seems a bit tedious..."*

And you are right, it is tedious. But even worse news is that this hook would
work only on your local system, hooks are not version controlled. So you
wouldn't be able to share this with your team. Yikes!

But don't worry, there is a solution. There is an npm package called
[`pre-commit`][8] that does exactly what we want. Just install it as you would
install any other package:

```bash
$ npm install pre-commit --save-dev
```
or with yarn:
```bash
$ yarn add pre-commit --dev
```

Then add `pre-commit` field to your `package.json`:

```json
{
  ...
  "pre-commit": ["test:lint"]
}
```

As you can see, we are passing an array of commands that `pre-commit` will
execute, well, before each commit 😅. Since it is an npm package, and its
configuration is just an entry in the `package.json`, it is going to be fully
version controlled and we will be able to share with our team 😌.

## Where do I find these eslint configuration files?

All common `.eslintrc` definitions are available in this repository:
  - [JavaScript and React](/code-style/react-eslintrc)

## References

[0]: https://eslint.org/docs/about/
[1]: https://en.wikipedia.org/wiki/Run_commands
[2]: https://yaml.org/
[3]: https://www.json.org/json-en.html
[4]: https://eslint.org/docs/user-guide/configuring/
[5]: https://www.npmjs.com/
[6]: https://yarnpkg.com/
[7]: https://git-scm.com/book/en/v2/Customizing-Git-Git-Hooks
[8]: https://www.npmjs.com/package/pre-commit

- [Eslint, eslint.org][0]
- [Run commands, wikipedia.org][1]
- [YAML, yaml.org][2]
- [JSON, json.org][3]
- [Eslint Docs, eslint.org][4]
- [`npm`, npmjs.com][5]
- [`yarn`, yarnpkg.com][6]
- [Git Hooks, git-scm.com][7]
- [`pre-commit`, npmjs.com/package/pre-commit]