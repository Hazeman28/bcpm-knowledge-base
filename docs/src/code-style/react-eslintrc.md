# React

Below is a `.eslintrc.yml` definition for React projects with `prettier`. Just
copy its contents into a `.eslintrc.yml` named file in the root of your project.

## Prerequisites

Since we extend [Airbnb's Eslint Configuration][0], apart from installing the
configuration itself we are also required to install its dependencies:

  - `eslint`
  - `prettier`
  - `eslint-config-airbnb`
  - `eslint-plugin-import`
  - `eslint-plugin-react`
  - `eslint-plugin-react-hooks`
  - `eslint-plugin-jsx-a11y`
  - `eslint-config-prettier`

Install packages above as [developer dependencies][1] (add `--save-dev` option
during install, or `--dev` if you are using yarn):

```bash
npm install --save-dev eslint prettier eslint-config-airbnb eslint-plugin-import eslint-plugin-react eslint-plugin-react-hooks eslint-plugin-jsx-a11y eslint-config-prettier
```

```yml
--- 
env: 
  browser: true
  node: true
extends: 
  - airbnb
  - airbnb/hooks
  - prettier
parserOptions: 
  ecmaFeatures: 
    jsx: true
  ecmaVersion: 11
rules: 
  import/order: 
    - error
    - alphabetize: 
        order: asc
      newlines-between: never
  no-console: 
    - error
    - allow: 
      - warn
      - error
  no-shadow: 0
  no-nested-ternary: 0
  react/no-array-index-key: 1
  react/jsx-filename-extension: 0
  react/jsx-props-no-spreading: 0
  react/jsx-sort-props: 2
  react/sort-prop-types: 2
  react/require-default-props: 0
settings: 
  import/resolver: 
    node: 
      moduleDirectory: 
        - node_modules
        - src
  react: 
    version: detect
```

## How To Contribute?

If you want to bring some changes, then create a pull request that incorporates
them. Make sure to describe your decisions as it will help other team members to
evaluate those changes.

For more info about contributing check out [Contribution](/contribution) section
of these docs.

## References

[0]:
https://github.com/airbnb/javascript/tree/master/packages/eslint-config-airbnb
[1]: https://docs.npmjs.com/specifying-dependencies-and-devdependencies-in-a-package-json-file

- [`eslint-config-airbnb`, github.com][0]
- [Specifying dependencies, npmjs.org][1]