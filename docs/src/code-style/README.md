# Code Style

Consistent good looking code is crucial to keep everyone's sanity at high level.
But code style is highly subjective matter and everyone has a different take on
it. So how do we solve this problem without hurting anyone's feelings (at least
without hurting them too much 😅)?

Answer is we don't give them a choice. We impose fixed code style with tools
such as `eslint` and adjust it based on their feedback until a certain point. So
we do listen to everybody's opinion, but ultimately we can't make them all
happy. We mimic popular code style guidelines, but add our flavor, so as a
result we have something that could appeal to as many people as possible.

Which popular guideline do we take as a basis? What determines *"our flavor"*?
These question are answered based on what language and framework we are working
with. Most of our projects are web applications written in JavaScript.
Frameworks we use for backend include Express.js and Strapi; for frontend we use
React (although these docs are created in Vuepress, thanks Vue.js team 🙏🏻).

In our case we use [Airbnb's Style Guide](https://github.com/airbnb/javascript)
as our basis for JavaScript code style. It's as its own motto states:

> "A mostly reasonable approach to JavaScript"

It provides a solid base that covers most of the best practices in regards to
the modern JavaScript.