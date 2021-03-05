# React

Below is a `.eslintrc.yml` definition for React projects. Just copy its contents
into a `.eslintrc.yml` named file in the root of your project.

## Prerequisites

Since we extend [Airbnb's Eslint Configuration][0], apart from installing the
configuration itself we are also required to install its dependencies:

  - `eslint`
  - `eslint-config-airbnb`
  - `eslint-plugin-import`
  - `eslint-plugin-react`
  - `eslint-plugin-react-hooks`
  - `eslint-plugin-jsx-a11y`

Install packages above as [developer dependencies][1] (add `--save-dev` option
during install, or `--dev` if you are using yarn).

```yml
---
extends: airbnb
settings:
  react:
    version: detect
env:
  browser: true
parserOptions:
  ecmaFeatures:
    jsx: true
rules:
  comma-dangle:
    - error
    - always-multiline
  eol-last: error
  eqeqeq: error
  id-length: error
  indent:
    - error
    - 2
    - SwitchCase: 1
  import/newline-after-import:
    - error
    - count: 2
  import/order:
    - error
    - newlines-between: never
      alphabetize:
        order: asc
  keyword-spacing: error
  linebreak-style:
    - error
    - unix
  no-irregular-whitespace: error
  no-var: error
  object-curly-spacing:
    - error
    - always
  semi:
    - error
    - always
  space-before-function-paren: 0
  space-before-blocks: error
  space-infix-ops:
    - error
    - int32Hint: false
  quotes:
    - error
    - single
  no-console:
    - error
    - allow:
      - warn
      - error 
  jsx-quotes: error
  react/boolean-prop-naming: error
  react/button-has-type: error
  react/default-props-match-prop-types: error 
  react/destructuring-assignment:
    - error
    - always
  react/function-component-definition:
    - error
    - namedComponents: arrow-function
  react/jsx-boolean-value: error
  react/jsx-closing-bracket-location: error
  react/jsx-closing-tag-location: error
  react/jsx-curly-brace-presence:
    - error
    - never
  react/jsx-curly-newline: error
  react/jsx-curly-spacing:
    - error
    - never
  react/jsx-equals-spacing:
    - error
    - never
  react/jsx-fragments: error
  react/jsx-handler-names: error
  react/jsx-key: error
  react/jsx-max-depth:
    - error
    - max: 10
  react/jsx-max-props-per-line:
    - error
    - when: multiline
  react/jsx-no-duplicate-props: error
  react/jsx-no-script-url: error
  react/jsx-no-undef: error
  react/jsx-no-useless-fragment: error
  react/jsx-pascal-case: error
  react/jsx-props-no-multi-spaces: error
  react/jsx-sort-default-props: error
  react/jsx-sort-props: error
  react/jsx-tag-spacing: error
  react/jsx-uses-react: error
  react/jsx-uses-vars: error
  react/jsx-wrap-multilines: error
  react/no-children-prop: error
  react/no-deprecated: error
  react/no-this-in-sfc: error
  react/no-typos: error
  react/no-unused-prop-types: error
  react/no-unused-state: error
  react/prop-types: error
  react/react-in-jsx-scope: error
  react/self-closing-comp: error
  react/sort-prop-types: error
  react/style-prop-object: error
  react/void-dom-elements-no-children: error
  react-hooks/rules-of-hooks: error
  react-hooks/exhaustive-deps: warn

```

## How To Contribute?

If you want to bring some changes, then create a pull request that incorporates
them. Make sure to describe your decisions as it will help other team members to
evaluate those changes.

## References

[0]:
https://github.com/airbnb/javascript/tree/master/packages/eslint-config-airbnb
[1]: https://docs.npmjs.com/specifying-dependencies-and-devdependencies-in-a-package-json-file

- [`eslint-config-airbnb`, github.com][0]
- [Specifying dependencies, npmjs.org][1]