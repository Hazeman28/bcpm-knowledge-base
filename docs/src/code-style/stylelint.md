# Stylelint

Similar to [eslint](/code-style/eslint), `stylelint` is a linting tool for CSS
and SCSS files. You can learn more about its setup on its [official docs][0].

## Prerequisites

- `stylelint`
- `prettier`
- `stylelint-config-standard`
- `stylelint-config-sass-guidelines`
- `stylelint-config-prettier`

Install packages above as [developer dependencies][1] (add `--save-dev` option
during install, or `--dev` if you are using yarn):

```bash
npm install stylelint prettier stylelint-config-standard stylelint-config-sass-guidelines stylelint-config-prettier
```

Below is our stylelint config with [prettier](/code-style/prettier) for SCSS projects:

```json
{
  "extends": [
    "stylelint-config-standard",
    "stylelint-config-sass-guidelines",
    "stylelint-config-prettier"
  ],
  "rules": {
    "at-rule-disallowed-list": ["import"],
    "color-named": null,
    "no-empty-source": null,
    "selector-no-qualifying-type": null,
    "selector-pseudo-class-no-unknown": null
  }
}
```

## References

[0]: https://stylelint.io/

- [Stylelint, stylelint.io][0]