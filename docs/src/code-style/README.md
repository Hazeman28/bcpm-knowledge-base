# Code Style

Consistent good looking code is crucial to keep everyone's sanity at high level.
But code style is very subjective matter and everyone has a different take on
it. So how do we solve this problem without hurting anyone's feelings (at least
without hurting them too much 😅)?

Answer is we don't give them a choice. We impose fixed code style with tools
such as `eslint` and `prettier`. We mimic popular code style guidelines,
but add our flavor, so as a result we have something that could appeal to as
many people as possible. Naturally, if majority of the team is against choices
made in this regard, then those choices would be a subject to change.

But which popular guideline do we take as a basis? What determines *"our
flavor"*? These question are answered based on what language and framework we
are working with. Most of our projects are web applications written in
JavaScript. Frameworks we use for backend include [Express.js][0] and
[Strapi][1]; for frontend we use [React][2] (although these docs are created in
[Vuepress][3], thanks Vue.js team 🙏🏻).

In our case we, use [Airbnb's Style Guide](https://github.com/airbnb/javascript)
as our basis for JavaScript code style. It's as its own motto states:

*"A mostly reasonable approach to JavaScript"*

It provides a solid base that covers most of the best practices in regards to
the modern JavaScript. It is also includes common best practices for the React.

## References

[0]: https://expressjs.com/
[1]: https://strapi.io/
[2]: https://reactjs.org/
[3]: https://vuepress.vuejs.org/

- [Express.js, expressjs.com][0]
- [Strapi, strapi.io][1]
- [React, reatcjs.org][2]
- [Vuepress, vuepress.vuejs.org][3]