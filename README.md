# com.mavbozo/clj-scratch

A deps-new template for clojure quick and dirty coding

## Usage

FIXME: write usage documentation!

This is a template project for use with [deps-new](https://github.com/seancorfield/deps-new).
As originally generated, it will produce a new library project when run:

    $ clojure -Sdeps '{:deps {com.mavbozo/clj-scratch {:local/root "."}}}' -Tnew create :template com.mavbozo/clj-scratch :name myusername/mycoollib

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install-latest :lib io.github.seancorfield/deps-new :as new
```

> Note: once the template has been published (to a public git repo), the invocation will be the same, except the `:local/root` dependency will be replaced by a git coordinate.

Run this template project's tests (by default, this just validates your template's `template.edn`
file -- that it is valid EDN and it satisfies the `deps-new` Spec for template files):

    $ clojure -T:build test

## License

Copyright (c) 2024 Avicenna

This project is licensed under the MIT License. This means you are free to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
software, under the following conditions:

- The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.
- The software is provided "as is", without warranty of any kind, express or
  implied.

For the full license text, see the [LICENSE.txt](LICENSE.txt) file in the repository.
