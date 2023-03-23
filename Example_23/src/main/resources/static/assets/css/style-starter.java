@charset "UTF-8";

/*--
Author: W3layouts
Author URL: http://w3layouts.com
--*/
/*!
 * Bootstrap v5.0.1 (https://getbootstrap.com/)
 * Copyright 2011-2021 The Bootstrap Authors
 * Copyright 2011-2021 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/main/LICENSE)
 */
:root {
  --bs-blue: #0d6efd;
  --bs-indigo: #6610f2;
  --bs-purple: #6f42c1;
  --bs-pink: #d63384;
  --bs-red: #dc3545;
  --bs-orange: #fd7e14;
  --bs-yellow: #ffc107;
  --bs-green: #198754;
  --bs-teal: #20c997;
  --bs-cyan: #0dcaf0;
  --bs-white: #fff;
  --bs-gray: #6c757d;
  --bs-gray-dark: #343a40;
  --bs-primary: #0d6efd;
  --bs-secondary: #6c757d;
  --bs-success: #198754;
  --bs-info: #0dcaf0;
  --bs-warning: #ffc107;
  --bs-danger: #dc3545;
  --bs-light: #f8f9fa;
  --bs-dark: #212529;
  --bs-font-sans-serif: system-ui, -apple-system, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", "Liberation Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
  --bs-font-monospace: SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", "Courier New", monospace;
  --bs-gradient: linear-gradient(180deg, rgba(255, 255, 255, 0.15), rgba(255, 255, 255, 0));
}

*,
*::before,
*::after {
  box-sizing: border-box;
}

@media (prefers-reduced-motion: no-preference) {
  :root {
    scroll-behavior: smooth;
  }
}

body {
  margin: 0;
  font-family: var(--bs-font-sans-serif);
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  background-color: #fff;
  -webkit-text-size-adjust: 100%;
  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}

hr {
  margin: 1rem 0;
  color: inherit;
  background-color: currentColor;
  border: 0;
  opacity: 0.25;
}

hr:not([size]) {
  height: 1px;
}

h6,
.h6,
h5,
.h5,
h4,
.h4,
h3,
.h3,
h2,
.h2,
h1,
.h1 {
  margin-top: 0;
  margin-bottom: 0.5rem;
  font-weight: 500;
  line-height: 1.2;
}

h1,
.h1 {
  font-size: calc(1.375rem + 1.5vw);
}

@media (min-width: 1200px) {

  h1,
  .h1 {
    font-size: 2.5rem;
  }
}

h2,
.h2 {
  font-size: calc(1.325rem + 0.9vw);
}

@media (min-width: 1200px) {

  h2,
  .h2 {
    font-size: 2rem;
  }
}

h3,
.h3 {
  font-size: calc(1.3rem + 0.6vw);
}

@media (min-width: 1200px) {

  h3,
  .h3 {
    font-size: 1.75rem;
  }
}

h4,
.h4 {
  font-size: calc(1.275rem + 0.3vw);
}

@media (min-width: 1200px) {

  h4,
  .h4 {
    font-size: 1.5rem;
  }
}

h5,
.h5 {
  font-size: 1.25rem;
}

h6,
.h6 {
  font-size: 1rem;
}

p {
  margin-top: 0;
  margin-bottom: 1rem;
}

abbr[title],
abbr[data-bs-original-title] {
  -webkit-text-decoration: underline dotted;
  text-decoration: underline dotted;
  cursor: help;
  -webkit-text-decoration-skip-ink: none;
  text-decoration-skip-ink: none;
}

address {
  margin-bottom: 1rem;
  font-style: normal;
  line-height: inherit;
}

ol,
ul {
  padding-left: 2rem;
}

ol,
ul,
dl {
  margin-top: 0;
  margin-bottom: 1rem;
}

ol ol,
ul ul,
ol ul,
ul ol {
  margin-bottom: 0;
}

dt {
  font-weight: 700;
}

dd {
  margin-bottom: 0.5rem;
  margin-left: 0;
}

blockquote {
  margin: 0 0 1rem;
}

b,
strong {
  font-weight: bolder;
}

small,
.small {
  font-size: 0.875em;
}

mark,
.mark {
  padding: 0.2em;
  background-color: #fcf8e3;
}

sub,
sup {
  position: relative;
  font-size: 0.75em;
  line-height: 0;
  vertical-align: baseline;
}

sub {
  bottom: -0.25em;
}

sup {
  top: -0.5em;
}

a {
  color: #0d6efd;
  text-decoration: underline;
}

a:hover {
  color: #0a58ca;
}

a:not([href]):not([class]),
a:not([href]):not([class]):hover {
  color: inherit;
  text-decoration: none;
}

pre,
code,
kbd,
samp {
  font-family: var(--bs-font-monospace);
  font-size: 1em;
  direction: ltr
    /* rtl:ignore */
  ;
  unicode-bidi: bidi-override;
}

pre {
  display: block;
  margin-top: 0;
  margin-bottom: 1rem;
  overflow: auto;
  font-size: 0.875em;
}

pre code {
  font-size: inherit;
  color: inherit;
  word-break: normal;
}

code {
  font-size: 0.875em;
  color: #d63384;
  word-wrap: break-word;
}

a>code {
  color: inherit;
}

kbd {
  padding: 0.2rem 0.4rem;
  font-size: 0.875em;
  color: #fff;
  background-color: #212529;
  border-radius: 0.2rem;
}

kbd kbd {
  padding: 0;
  font-size: 1em;
  font-weight: 700;
}

figure {
  margin: 0 0 1rem;
}

img,
svg {
  vertical-align: middle;
}

table {
  caption-side: bottom;
  border-collapse: collapse;
}

caption {
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  color: #6c757d;
  text-align: left;
}

th {
  text-align: inherit;
  text-align: -webkit-match-parent;
}

thead,
tbody,
tfoot,
tr,
td,
th {
  border-color: inherit;
  border-style: solid;
  border-width: 0;
}

label {
  display: inline-block;
}

button {
  border-radius: 0;
}

button:focus:not(:focus-visible) {
  outline: 0;
}

input,
button,
select,
optgroup,
textarea {
  margin: 0;
  font-family: inherit;
  font-size: inherit;
  line-height: inherit;
}

button,
select {
  text-transform: none;
}

[role=button] {
  cursor: pointer;
}

select {
  word-wrap: normal;
}

select:disabled {
  opacity: 1;
}

[list]::-webkit-calendar-picker-indicator {
  display: none;
}

button,
[type=button],
[type=reset],
[type=submit] {
  -webkit-appearance: button;
}

button:not(:disabled),
[type=button]:not(:disabled),
[type=reset]:not(:disabled),
[type=submit]:not(:disabled) {
  cursor: pointer;
}

::-moz-focus-inner {
  padding: 0;
  border-style: none;
}

textarea {
  resize: vertical;
}

fieldset {
  min-width: 0;
  padding: 0;
  margin: 0;
  border: 0;
}

legend {
  float: left;
  width: 100%;
  padding: 0;
  margin-bottom: 0.5rem;
  font-size: calc(1.275rem + 0.3vw);
  line-height: inherit;
}

@media (min-width: 1200px) {
  legend {
    font-size: 1.5rem;
  }
}

legend+* {
  clear: left;
}

::-webkit-datetime-edit-fields-wrapper,
::-webkit-datetime-edit-text,
::-webkit-datetime-edit-minute,
::-webkit-datetime-edit-hour-field,
::-webkit-datetime-edit-day-field,
::-webkit-datetime-edit-month-field,
::-webkit-datetime-edit-year-field {
  padding: 0;
}

::-webkit-inner-spin-button {
  height: auto;
}

[type=search] {
  outline-offset: -2px;
  -webkit-appearance: textfield;
}

/* rtl:raw:
[type="tel"],
[type="url"],
[type="email"],
[type="number"] {
  direction: ltr;
}
*/
::-webkit-search-decoration {
  -webkit-appearance: none;
}

::-webkit-color-swatch-wrapper {
  padding: 0;
}

::file-selector-button {
  font: inherit;
}

::-webkit-file-upload-button {
  font: inherit;
  -webkit-appearance: button;
}

output {
  display: inline-block;
}

iframe {
  border: 0;
}

summary {
  display: list-item;
  cursor: pointer;
}

progress {
  vertical-align: baseline;
}

[hidden] {
  display: none !important;
}

.lead {
  font-size: 1.25rem;
  font-weight: 300;
}

.display-1 {
  font-size: calc(1.625rem + 4.5vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-1 {
    font-size: 5rem;
  }
}

.display-2 {
  font-size: calc(1.575rem + 3.9vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-2 {
    font-size: 4.5rem;
  }
}

.display-3 {
  font-size: calc(1.525rem + 3.3vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-3 {
    font-size: 4rem;
  }
}

.display-4 {
  font-size: calc(1.475rem + 2.7vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-4 {
    font-size: 3.5rem;
  }
}

.display-5 {
  font-size: calc(1.425rem + 2.1vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-5 {
    font-size: 3rem;
  }
}

.display-6 {
  font-size: calc(1.375rem + 1.5vw);
  font-weight: 300;
  line-height: 1.2;
}

@media (min-width: 1200px) {
  .display-6 {
    font-size: 2.5rem;
  }
}

.list-unstyled {
  padding-left: 0;
  list-style: none;
}

.list-inline {
  padding-left: 0;
  list-style: none;
}

.list-inline-item {
  display: inline-block;
}

.list-inline-item:not(:last-child) {
  margin-right: 0.5rem;
}

.initialism {
  font-size: 0.875em;
  text-transform: uppercase;
}

.blockquote {
  margin-bottom: 1rem;
  font-size: 1.25rem;
}

.blockquote> :last-child {
  margin-bottom: 0;
}

.blockquote-footer {
  margin-top: -1rem;
  margin-bottom: 1rem;
  font-size: 0.875em;
  color: #6c757d;
}

.blockquote-footer::before {
  content: "— ";
}

.img-fluid {
  max-width: 100%;
  height: auto;
}

.img-thumbnail {
  padding: 0.25rem;
  background-color: #fff;
  border: 1px solid #dee2e6;
  border-radius: 0.25rem;
  max-width: 100%;
  height: auto;
}

.figure {
  display: inline-block;
}

.figure-img {
  margin-bottom: 0.5rem;
  line-height: 1;
}

.figure-caption {
  font-size: 0.875em;
  color: #6c757d;
}

.container,
.container-fluid,
.container-xxl,
.container-xl,
.container-lg,
.container-md,
.container-sm {
  width: 100%;
  padding-right: var(--bs-gutter-x, 0.75rem);
  padding-left: var(--bs-gutter-x, 0.75rem);
  margin-right: auto;
  margin-left: auto;
}

@media (min-width: 576px) {

  .container-sm,
  .container {
    max-width: 540px;
  }
}

@media (min-width: 768px) {

  .container-md,
  .container-sm,
  .container {
    max-width: 720px;
  }
}

@media (min-width: 992px) {

  .container-lg,
  .container-md,
  .container-sm,
  .container {
    max-width: 960px;
  }
}

@media (min-width: 1200px) {

  .container-xl,
  .container-lg,
  .container-md,
  .container-sm,
  .container {
    max-width: 1140px;
  }
}

@media (min-width: 1400px) {

  .container-xxl,
  .container-xl,
  .container-lg,
  .container-md,
  .container-sm,
  .container {
    max-width: 1320px;
  }
}

.row {
  --bs-gutter-x: 1.5rem;
  --bs-gutter-y: 0;
  display: flex;
  flex-wrap: wrap;
  margin-top: calc(var(--bs-gutter-y) * -1);
  margin-right: calc(var(--bs-gutter-x) / -2);
  margin-left: calc(var(--bs-gutter-x) / -2);
}

.row>* {
  flex-shrink: 0;
  width: 100%;
  max-width: 100%;
  padding-right: calc(var(--bs-gutter-x) / 2);
  padding-left: calc(var(--bs-gutter-x) / 2);
  margin-top: var(--bs-gutter-y);
}

.col {
  flex: 1 0 0%;
}

.row-cols-auto>* {
  flex: 0 0 auto;
  width: auto;
}

.row-cols-1>* {
  flex: 0 0 auto;
  width: 100%;
}

.row-cols-2>* {
  flex: 0 0 auto;
  width: 50%;
}

.row-cols-3>* {
  flex: 0 0 auto;
  width: 33.3333333333%;
}

.row-cols-4>* {
  flex: 0 0 auto;
  width: 25%;
}

.row-cols-5>* {
  flex: 0 0 auto;
  width: 20%;
}

.row-cols-6>* {
  flex: 0 0 auto;
  width: 16.6666666667%;
}

.col-auto {
  flex: 0 0 auto;
  width: auto;
}

.col-1 {
  flex: 0 0 auto;
  width: 8.3333333333%;
}

.col-2 {
  flex: 0 0 auto;
  width: 16.6666666667%;
}

.col-3 {
  flex: 0 0 auto;
  width: 25%;
}

.col-4 {
  flex: 0 0 auto;
  width: 33.3333333333%;
}

.col-5 {
  flex: 0 0 auto;
  width: 41.6666666667%;
}

.col-6 {
  flex: 0 0 auto;
  width: 50%;
}

.col-7 {
  flex: 0 0 auto;
  width: 58.3333333333%;
}

.col-8 {
  flex: 0 0 auto;
  width: 66.6666666667%;
}

.col-9 {
  flex: 0 0 auto;
  width: 75%;
}

.col-10 {
  flex: 0 0 auto;
  width: 83.3333333333%;
}

.col-11 {
  flex: 0 0 auto;
  width: 91.6666666667%;
}

.col-12 {
  flex: 0 0 auto;
  width: 100%;
}

.offset-1 {
  margin-left: 8.3333333333%;
}

.offset-2 {
  margin-left: 16.6666666667%;
}

.offset-3 {
  margin-left: 25%;
}

.offset-4 {
  margin-left: 33.3333333333%;
}

.offset-5 {
  margin-left: 41.6666666667%;
}

.offset-6 {
  margin-left: 50%;
}

.offset-7 {
  margin-left: 58.3333333333%;
}

.offset-8 {
  margin-left: 66.6666666667%;
}

.offset-9 {
  margin-left: 75%;
}

.offset-10 {
  margin-left: 83.3333333333%;
}

.offset-11 {
  margin-left: 91.6666666667%;
}

.g-0,
.gx-0 {
  --bs-gutter-x: 0;
}

.g-0,
.gy-0 {
  --bs-gutter-y: 0;
}

.g-1,
.gx-1 {
  --bs-gutter-x: 0.25rem;
}

.g-1,
.gy-1 {
  --bs-gutter-y: 0.25rem;
}

.g-2,
.gx-2 {
  --bs-gutter-x: 0.5rem;
}

.g-2,
.gy-2 {
  --bs-gutter-y: 0.5rem;
}

.g-3,
.gx-3 {
  --bs-gutter-x: 1rem;
}

.g-3,
.gy-3 {
  --bs-gutter-y: 1rem;
}

.g-4,
.gx-4 {
  --bs-gutter-x: 1.5rem;
}

.g-4,
.gy-4 {
  --bs-gutter-y: 1.5rem;
}

.g-5,
.gx-5 {
  --bs-gutter-x: 3rem;
}

.g-5,
.gy-5 {
  --bs-gutter-y: 3rem;
}

@media (min-width: 576px) {
  .col-sm {
    flex: 1 0 0%;
  }

  .row-cols-sm-auto>* {
    flex: 0 0 auto;
    width: auto;
  }

  .row-cols-sm-1>* {
    flex: 0 0 auto;
    width: 100%;
  }

  .row-cols-sm-2>* {
    flex: 0 0 auto;
    width: 50%;
  }

  .row-cols-sm-3>* {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .row-cols-sm-4>* {
    flex: 0 0 auto;
    width: 25%;
  }

  .row-cols-sm-5>* {
    flex: 0 0 auto;
    width: 20%;
  }

  .row-cols-sm-6>* {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-sm-auto {
    flex: 0 0 auto;
    width: auto;
  }

  .col-sm-1 {
    flex: 0 0 auto;
    width: 8.3333333333%;
  }

  .col-sm-2 {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-sm-3 {
    flex: 0 0 auto;
    width: 25%;
  }

  .col-sm-4 {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .col-sm-5 {
    flex: 0 0 auto;
    width: 41.6666666667%;
  }

  .col-sm-6 {
    flex: 0 0 auto;
    width: 50%;
  }

  .col-sm-7 {
    flex: 0 0 auto;
    width: 58.3333333333%;
  }

  .col-sm-8 {
    flex: 0 0 auto;
    width: 66.6666666667%;
  }

  .col-sm-9 {
    flex: 0 0 auto;
    width: 75%;
  }

  .col-sm-10 {
    flex: 0 0 auto;
    width: 83.3333333333%;
  }

  .col-sm-11 {
    flex: 0 0 auto;
    width: 91.6666666667%;
  }

  .col-sm-12 {
    flex: 0 0 auto;
    width: 100%;
  }

  .offset-sm-0 {
    margin-left: 0;
  }

  .offset-sm-1 {
    margin-left: 8.3333333333%;
  }

  .offset-sm-2 {
    margin-left: 16.6666666667%;
  }

  .offset-sm-3 {
    margin-left: 25%;
  }

  .offset-sm-4 {
    margin-left: 33.3333333333%;
  }

  .offset-sm-5 {
    margin-left: 41.6666666667%;
  }

  .offset-sm-6 {
    margin-left: 50%;
  }

  .offset-sm-7 {
    margin-left: 58.3333333333%;
  }

  .offset-sm-8 {
    margin-left: 66.6666666667%;
  }

  .offset-sm-9 {
    margin-left: 75%;
  }

  .offset-sm-10 {
    margin-left: 83.3333333333%;
  }

  .offset-sm-11 {
    margin-left: 91.6666666667%;
  }

  .g-sm-0,
  .gx-sm-0 {
    --bs-gutter-x: 0;
  }

  .g-sm-0,
  .gy-sm-0 {
    --bs-gutter-y: 0;
  }

  .g-sm-1,
  .gx-sm-1 {
    --bs-gutter-x: 0.25rem;
  }

  .g-sm-1,
  .gy-sm-1 {
    --bs-gutter-y: 0.25rem;
  }

  .g-sm-2,
  .gx-sm-2 {
    --bs-gutter-x: 0.5rem;
  }

  .g-sm-2,
  .gy-sm-2 {
    --bs-gutter-y: 0.5rem;
  }

  .g-sm-3,
  .gx-sm-3 {
    --bs-gutter-x: 1rem;
  }

  .g-sm-3,
  .gy-sm-3 {
    --bs-gutter-y: 1rem;
  }

  .g-sm-4,
  .gx-sm-4 {
    --bs-gutter-x: 1.5rem;
  }

  .g-sm-4,
  .gy-sm-4 {
    --bs-gutter-y: 1.5rem;
  }

  .g-sm-5,
  .gx-sm-5 {
    --bs-gutter-x: 3rem;
  }

  .g-sm-5,
  .gy-sm-5 {
    --bs-gutter-y: 3rem;
  }
}

@media (min-width: 768px) {
  .col-md {
    flex: 1 0 0%;
  }

  .row-cols-md-auto>* {
    flex: 0 0 auto;
    width: auto;
  }

  .row-cols-md-1>* {
    flex: 0 0 auto;
    width: 100%;
  }

  .row-cols-md-2>* {
    flex: 0 0 auto;
    width: 50%;
  }

  .row-cols-md-3>* {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .row-cols-md-4>* {
    flex: 0 0 auto;
    width: 25%;
  }

  .row-cols-md-5>* {
    flex: 0 0 auto;
    width: 20%;
  }

  .row-cols-md-6>* {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-md-auto {
    flex: 0 0 auto;
    width: auto;
  }

  .col-md-1 {
    flex: 0 0 auto;
    width: 8.3333333333%;
  }

  .col-md-2 {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-md-3 {
    flex: 0 0 auto;
    width: 25%;
  }

  .col-md-4 {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .col-md-5 {
    flex: 0 0 auto;
    width: 41.6666666667%;
  }

  .col-md-6 {
    flex: 0 0 auto;
    width: 50%;
  }

  .col-md-7 {
    flex: 0 0 auto;
    width: 58.3333333333%;
  }

  .col-md-8 {
    flex: 0 0 auto;
    width: 66.6666666667%;
  }

  .col-md-9 {
    flex: 0 0 auto;
    width: 75%;
  }

  .col-md-10 {
    flex: 0 0 auto;
    width: 83.3333333333%;
  }

  .col-md-11 {
    flex: 0 0 auto;
    width: 91.6666666667%;
  }

  .col-md-12 {
    flex: 0 0 auto;
    width: 100%;
  }

  .offset-md-0 {
    margin-left: 0;
  }

  .offset-md-1 {
    margin-left: 8.3333333333%;
  }

  .offset-md-2 {
    margin-left: 16.6666666667%;
  }

  .offset-md-3 {
    margin-left: 25%;
  }

  .offset-md-4 {
    margin-left: 33.3333333333%;
  }

  .offset-md-5 {
    margin-left: 41.6666666667%;
  }

  .offset-md-6 {
    margin-left: 50%;
  }

  .offset-md-7 {
    margin-left: 58.3333333333%;
  }

  .offset-md-8 {
    margin-left: 66.6666666667%;
  }

  .offset-md-9 {
    margin-left: 75%;
  }

  .offset-md-10 {
    margin-left: 83.3333333333%;
  }

  .offset-md-11 {
    margin-left: 91.6666666667%;
  }

  .g-md-0,
  .gx-md-0 {
    --bs-gutter-x: 0;
  }

  .g-md-0,
  .gy-md-0 {
    --bs-gutter-y: 0;
  }

  .g-md-1,
  .gx-md-1 {
    --bs-gutter-x: 0.25rem;
  }

  .g-md-1,
  .gy-md-1 {
    --bs-gutter-y: 0.25rem;
  }

  .g-md-2,
  .gx-md-2 {
    --bs-gutter-x: 0.5rem;
  }

  .g-md-2,
  .gy-md-2 {
    --bs-gutter-y: 0.5rem;
  }

  .g-md-3,
  .gx-md-3 {
    --bs-gutter-x: 1rem;
  }

  .g-md-3,
  .gy-md-3 {
    --bs-gutter-y: 1rem;
  }

  .g-md-4,
  .gx-md-4 {
    --bs-gutter-x: 1.5rem;
  }

  .g-md-4,
  .gy-md-4 {
    --bs-gutter-y: 1.5rem;
  }

  .g-md-5,
  .gx-md-5 {
    --bs-gutter-x: 3rem;
  }

  .g-md-5,
  .gy-md-5 {
    --bs-gutter-y: 3rem;
  }
}

@media (min-width: 992px) {
  .col-lg {
    flex: 1 0 0%;
  }

  .row-cols-lg-auto>* {
    flex: 0 0 auto;
    width: auto;
  }

  .row-cols-lg-1>* {
    flex: 0 0 auto;
    width: 100%;
  }

  .row-cols-lg-2>* {
    flex: 0 0 auto;
    width: 50%;
  }

  .row-cols-lg-3>* {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .row-cols-lg-4>* {
    flex: 0 0 auto;
    width: 25%;
  }

  .row-cols-lg-5>* {
    flex: 0 0 auto;
    width: 20%;
  }

  .row-cols-lg-6>* {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-lg-auto {
    flex: 0 0 auto;
    width: auto;
  }

  .col-lg-1 {
    flex: 0 0 auto;
    width: 8.3333333333%;
  }

  .col-lg-2 {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-lg-3 {
    flex: 0 0 auto;
    width: 25%;
  }

  .col-lg-4 {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .col-lg-5 {
    flex: 0 0 auto;
    width: 41.6666666667%;
  }

  .col-lg-6 {
    flex: 0 0 auto;
    width: 50%;
  }

  .col-lg-7 {
    flex: 0 0 auto;
    width: 58.3333333333%;
  }

  .col-lg-8 {
    flex: 0 0 auto;
    width: 66.6666666667%;
  }

  .col-lg-9 {
    flex: 0 0 auto;
    width: 75%;
  }

  .col-lg-10 {
    flex: 0 0 auto;
    width: 83.3333333333%;
  }

  .col-lg-11 {
    flex: 0 0 auto;
    width: 91.6666666667%;
  }

  .col-lg-12 {
    flex: 0 0 auto;
    width: 100%;
  }

  .offset-lg-0 {
    margin-left: 0;
  }

  .offset-lg-1 {
    margin-left: 8.3333333333%;
  }

  .offset-lg-2 {
    margin-left: 16.6666666667%;
  }

  .offset-lg-3 {
    margin-left: 25%;
  }

  .offset-lg-4 {
    margin-left: 33.3333333333%;
  }

  .offset-lg-5 {
    margin-left: 41.6666666667%;
  }

  .offset-lg-6 {
    margin-left: 50%;
  }

  .offset-lg-7 {
    margin-left: 58.3333333333%;
  }

  .offset-lg-8 {
    margin-left: 66.6666666667%;
  }

  .offset-lg-9 {
    margin-left: 75%;
  }

  .offset-lg-10 {
    margin-left: 83.3333333333%;
  }

  .offset-lg-11 {
    margin-left: 91.6666666667%;
  }

  .g-lg-0,
  .gx-lg-0 {
    --bs-gutter-x: 0;
  }

  .g-lg-0,
  .gy-lg-0 {
    --bs-gutter-y: 0;
  }

  .g-lg-1,
  .gx-lg-1 {
    --bs-gutter-x: 0.25rem;
  }

  .g-lg-1,
  .gy-lg-1 {
    --bs-gutter-y: 0.25rem;
  }

  .g-lg-2,
  .gx-lg-2 {
    --bs-gutter-x: 0.5rem;
  }

  .g-lg-2,
  .gy-lg-2 {
    --bs-gutter-y: 0.5rem;
  }

  .g-lg-3,
  .gx-lg-3 {
    --bs-gutter-x: 1rem;
  }

  .g-lg-3,
  .gy-lg-3 {
    --bs-gutter-y: 1rem;
  }

  .g-lg-4,
  .gx-lg-4 {
    --bs-gutter-x: 1.5rem;
  }

  .g-lg-4,
  .gy-lg-4 {
    --bs-gutter-y: 1.5rem;
  }

  .g-lg-5,
  .gx-lg-5 {
    --bs-gutter-x: 3rem;
  }

  .g-lg-5,
  .gy-lg-5 {
    --bs-gutter-y: 3rem;
  }
}

@media (min-width: 1200px) {
  .col-xl {
    flex: 1 0 0%;
  }

  .row-cols-xl-auto>* {
    flex: 0 0 auto;
    width: auto;
  }

  .row-cols-xl-1>* {
    flex: 0 0 auto;
    width: 100%;
  }

  .row-cols-xl-2>* {
    flex: 0 0 auto;
    width: 50%;
  }

  .row-cols-xl-3>* {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .row-cols-xl-4>* {
    flex: 0 0 auto;
    width: 25%;
  }

  .row-cols-xl-5>* {
    flex: 0 0 auto;
    width: 20%;
  }

  .row-cols-xl-6>* {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-xl-auto {
    flex: 0 0 auto;
    width: auto;
  }

  .col-xl-1 {
    flex: 0 0 auto;
    width: 8.3333333333%;
  }

  .col-xl-2 {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-xl-3 {
    flex: 0 0 auto;
    width: 25%;
  }

  .col-xl-4 {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .col-xl-5 {
    flex: 0 0 auto;
    width: 41.6666666667%;
  }

  .col-xl-6 {
    flex: 0 0 auto;
    width: 50%;
  }

  .col-xl-7 {
    flex: 0 0 auto;
    width: 58.3333333333%;
  }

  .col-xl-8 {
    flex: 0 0 auto;
    width: 66.6666666667%;
  }

  .col-xl-9 {
    flex: 0 0 auto;
    width: 75%;
  }

  .col-xl-10 {
    flex: 0 0 auto;
    width: 83.3333333333%;
  }

  .col-xl-11 {
    flex: 0 0 auto;
    width: 91.6666666667%;
  }

  .col-xl-12 {
    flex: 0 0 auto;
    width: 100%;
  }

  .offset-xl-0 {
    margin-left: 0;
  }

  .offset-xl-1 {
    margin-left: 8.3333333333%;
  }

  .offset-xl-2 {
    margin-left: 16.6666666667%;
  }

  .offset-xl-3 {
    margin-left: 25%;
  }

  .offset-xl-4 {
    margin-left: 33.3333333333%;
  }

  .offset-xl-5 {
    margin-left: 41.6666666667%;
  }

  .offset-xl-6 {
    margin-left: 50%;
  }

  .offset-xl-7 {
    margin-left: 58.3333333333%;
  }

  .offset-xl-8 {
    margin-left: 66.6666666667%;
  }

  .offset-xl-9 {
    margin-left: 75%;
  }

  .offset-xl-10 {
    margin-left: 83.3333333333%;
  }

  .offset-xl-11 {
    margin-left: 91.6666666667%;
  }

  .g-xl-0,
  .gx-xl-0 {
    --bs-gutter-x: 0;
  }

  .g-xl-0,
  .gy-xl-0 {
    --bs-gutter-y: 0;
  }

  .g-xl-1,
  .gx-xl-1 {
    --bs-gutter-x: 0.25rem;
  }

  .g-xl-1,
  .gy-xl-1 {
    --bs-gutter-y: 0.25rem;
  }

  .g-xl-2,
  .gx-xl-2 {
    --bs-gutter-x: 0.5rem;
  }

  .g-xl-2,
  .gy-xl-2 {
    --bs-gutter-y: 0.5rem;
  }

  .g-xl-3,
  .gx-xl-3 {
    --bs-gutter-x: 1rem;
  }

  .g-xl-3,
  .gy-xl-3 {
    --bs-gutter-y: 1rem;
  }

  .g-xl-4,
  .gx-xl-4 {
    --bs-gutter-x: 1.5rem;
  }

  .g-xl-4,
  .gy-xl-4 {
    --bs-gutter-y: 1.5rem;
  }

  .g-xl-5,
  .gx-xl-5 {
    --bs-gutter-x: 3rem;
  }

  .g-xl-5,
  .gy-xl-5 {
    --bs-gutter-y: 3rem;
  }
}

@media (min-width: 1400px) {
  .col-xxl {
    flex: 1 0 0%;
  }

  .row-cols-xxl-auto>* {
    flex: 0 0 auto;
    width: auto;
  }

  .row-cols-xxl-1>* {
    flex: 0 0 auto;
    width: 100%;
  }

  .row-cols-xxl-2>* {
    flex: 0 0 auto;
    width: 50%;
  }

  .row-cols-xxl-3>* {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .row-cols-xxl-4>* {
    flex: 0 0 auto;
    width: 25%;
  }

  .row-cols-xxl-5>* {
    flex: 0 0 auto;
    width: 20%;
  }

  .row-cols-xxl-6>* {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-xxl-auto {
    flex: 0 0 auto;
    width: auto;
  }

  .col-xxl-1 {
    flex: 0 0 auto;
    width: 8.3333333333%;
  }

  .col-xxl-2 {
    flex: 0 0 auto;
    width: 16.6666666667%;
  }

  .col-xxl-3 {
    flex: 0 0 auto;
    width: 25%;
  }

  .col-xxl-4 {
    flex: 0 0 auto;
    width: 33.3333333333%;
  }

  .col-xxl-5 {
    flex: 0 0 auto;
    width: 41.6666666667%;
  }

  .col-xxl-6 {
    flex: 0 0 auto;
    width: 50%;
  }

  .col-xxl-7 {
    flex: 0 0 auto;
    width: 58.3333333333%;
  }

  .col-xxl-8 {
    flex: 0 0 auto;
    width: 66.6666666667%;
  }

  .col-xxl-9 {
    flex: 0 0 auto;
    width: 75%;
  }

  .col-xxl-10 {
    flex: 0 0 auto;
    width: 83.3333333333%;
  }

  .col-xxl-11 {
    flex: 0 0 auto;
    width: 91.6666666667%;
  }

  .col-xxl-12 {
    flex: 0 0 auto;
    width: 100%;
  }

  .offset-xxl-0 {
    margin-left: 0;
  }

  .offset-xxl-1 {
    margin-left: 8.3333333333%;
  }

  .offset-xxl-2 {
    margin-left: 16.6666666667%;
  }

  .offset-xxl-3 {
    margin-left: 25%;
  }

  .offset-xxl-4 {
    margin-left: 33.3333333333%;
  }

  .offset-xxl-5 {
    margin-left: 41.6666666667%;
  }

  .offset-xxl-6 {
    margin-left: 50%;
  }

  .offset-xxl-7 {
    margin-left: 58.3333333333%;
  }

  .offset-xxl-8 {
    margin-left: 66.6666666667%;
  }

  .offset-xxl-9 {
    margin-left: 75%;
  }

  .offset-xxl-10 {
    margin-left: 83.3333333333%;
  }

  .offset-xxl-11 {
    margin-left: 91.6666666667%;
  }

  .g-xxl-0,
  .gx-xxl-0 {
    --bs-gutter-x: 0;
  }

  .g-xxl-0,
  .gy-xxl-0 {
    --bs-gutter-y: 0;
  }

  .g-xxl-1,
  .gx-xxl-1 {
    --bs-gutter-x: 0.25rem;
  }

  .g-xxl-1,
  .gy-xxl-1 {
    --bs-gutter-y: 0.25rem;
  }

  .g-xxl-2,
  .gx-xxl-2 {
    --bs-gutter-x: 0.5rem;
  }

  .g-xxl-2,
  .gy-xxl-2 {
    --bs-gutter-y: 0.5rem;
  }

  .g-xxl-3,
  .gx-xxl-3 {
    --bs-gutter-x: 1rem;
  }

  .g-xxl-3,
  .gy-xxl-3 {
    --bs-gutter-y: 1rem;
  }

  .g-xxl-4,
  .gx-xxl-4 {
    --bs-gutter-x: 1.5rem;
  }

  .g-xxl-4,
  .gy-xxl-4 {
    --bs-gutter-y: 1.5rem;
  }

  .g-xxl-5,
  .gx-xxl-5 {
    --bs-gutter-x: 3rem;
  }

  .g-xxl-5,
  .gy-xxl-5 {
    --bs-gutter-y: 3rem;
  }
}

.table {
  --bs-table-bg: transparent;
  --bs-table-accent-bg: transparent;
  --bs-table-striped-color: #212529;
  --bs-table-striped-bg: rgba(0, 0, 0, 0.05);
  --bs-table-active-color: #212529;
  --bs-table-active-bg: rgba(0, 0, 0, 0.1);
  --bs-table-hover-color: #212529;
  --bs-table-hover-bg: rgba(0, 0, 0, 0.075);
  width: 100%;
  margin-bottom: 1rem;
  color: #212529;
  vertical-align: top;
  border-color: #dee2e6;
}

.table> :not(caption)>*>* {
  padding: 0.5rem 0.5rem;
  background-color: var(--bs-table-bg);
  border-bottom-width: 1px;
  box-shadow: inset 0 0 0 9999px var(--bs-table-accent-bg);
}

.table>tbody {
  vertical-align: inherit;
}

.table>thead {
  vertical-align: bottom;
}

.table> :not(:last-child)> :last-child>* {
  border-bottom-color: currentColor;
}

.caption-top {
  caption-side: top;
}

.table-sm> :not(caption)>*>* {
  padding: 0.25rem 0.25rem;
}

.table-bordered> :not(caption)>* {
  border-width: 1px 0;
}

.table-bordered> :not(caption)>*>* {
  border-width: 0 1px;
}

.table-borderless> :not(caption)>*>* {
  border-bottom-width: 0;
}

.table-striped>tbody>tr:nth-of-type(odd) {
  --bs-table-accent-bg: var(--bs-table-striped-bg);
  color: var(--bs-table-striped-color);
}

.table-active {
  --bs-table-accent-bg: var(--bs-table-active-bg);
  color: var(--bs-table-active-color);
}

.table-hover>tbody>tr:hover {
  --bs-table-accent-bg: var(--bs-table-hover-bg);
  color: var(--bs-table-hover-color);
}

.table-primary {
  --bs-table-bg: #cfe2ff;
  --bs-table-striped-bg: #c5d7f2;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #bacbe6;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #bfd1ec;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #bacbe6;
}

.table-secondary {
  --bs-table-bg: #e2e3e5;
  --bs-table-striped-bg: #d7d8da;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #cbccce;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #d1d2d4;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #cbccce;
}

.table-success {
  --bs-table-bg: #d1e7dd;
  --bs-table-striped-bg: #c7dbd2;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #bcd0c7;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #c1d6cc;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #bcd0c7;
}

.table-info {
  --bs-table-bg: #cff4fc;
  --bs-table-striped-bg: #c5e8ef;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #badce3;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #bfe2e9;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #badce3;
}

.table-warning {
  --bs-table-bg: #fff3cd;
  --bs-table-striped-bg: #f2e7c3;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #e6dbb9;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #ece1be;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #e6dbb9;
}

.table-danger {
  --bs-table-bg: #f8d7da;
  --bs-table-striped-bg: #eccccf;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #dfc2c4;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #e5c7ca;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #dfc2c4;
}

.table-light {
  --bs-table-bg: #f8f9fa;
  --bs-table-striped-bg: #ecedee;
  --bs-table-striped-color: #000;
  --bs-table-active-bg: #dfe0e1;
  --bs-table-active-color: #000;
  --bs-table-hover-bg: #e5e6e7;
  --bs-table-hover-color: #000;
  color: #000;
  border-color: #dfe0e1;
}

.table-dark {
  --bs-table-bg: #212529;
  --bs-table-striped-bg: #2c3034;
  --bs-table-striped-color: #fff;
  --bs-table-active-bg: #373b3e;
  --bs-table-active-color: #fff;
  --bs-table-hover-bg: #323539;
  --bs-table-hover-color: #fff;
  color: #fff;
  border-color: #373b3e;
}

.table-responsive {
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
}

@media (max-width: 575.98px) {
  .table-responsive-sm {
    overflow-x: auto;
    -webkit-overflow-scrolling: touch;
  }
}

@media (max-width: 767.98px) {
  .table-responsive-md {
    overflow-x: auto;
    -webkit-overflow-scrolling: touch;
  }
}

@media (max-width: 991.98px) {
  .table-responsive-lg {
    overflow-x: auto;
    -webkit-overflow-scrolling: touch;
  }
}

@media (max-width: 1199.98px) {
  .table-responsive-xl {
    overflow-x: auto;
    -webkit-overflow-scrolling: touch;
  }
}

@media (max-width: 1399.98px) {
  .table-responsive-xxl {
    overflow-x: auto;
    -webkit-overflow-scrolling: touch;
  }
}

.form-label {
  margin-bottom: 0.5rem;
}

.col-form-label {
  padding-top: calc(0.375rem + 1px);
  padding-bottom: calc(0.375rem + 1px);
  margin-bottom: 0;
  font-size: inherit;
  line-height: 1.5;
}

.col-form-label-lg {
  padding-top: calc(0.5rem + 1px);
  padding-bottom: calc(0.5rem + 1px);
  font-size: 1.25rem;
}

.col-form-label-sm {
  padding-top: calc(0.25rem + 1px);
  padding-bottom: calc(0.25rem + 1px);
  font-size: 0.875rem;
}

.form-text {
  margin-top: 0.25rem;
  font-size: 0.875em;
  color: #6c757d;
}

.form-control {
  display: block;
  width: 100%;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid #ced4da;
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
  border-radius: 0.25rem;
  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .form-control {
    transition: none;
  }
}

.form-control[type=file] {
  overflow: hidden;
}

.form-control[type=file]:not(:disabled):not([readonly]) {
  cursor: pointer;
}

.form-control:focus {
  color: #212529;
  background-color: #fff;
  border-color: #86b7fe;
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.form-control::-webkit-date-and-time-value {
  height: 1.5em;
}

.form-control::-moz-placeholder {
  color: #6c757d;
  opacity: 1;
}

.form-control::placeholder {
  color: #6c757d;
  opacity: 1;
}

.form-control:disabled,
.form-control[readonly] {
  background-color: #e9ecef;
  opacity: 1;
}

.form-control::file-selector-button {
  padding: 0.375rem 0.75rem;
  margin: -0.375rem -0.75rem;
  -webkit-margin-end: 0.75rem;
  margin-inline-end: 0.75rem;
  color: #212529;
  background-color: #e9ecef;
  pointer-events: none;
  border-color: inherit;
  border-style: solid;
  border-width: 0;
  border-inline-end-width: 1px;
  border-radius: 0;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .form-control::file-selector-button {
    transition: none;
  }
}

.form-control:hover:not(:disabled):not([readonly])::file-selector-button {
  background-color: #dde0e3;
}

.form-control::-webkit-file-upload-button {
  padding: 0.375rem 0.75rem;
  margin: -0.375rem -0.75rem;
  -webkit-margin-end: 0.75rem;
  margin-inline-end: 0.75rem;
  color: #212529;
  background-color: #e9ecef;
  pointer-events: none;
  border-color: inherit;
  border-style: solid;
  border-width: 0;
  border-inline-end-width: 1px;
  border-radius: 0;
  -webkit-transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .form-control::-webkit-file-upload-button {
    -webkit-transition: none;
    transition: none;
  }
}

.form-control:hover:not(:disabled):not([readonly])::-webkit-file-upload-button {
  background-color: #dde0e3;
}

.form-control-plaintext {
  display: block;
  width: 100%;
  padding: 0.375rem 0;
  margin-bottom: 0;
  line-height: 1.5;
  color: #212529;
  background-color: transparent;
  border: solid transparent;
  border-width: 1px 0;
}

.form-control-plaintext.form-control-sm,
.form-control-plaintext.form-control-lg {
  padding-right: 0;
  padding-left: 0;
}

.form-control-sm {
  min-height: calc(1.5em + 0.5rem + 2px);
  padding: 0.25rem 0.5rem;
  font-size: 0.875rem;
  border-radius: 0.2rem;
}

.form-control-sm::file-selector-button {
  padding: 0.25rem 0.5rem;
  margin: -0.25rem -0.5rem;
  -webkit-margin-end: 0.5rem;
  margin-inline-end: 0.5rem;
}

.form-control-sm::-webkit-file-upload-button {
  padding: 0.25rem 0.5rem;
  margin: -0.25rem -0.5rem;
  -webkit-margin-end: 0.5rem;
  margin-inline-end: 0.5rem;
}

.form-control-lg {
  min-height: calc(1.5em + 1rem + 2px);
  padding: 0.5rem 1rem;
  font-size: 1.25rem;
  border-radius: 0.3rem;
}

.form-control-lg::file-selector-button {
  padding: 0.5rem 1rem;
  margin: -0.5rem -1rem;
  -webkit-margin-end: 1rem;
  margin-inline-end: 1rem;
}

.form-control-lg::-webkit-file-upload-button {
  padding: 0.5rem 1rem;
  margin: -0.5rem -1rem;
  -webkit-margin-end: 1rem;
  margin-inline-end: 1rem;
}

textarea.form-control {
  min-height: calc(1.5em + 0.75rem + 2px);
}

textarea.form-control-sm {
  min-height: calc(1.5em + 0.5rem + 2px);
}

textarea.form-control-lg {
  min-height: calc(1.5em + 1rem + 2px);
}

.form-control-color {
  max-width: 3rem;
  height: auto;
  padding: 0.375rem;
}

.form-control-color:not(:disabled):not([readonly]) {
  cursor: pointer;
}

.form-control-color::-moz-color-swatch {
  height: 1.5em;
  border-radius: 0.25rem;
}

.form-control-color::-webkit-color-swatch {
  height: 1.5em;
  border-radius: 0.25rem;
}

.form-select {
  display: block;
  width: 100%;
  padding: 0.375rem 2.25rem 0.375rem 0.75rem;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  background-color: #fff;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16'%3e%3cpath fill='none' stroke='%23343a40' stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M2 5l6 6 6-6'/%3e%3c/svg%3e");
  background-repeat: no-repeat;
  background-position: right 0.75rem center;
  background-size: 16px 12px;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
}

.form-select:focus {
  border-color: #86b7fe;
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.form-select[multiple],
.form-select[size]:not([size="1"]) {
  padding-right: 0.75rem;
  background-image: none;
}

.form-select:disabled {
  background-color: #e9ecef;
}

.form-select:-moz-focusring {
  color: transparent;
  text-shadow: 0 0 0 #212529;
}

.form-select-sm {
  padding-top: 0.25rem;
  padding-bottom: 0.25rem;
  padding-left: 0.5rem;
  font-size: 0.875rem;
}

.form-select-lg {
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  padding-left: 1rem;
  font-size: 1.25rem;
}

.form-check {
  display: block;
  min-height: 1.5rem;
  padding-left: 1.5em;
  margin-bottom: 0.125rem;
}

.form-check .form-check-input {
  float: left;
  margin-left: -1.5em;
}

.form-check-input {
  width: 1em;
  height: 1em;
  margin-top: 0.25em;
  vertical-align: top;
  background-color: #fff;
  background-repeat: no-repeat;
  background-position: center;
  background-size: contain;
  border: 1px solid rgba(0, 0, 0, 0.25);
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
  -webkit-print-color-adjust: exact;
  color-adjust: exact;
}

.form-check-input[type=checkbox] {
  border-radius: 0.25em;
}

.form-check-input[type=radio] {
  border-radius: 50%;
}

.form-check-input:active {
  filter: brightness(90%);
}

.form-check-input:focus {
  border-color: #86b7fe;
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.form-check-input:checked {
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.form-check-input:checked[type=checkbox] {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 20 20'%3e%3cpath fill='none' stroke='%23fff' stroke-linecap='round' stroke-linejoin='round' stroke-width='3' d='M6 10l3 3l6-6'/%3e%3c/svg%3e");
}

.form-check-input:checked[type=radio] {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 8'%3e%3ccircle r='2' fill='%23fff'/%3e%3c/svg%3e");
}

.form-check-input[type=checkbox]:indeterminate {
  background-color: #0d6efd;
  border-color: #0d6efd;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 20 20'%3e%3cpath fill='none' stroke='%23fff' stroke-linecap='round' stroke-linejoin='round' stroke-width='3' d='M6 10h8'/%3e%3c/svg%3e");
}

.form-check-input:disabled {
  pointer-events: none;
  filter: none;
  opacity: 0.5;
}

.form-check-input[disabled]~.form-check-label,
.form-check-input:disabled~.form-check-label {
  opacity: 0.5;
}

.form-switch {
  padding-left: 2.5em;
}

.form-switch .form-check-input {
  width: 2em;
  margin-left: -2.5em;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 8'%3e%3ccircle r='3' fill='rgba%280, 0, 0, 0.25%29'/%3e%3c/svg%3e");
  background-position: left center;
  border-radius: 2em;
  transition: background-position 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .form-switch .form-check-input {
    transition: none;
  }
}

.form-switch .form-check-input:focus {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 8'%3e%3ccircle r='3' fill='%2386b7fe'/%3e%3c/svg%3e");
}

.form-switch .form-check-input:checked {
  background-position: right center;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 8'%3e%3ccircle r='3' fill='%23fff'/%3e%3c/svg%3e");
}

.form-check-inline {
  display: inline-block;
  margin-right: 1rem;
}

.btn-check {
  position: absolute;
  clip: rect(0, 0, 0, 0);
  pointer-events: none;
}

.btn-check[disabled]+.btn,
.btn-check:disabled+.btn {
  pointer-events: none;
  filter: none;
  opacity: 0.65;
}

.form-range {
  width: 100%;
  height: 1.5rem;
  padding: 0;
  background-color: transparent;
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
}

.form-range:focus {
  outline: 0;
}

.form-range:focus::-webkit-slider-thumb {
  box-shadow: 0 0 0 1px #fff, 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.form-range:focus::-moz-range-thumb {
  box-shadow: 0 0 0 1px #fff, 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.form-range::-moz-focus-outer {
  border: 0;
}

.form-range::-webkit-slider-thumb {
  width: 1rem;
  height: 1rem;
  margin-top: -0.25rem;
  background-color: #0d6efd;
  border: 0;
  border-radius: 1rem;
  -webkit-transition: background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  transition: background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  -webkit-appearance: none;
  appearance: none;
}

@media (prefers-reduced-motion: reduce) {
  .form-range::-webkit-slider-thumb {
    -webkit-transition: none;
    transition: none;
  }
}

.form-range::-webkit-slider-thumb:active {
  background-color: #b6d4fe;
}

.form-range::-webkit-slider-runnable-track {
  width: 100%;
  height: 0.5rem;
  color: transparent;
  cursor: pointer;
  background-color: #dee2e6;
  border-color: transparent;
  border-radius: 1rem;
}

.form-range::-moz-range-thumb {
  width: 1rem;
  height: 1rem;
  background-color: #0d6efd;
  border: 0;
  border-radius: 1rem;
  -moz-transition: background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  transition: background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  -moz-appearance: none;
  appearance: none;
}

@media (prefers-reduced-motion: reduce) {
  .form-range::-moz-range-thumb {
    -moz-transition: none;
    transition: none;
  }
}

.form-range::-moz-range-thumb:active {
  background-color: #b6d4fe;
}

.form-range::-moz-range-track {
  width: 100%;
  height: 0.5rem;
  color: transparent;
  cursor: pointer;
  background-color: #dee2e6;
  border-color: transparent;
  border-radius: 1rem;
}

.form-range:disabled {
  pointer-events: none;
}

.form-range:disabled::-webkit-slider-thumb {
  background-color: #adb5bd;
}

.form-range:disabled::-moz-range-thumb {
  background-color: #adb5bd;
}

.form-floating {
  position: relative;
}

.form-floating>.form-control,
.form-floating>.form-select {
  height: calc(3.5rem + 2px);
  padding: 1rem 0.75rem;
}

.form-floating>label {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  padding: 1rem 0.75rem;
  pointer-events: none;
  border: 1px solid transparent;
  transform-origin: 0 0;
  transition: opacity 0.1s ease-in-out, transform 0.1s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .form-floating>label {
    transition: none;
  }
}

.form-floating>.form-control::-moz-placeholder {
  color: transparent;
}

.form-floating>.form-control::placeholder {
  color: transparent;
}

.form-floating>.form-control:not(:-moz-placeholder-shown) {
  padding-top: 1.625rem;
  padding-bottom: 0.625rem;
}

.form-floating>.form-control:focus,
.form-floating>.form-control:not(:placeholder-shown) {
  padding-top: 1.625rem;
  padding-bottom: 0.625rem;
}

.form-floating>.form-control:-webkit-autofill {
  padding-top: 1.625rem;
  padding-bottom: 0.625rem;
}

.form-floating>.form-select {
  padding-top: 1.625rem;
  padding-bottom: 0.625rem;
}

.form-floating>.form-control:not(:-moz-placeholder-shown)~label {
  opacity: 0.65;
  transform: scale(0.85) translateY(-0.5rem) translateX(0.15rem);
}

.form-floating>.form-control:focus~label,
.form-floating>.form-control:not(:placeholder-shown)~label,
.form-floating>.form-select~label {
  opacity: 0.65;
  transform: scale(0.85) translateY(-0.5rem) translateX(0.15rem);
}

.form-floating>.form-control:-webkit-autofill~label {
  opacity: 0.65;
  transform: scale(0.85) translateY(-0.5rem) translateX(0.15rem);
}

.input-group {
  position: relative;
  display: flex;
  flex-wrap: wrap;
  align-items: stretch;
  width: 100%;
}

.input-group>.form-control,
.input-group>.form-select {
  position: relative;
  flex: 1 1 auto;
  width: 1%;
  min-width: 0;
}

.input-group>.form-control:focus,
.input-group>.form-select:focus {
  z-index: 3;
}

.input-group .btn {
  position: relative;
  z-index: 2;
}

.input-group .btn:focus {
  z-index: 3;
}

.input-group-text {
  display: flex;
  align-items: center;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  text-align: center;
  white-space: nowrap;
  background-color: #e9ecef;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
}

.input-group-lg>.form-control,
.input-group-lg>.form-select,
.input-group-lg>.input-group-text,
.input-group-lg>.btn {
  padding: 0.5rem 1rem;
  font-size: 1.25rem;
  border-radius: 0.3rem;
}

.input-group-sm>.form-control,
.input-group-sm>.form-select,
.input-group-sm>.input-group-text,
.input-group-sm>.btn {
  padding: 0.25rem 0.5rem;
  font-size: 0.875rem;
  border-radius: 0.2rem;
}

.input-group-lg>.form-select,
.input-group-sm>.form-select {
  padding-right: 3rem;
}

.input-group:not(.has-validation)> :not(:last-child):not(.dropdown-toggle):not(.dropdown-menu),
.input-group:not(.has-validation)>.dropdown-toggle:nth-last-child(n+3) {
  border-top-right-radius: 0;
  border-bottom-right-radius: 0;
}

.input-group.has-validation> :nth-last-child(n+3):not(.dropdown-toggle):not(.dropdown-menu),
.input-group.has-validation>.dropdown-toggle:nth-last-child(n+4) {
  border-top-right-radius: 0;
  border-bottom-right-radius: 0;
}

.input-group> :not(:first-child):not(.dropdown-menu):not(.valid-tooltip):not(.valid-feedback):not(.invalid-tooltip):not(.invalid-feedback) {
  margin-left: -1px;
  border-top-left-radius: 0;
  border-bottom-left-radius: 0;
}

.valid-feedback {
  display: none;
  width: 100%;
  margin-top: 0.25rem;
  font-size: 0.875em;
  color: #198754;
}

.valid-tooltip {
  position: absolute;
  top: 100%;
  z-index: 5;
  display: none;
  max-width: 100%;
  padding: 0.25rem 0.5rem;
  margin-top: 0.1rem;
  font-size: 0.875rem;
  color: #fff;
  background-color: rgba(25, 135, 84, 0.9);
  border-radius: 0.25rem;
}

.was-validated :valid~.valid-feedback,
.was-validated :valid~.valid-tooltip,
.is-valid~.valid-feedback,
.is-valid~.valid-tooltip {
  display: block;
}

.was-validated .form-control:valid,
.form-control.is-valid {
  border-color: #198754;
  padding-right: calc(1.5em + 0.75rem);
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 8 8'%3e%3cpath fill='%23198754' d='M2.3 6.73L.6 4.53c-.4-1.04.46-1.4 1.1-.8l1.1 1.4 3.4-3.8c.6-.63 1.6-.27 1.2.7l-4 4.6c-.43.5-.8.4-1.1.1z'/%3e%3c/svg%3e");
  background-repeat: no-repeat;
  background-position: right calc(0.375em + 0.1875rem) center;
  background-size: calc(0.75em + 0.375rem) calc(0.75em + 0.375rem);
}

.was-validated .form-control:valid:focus,
.form-control.is-valid:focus {
  border-color: #198754;
  box-shadow: 0 0 0 0.25rem rgba(25, 135, 84, 0.25);
}

.was-validated textarea.form-control:valid,
textarea.form-control.is-valid {
  padding-right: calc(1.5em + 0.75rem);
  background-position: top calc(0.375em + 0.1875rem) right calc(0.375em + 0.1875rem);
}

.was-validated .form-select:valid,
.form-select.is-valid {
  border-color: #198754;
}

.was-validated .form-select:valid:not([multiple]):not([size]),
.was-validated .form-select:valid:not([multiple])[size="1"],
.form-select.is-valid:not([multiple]):not([size]),
.form-select.is-valid:not([multiple])[size="1"] {
  padding-right: 4.125rem;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16'%3e%3cpath fill='none' stroke='%23343a40' stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M2 5l6 6 6-6'/%3e%3c/svg%3e"), url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 8 8'%3e%3cpath fill='%23198754' d='M2.3 6.73L.6 4.53c-.4-1.04.46-1.4 1.1-.8l1.1 1.4 3.4-3.8c.6-.63 1.6-.27 1.2.7l-4 4.6c-.43.5-.8.4-1.1.1z'/%3e%3c/svg%3e");
  background-position: right 0.75rem center, center right 2.25rem;
  background-size: 16px 12px, calc(0.75em + 0.375rem) calc(0.75em + 0.375rem);
}

.was-validated .form-select:valid:focus,
.form-select.is-valid:focus {
  border-color: #198754;
  box-shadow: 0 0 0 0.25rem rgba(25, 135, 84, 0.25);
}

.was-validated .form-check-input:valid,
.form-check-input.is-valid {
  border-color: #198754;
}

.was-validated .form-check-input:valid:checked,
.form-check-input.is-valid:checked {
  background-color: #198754;
}

.was-validated .form-check-input:valid:focus,
.form-check-input.is-valid:focus {
  box-shadow: 0 0 0 0.25rem rgba(25, 135, 84, 0.25);
}

.was-validated .form-check-input:valid~.form-check-label,
.form-check-input.is-valid~.form-check-label {
  color: #198754;
}

.form-check-inline .form-check-input~.valid-feedback {
  margin-left: 0.5em;
}

.was-validated .input-group .form-control:valid,
.input-group .form-control.is-valid,
.was-validated .input-group .form-select:valid,
.input-group .form-select.is-valid {
  z-index: 1;
}

.was-validated .input-group .form-control:valid:focus,
.input-group .form-control.is-valid:focus,
.was-validated .input-group .form-select:valid:focus,
.input-group .form-select.is-valid:focus {
  z-index: 3;
}

.invalid-feedback {
  display: none;
  width: 100%;
  margin-top: 0.25rem;
  font-size: 0.875em;
  color: #dc3545;
}

.invalid-tooltip {
  position: absolute;
  top: 100%;
  z-index: 5;
  display: none;
  max-width: 100%;
  padding: 0.25rem 0.5rem;
  margin-top: 0.1rem;
  font-size: 0.875rem;
  color: #fff;
  background-color: rgba(220, 53, 69, 0.9);
  border-radius: 0.25rem;
}

.was-validated :invalid~.invalid-feedback,
.was-validated :invalid~.invalid-tooltip,
.is-invalid~.invalid-feedback,
.is-invalid~.invalid-tooltip {
  display: block;
}

.was-validated .form-control:invalid,
.form-control.is-invalid {
  border-color: #dc3545;
  padding-right: calc(1.5em + 0.75rem);
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 12 12' width='12' height='12' fill='none' stroke='%23dc3545'%3e%3ccircle cx='6' cy='6' r='4.5'/%3e%3cpath stroke-linejoin='round' d='M5.8 3.6h.4L6 6.5z'/%3e%3ccircle cx='6' cy='8.2' r='.6' fill='%23dc3545' stroke='none'/%3e%3c/svg%3e");
  background-repeat: no-repeat;
  background-position: right calc(0.375em + 0.1875rem) center;
  background-size: calc(0.75em + 0.375rem) calc(0.75em + 0.375rem);
}

.was-validated .form-control:invalid:focus,
.form-control.is-invalid:focus {
  border-color: #dc3545;
  box-shadow: 0 0 0 0.25rem rgba(220, 53, 69, 0.25);
}

.was-validated textarea.form-control:invalid,
textarea.form-control.is-invalid {
  padding-right: calc(1.5em + 0.75rem);
  background-position: top calc(0.375em + 0.1875rem) right calc(0.375em + 0.1875rem);
}

.was-validated .form-select:invalid,
.form-select.is-invalid {
  border-color: #dc3545;
}

.was-validated .form-select:invalid:not([multiple]):not([size]),
.was-validated .form-select:invalid:not([multiple])[size="1"],
.form-select.is-invalid:not([multiple]):not([size]),
.form-select.is-invalid:not([multiple])[size="1"] {
  padding-right: 4.125rem;
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16'%3e%3cpath fill='none' stroke='%23343a40' stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M2 5l6 6 6-6'/%3e%3c/svg%3e"), url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 12 12' width='12' height='12' fill='none' stroke='%23dc3545'%3e%3ccircle cx='6' cy='6' r='4.5'/%3e%3cpath stroke-linejoin='round' d='M5.8 3.6h.4L6 6.5z'/%3e%3ccircle cx='6' cy='8.2' r='.6' fill='%23dc3545' stroke='none'/%3e%3c/svg%3e");
  background-position: right 0.75rem center, center right 2.25rem;
  background-size: 16px 12px, calc(0.75em + 0.375rem) calc(0.75em + 0.375rem);
}

.was-validated .form-select:invalid:focus,
.form-select.is-invalid:focus {
  border-color: #dc3545;
  box-shadow: 0 0 0 0.25rem rgba(220, 53, 69, 0.25);
}

.was-validated .form-check-input:invalid,
.form-check-input.is-invalid {
  border-color: #dc3545;
}

.was-validated .form-check-input:invalid:checked,
.form-check-input.is-invalid:checked {
  background-color: #dc3545;
}

.was-validated .form-check-input:invalid:focus,
.form-check-input.is-invalid:focus {
  box-shadow: 0 0 0 0.25rem rgba(220, 53, 69, 0.25);
}

.was-validated .form-check-input:invalid~.form-check-label,
.form-check-input.is-invalid~.form-check-label {
  color: #dc3545;
}

.form-check-inline .form-check-input~.invalid-feedback {
  margin-left: 0.5em;
}

.was-validated .input-group .form-control:invalid,
.input-group .form-control.is-invalid,
.was-validated .input-group .form-select:invalid,
.input-group .form-select.is-invalid {
  z-index: 2;
}

.was-validated .input-group .form-control:invalid:focus,
.input-group .form-control.is-invalid:focus,
.was-validated .input-group .form-select:invalid:focus,
.input-group .form-select.is-invalid:focus {
  z-index: 3;
}

.btn {
  display: inline-block;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  text-align: center;
  text-decoration: none;
  vertical-align: middle;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  user-select: none;
  background-color: transparent;
  border: 1px solid transparent;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  border-radius: 0.25rem;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .btn {
    transition: none;
  }
}

.btn:hover {
  color: #212529;
}

.btn-check:focus+.btn,
.btn:focus {
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.btn:disabled,
.btn.disabled,
fieldset:disabled .btn {
  pointer-events: none;
  opacity: 0.65;
}

.btn-primary {
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.btn-primary:hover {
  color: #fff;
  background-color: #0b5ed7;
  border-color: #0a58ca;
}

.btn-check:focus+.btn-primary,
.btn-primary:focus {
  color: #fff;
  background-color: #0b5ed7;
  border-color: #0a58ca;
  box-shadow: 0 0 0 0.25rem rgba(49, 132, 253, 0.5);
}

.btn-check:checked+.btn-primary,
.btn-check:active+.btn-primary,
.btn-primary:active,
.btn-primary.active,
.show>.btn-primary.dropdown-toggle {
  color: #fff;
  background-color: #0a58ca;
  border-color: #0a53be;
}

.btn-check:checked+.btn-primary:focus,
.btn-check:active+.btn-primary:focus,
.btn-primary:active:focus,
.btn-primary.active:focus,
.show>.btn-primary.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(49, 132, 253, 0.5);
}

.btn-primary:disabled,
.btn-primary.disabled {
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.btn-secondary {
  color: #fff;
  background-color: #6c757d;
  border-color: #6c757d;
}

.btn-secondary:hover {
  color: #fff;
  background-color: #5c636a;
  border-color: #565e64;
}

.btn-check:focus+.btn-secondary,
.btn-secondary:focus {
  color: #fff;
  background-color: #5c636a;
  border-color: #565e64;
  box-shadow: 0 0 0 0.25rem rgba(130, 138, 145, 0.5);
}

.btn-check:checked+.btn-secondary,
.btn-check:active+.btn-secondary,
.btn-secondary:active,
.btn-secondary.active,
.show>.btn-secondary.dropdown-toggle {
  color: #fff;
  background-color: #565e64;
  border-color: #51585e;
}

.btn-check:checked+.btn-secondary:focus,
.btn-check:active+.btn-secondary:focus,
.btn-secondary:active:focus,
.btn-secondary.active:focus,
.show>.btn-secondary.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(130, 138, 145, 0.5);
}

.btn-secondary:disabled,
.btn-secondary.disabled {
  color: #fff;
  background-color: #6c757d;
  border-color: #6c757d;
}

.btn-success {
  color: #fff;
  background-color: #198754;
  border-color: #198754;
}

.btn-success:hover {
  color: #fff;
  background-color: #157347;
  border-color: #146c43;
}

.btn-check:focus+.btn-success,
.btn-success:focus {
  color: #fff;
  background-color: #157347;
  border-color: #146c43;
  box-shadow: 0 0 0 0.25rem rgba(60, 153, 110, 0.5);
}

.btn-check:checked+.btn-success,
.btn-check:active+.btn-success,
.btn-success:active,
.btn-success.active,
.show>.btn-success.dropdown-toggle {
  color: #fff;
  background-color: #146c43;
  border-color: #13653f;
}

.btn-check:checked+.btn-success:focus,
.btn-check:active+.btn-success:focus,
.btn-success:active:focus,
.btn-success.active:focus,
.show>.btn-success.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(60, 153, 110, 0.5);
}

.btn-success:disabled,
.btn-success.disabled {
  color: #fff;
  background-color: #198754;
  border-color: #198754;
}

.btn-info {
  color: #000;
  background-color: #0dcaf0;
  border-color: #0dcaf0;
}

.btn-info:hover {
  color: #000;
  background-color: #31d2f2;
  border-color: #25cff2;
}

.btn-check:focus+.btn-info,
.btn-info:focus {
  color: #000;
  background-color: #31d2f2;
  border-color: #25cff2;
  box-shadow: 0 0 0 0.25rem rgba(11, 172, 204, 0.5);
}

.btn-check:checked+.btn-info,
.btn-check:active+.btn-info,
.btn-info:active,
.btn-info.active,
.show>.btn-info.dropdown-toggle {
  color: #000;
  background-color: #3dd5f3;
  border-color: #25cff2;
}

.btn-check:checked+.btn-info:focus,
.btn-check:active+.btn-info:focus,
.btn-info:active:focus,
.btn-info.active:focus,
.show>.btn-info.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(11, 172, 204, 0.5);
}

.btn-info:disabled,
.btn-info.disabled {
  color: #000;
  background-color: #0dcaf0;
  border-color: #0dcaf0;
}

.btn-warning {
  color: #000;
  background-color: #ffc107;
  border-color: #ffc107;
}

.btn-warning:hover {
  color: #000;
  background-color: #ffca2c;
  border-color: #ffc720;
}

.btn-check:focus+.btn-warning,
.btn-warning:focus {
  color: #000;
  background-color: #ffca2c;
  border-color: #ffc720;
  box-shadow: 0 0 0 0.25rem rgba(217, 164, 6, 0.5);
}

.btn-check:checked+.btn-warning,
.btn-check:active+.btn-warning,
.btn-warning:active,
.btn-warning.active,
.show>.btn-warning.dropdown-toggle {
  color: #000;
  background-color: #ffcd39;
  border-color: #ffc720;
}

.btn-check:checked+.btn-warning:focus,
.btn-check:active+.btn-warning:focus,
.btn-warning:active:focus,
.btn-warning.active:focus,
.show>.btn-warning.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(217, 164, 6, 0.5);
}

.btn-warning:disabled,
.btn-warning.disabled {
  color: #000;
  background-color: #ffc107;
  border-color: #ffc107;
}

.btn-danger {
  color: #fff;
  background-color: #dc3545;
  border-color: #dc3545;
}

.btn-danger:hover {
  color: #fff;
  background-color: #bb2d3b;
  border-color: #b02a37;
}

.btn-check:focus+.btn-danger,
.btn-danger:focus {
  color: #fff;
  background-color: #bb2d3b;
  border-color: #b02a37;
  box-shadow: 0 0 0 0.25rem rgba(225, 83, 97, 0.5);
}

.btn-check:checked+.btn-danger,
.btn-check:active+.btn-danger,
.btn-danger:active,
.btn-danger.active,
.show>.btn-danger.dropdown-toggle {
  color: #fff;
  background-color: #b02a37;
  border-color: #a52834;
}

.btn-check:checked+.btn-danger:focus,
.btn-check:active+.btn-danger:focus,
.btn-danger:active:focus,
.btn-danger.active:focus,
.show>.btn-danger.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(225, 83, 97, 0.5);
}

.btn-danger:disabled,
.btn-danger.disabled {
  color: #fff;
  background-color: #dc3545;
  border-color: #dc3545;
}

.btn-light {
  color: #000;
  background-color: #f8f9fa;
  border-color: #f8f9fa;
}

.btn-light:hover {
  color: #000;
  background-color: #f9fafb;
  border-color: #f9fafb;
}

.btn-check:focus+.btn-light,
.btn-light:focus {
  color: #000;
  background-color: #f9fafb;
  border-color: #f9fafb;
  box-shadow: 0 0 0 0.25rem rgba(211, 212, 213, 0.5);
}

.btn-check:checked+.btn-light,
.btn-check:active+.btn-light,
.btn-light:active,
.btn-light.active,
.show>.btn-light.dropdown-toggle {
  color: #000;
  background-color: #f9fafb;
  border-color: #f9fafb;
}

.btn-check:checked+.btn-light:focus,
.btn-check:active+.btn-light:focus,
.btn-light:active:focus,
.btn-light.active:focus,
.show>.btn-light.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(211, 212, 213, 0.5);
}

.btn-light:disabled,
.btn-light.disabled {
  color: #000;
  background-color: #f8f9fa;
  border-color: #f8f9fa;
}

.btn-dark {
  color: #fff;
  background-color: #212529;
  border-color: #212529;
}

.btn-dark:hover {
  color: #fff;
  background-color: #1c1f23;
  border-color: #1a1e21;
}

.btn-check:focus+.btn-dark,
.btn-dark:focus {
  color: #fff;
  background-color: #1c1f23;
  border-color: #1a1e21;
  box-shadow: 0 0 0 0.25rem rgba(66, 70, 73, 0.5);
}

.btn-check:checked+.btn-dark,
.btn-check:active+.btn-dark,
.btn-dark:active,
.btn-dark.active,
.show>.btn-dark.dropdown-toggle {
  color: #fff;
  background-color: #1a1e21;
  border-color: #191c1f;
}

.btn-check:checked+.btn-dark:focus,
.btn-check:active+.btn-dark:focus,
.btn-dark:active:focus,
.btn-dark.active:focus,
.show>.btn-dark.dropdown-toggle:focus {
  box-shadow: 0 0 0 0.25rem rgba(66, 70, 73, 0.5);
}

.btn-dark:disabled,
.btn-dark.disabled {
  color: #fff;
  background-color: #212529;
  border-color: #212529;
}

.btn-outline-primary {
  color: #0d6efd;
  border-color: #0d6efd;
}

.btn-outline-primary:hover {
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.btn-check:focus+.btn-outline-primary,
.btn-outline-primary:focus {
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.5);
}

.btn-check:checked+.btn-outline-primary,
.btn-check:active+.btn-outline-primary,
.btn-outline-primary:active,
.btn-outline-primary.active,
.btn-outline-primary.dropdown-toggle.show {
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.btn-check:checked+.btn-outline-primary:focus,
.btn-check:active+.btn-outline-primary:focus,
.btn-outline-primary:active:focus,
.btn-outline-primary.active:focus,
.btn-outline-primary.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.5);
}

.btn-outline-primary:disabled,
.btn-outline-primary.disabled {
  color: #0d6efd;
  background-color: transparent;
}

.btn-outline-secondary {
  color: #6c757d;
  border-color: #6c757d;
}

.btn-outline-secondary:hover {
  color: #fff;
  background-color: #6c757d;
  border-color: #6c757d;
}

.btn-check:focus+.btn-outline-secondary,
.btn-outline-secondary:focus {
  box-shadow: 0 0 0 0.25rem rgba(108, 117, 125, 0.5);
}

.btn-check:checked+.btn-outline-secondary,
.btn-check:active+.btn-outline-secondary,
.btn-outline-secondary:active,
.btn-outline-secondary.active,
.btn-outline-secondary.dropdown-toggle.show {
  color: #fff;
  background-color: #6c757d;
  border-color: #6c757d;
}

.btn-check:checked+.btn-outline-secondary:focus,
.btn-check:active+.btn-outline-secondary:focus,
.btn-outline-secondary:active:focus,
.btn-outline-secondary.active:focus,
.btn-outline-secondary.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(108, 117, 125, 0.5);
}

.btn-outline-secondary:disabled,
.btn-outline-secondary.disabled {
  color: #6c757d;
  background-color: transparent;
}

.btn-outline-success {
  color: #198754;
  border-color: #198754;
}

.btn-outline-success:hover {
  color: #fff;
  background-color: #198754;
  border-color: #198754;
}

.btn-check:focus+.btn-outline-success,
.btn-outline-success:focus {
  box-shadow: 0 0 0 0.25rem rgba(25, 135, 84, 0.5);
}

.btn-check:checked+.btn-outline-success,
.btn-check:active+.btn-outline-success,
.btn-outline-success:active,
.btn-outline-success.active,
.btn-outline-success.dropdown-toggle.show {
  color: #fff;
  background-color: #198754;
  border-color: #198754;
}

.btn-check:checked+.btn-outline-success:focus,
.btn-check:active+.btn-outline-success:focus,
.btn-outline-success:active:focus,
.btn-outline-success.active:focus,
.btn-outline-success.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(25, 135, 84, 0.5);
}

.btn-outline-success:disabled,
.btn-outline-success.disabled {
  color: #198754;
  background-color: transparent;
}

.btn-outline-info {
  color: #0dcaf0;
  border-color: #0dcaf0;
}

.btn-outline-info:hover {
  color: #000;
  background-color: #0dcaf0;
  border-color: #0dcaf0;
}

.btn-check:focus+.btn-outline-info,
.btn-outline-info:focus {
  box-shadow: 0 0 0 0.25rem rgba(13, 202, 240, 0.5);
}

.btn-check:checked+.btn-outline-info,
.btn-check:active+.btn-outline-info,
.btn-outline-info:active,
.btn-outline-info.active,
.btn-outline-info.dropdown-toggle.show {
  color: #000;
  background-color: #0dcaf0;
  border-color: #0dcaf0;
}

.btn-check:checked+.btn-outline-info:focus,
.btn-check:active+.btn-outline-info:focus,
.btn-outline-info:active:focus,
.btn-outline-info.active:focus,
.btn-outline-info.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(13, 202, 240, 0.5);
}

.btn-outline-info:disabled,
.btn-outline-info.disabled {
  color: #0dcaf0;
  background-color: transparent;
}

.btn-outline-warning {
  color: #ffc107;
  border-color: #ffc107;
}

.btn-outline-warning:hover {
  color: #000;
  background-color: #ffc107;
  border-color: #ffc107;
}

.btn-check:focus+.btn-outline-warning,
.btn-outline-warning:focus {
  box-shadow: 0 0 0 0.25rem rgba(255, 193, 7, 0.5);
}

.btn-check:checked+.btn-outline-warning,
.btn-check:active+.btn-outline-warning,
.btn-outline-warning:active,
.btn-outline-warning.active,
.btn-outline-warning.dropdown-toggle.show {
  color: #000;
  background-color: #ffc107;
  border-color: #ffc107;
}

.btn-check:checked+.btn-outline-warning:focus,
.btn-check:active+.btn-outline-warning:focus,
.btn-outline-warning:active:focus,
.btn-outline-warning.active:focus,
.btn-outline-warning.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(255, 193, 7, 0.5);
}

.btn-outline-warning:disabled,
.btn-outline-warning.disabled {
  color: #ffc107;
  background-color: transparent;
}

.btn-outline-danger {
  color: #dc3545;
  border-color: #dc3545;
}

.btn-outline-danger:hover {
  color: #fff;
  background-color: #dc3545;
  border-color: #dc3545;
}

.btn-check:focus+.btn-outline-danger,
.btn-outline-danger:focus {
  box-shadow: 0 0 0 0.25rem rgba(220, 53, 69, 0.5);
}

.btn-check:checked+.btn-outline-danger,
.btn-check:active+.btn-outline-danger,
.btn-outline-danger:active,
.btn-outline-danger.active,
.btn-outline-danger.dropdown-toggle.show {
  color: #fff;
  background-color: #dc3545;
  border-color: #dc3545;
}

.btn-check:checked+.btn-outline-danger:focus,
.btn-check:active+.btn-outline-danger:focus,
.btn-outline-danger:active:focus,
.btn-outline-danger.active:focus,
.btn-outline-danger.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(220, 53, 69, 0.5);
}

.btn-outline-danger:disabled,
.btn-outline-danger.disabled {
  color: #dc3545;
  background-color: transparent;
}

.btn-outline-light {
  color: #f8f9fa;
  border-color: #f8f9fa;
}

.btn-outline-light:hover {
  color: #000;
  background-color: #f8f9fa;
  border-color: #f8f9fa;
}

.btn-check:focus+.btn-outline-light,
.btn-outline-light:focus {
  box-shadow: 0 0 0 0.25rem rgba(248, 249, 250, 0.5);
}

.btn-check:checked+.btn-outline-light,
.btn-check:active+.btn-outline-light,
.btn-outline-light:active,
.btn-outline-light.active,
.btn-outline-light.dropdown-toggle.show {
  color: #000;
  background-color: #f8f9fa;
  border-color: #f8f9fa;
}

.btn-check:checked+.btn-outline-light:focus,
.btn-check:active+.btn-outline-light:focus,
.btn-outline-light:active:focus,
.btn-outline-light.active:focus,
.btn-outline-light.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(248, 249, 250, 0.5);
}

.btn-outline-light:disabled,
.btn-outline-light.disabled {
  color: #f8f9fa;
  background-color: transparent;
}

.btn-outline-dark {
  color: #212529;
  border-color: #212529;
}

.btn-outline-dark:hover {
  color: #fff;
  background-color: #212529;
  border-color: #212529;
}

.btn-check:focus+.btn-outline-dark,
.btn-outline-dark:focus {
  box-shadow: 0 0 0 0.25rem rgba(33, 37, 41, 0.5);
}

.btn-check:checked+.btn-outline-dark,
.btn-check:active+.btn-outline-dark,
.btn-outline-dark:active,
.btn-outline-dark.active,
.btn-outline-dark.dropdown-toggle.show {
  color: #fff;
  background-color: #212529;
  border-color: #212529;
}

.btn-check:checked+.btn-outline-dark:focus,
.btn-check:active+.btn-outline-dark:focus,
.btn-outline-dark:active:focus,
.btn-outline-dark.active:focus,
.btn-outline-dark.dropdown-toggle.show:focus {
  box-shadow: 0 0 0 0.25rem rgba(33, 37, 41, 0.5);
}

.btn-outline-dark:disabled,
.btn-outline-dark.disabled {
  color: #212529;
  background-color: transparent;
}

.btn-link {
  font-weight: 400;
  color: #0d6efd;
  text-decoration: underline;
}

.btn-link:hover {
  color: #0a58ca;
}

.btn-link:disabled,
.btn-link.disabled {
  color: #6c757d;
}

.btn-lg,
.btn-group-lg>.btn {
  padding: 0.5rem 1rem;
  font-size: 1.25rem;
  border-radius: 0.3rem;
}

.btn-sm,
.btn-group-sm>.btn {
  padding: 0.25rem 0.5rem;
  font-size: 0.875rem;
  border-radius: 0.2rem;
}

.fade {
  transition: opacity 0.15s linear;
}

@media (prefers-reduced-motion: reduce) {
  .fade {
    transition: none;
  }
}

.fade:not(.show) {
  opacity: 0;
}

.collapse:not(.show) {
  display: none;
}

.collapsing {
  height: 0;
  overflow: hidden;
  transition: height 0.35s ease;
}

@media (prefers-reduced-motion: reduce) {
  .collapsing {
    transition: none;
  }
}

.dropup,
.dropend,
.dropdown,
.dropstart {
  position: relative;
}

.dropdown-toggle {
  white-space: nowrap;
}

.dropdown-toggle::after {
  display: inline-block;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
  border-top: 0.3em solid;
  border-right: 0.3em solid transparent;
  border-bottom: 0;
  border-left: 0.3em solid transparent;
}

.dropdown-toggle:empty::after {
  margin-left: 0;
}

.dropdown-menu {
  position: absolute;
  z-index: 1000;
  display: none;
  min-width: 10rem;
  padding: 0.5rem 0;
  margin: 0;
  font-size: 1rem;
  color: #212529;
  text-align: left;
  list-style: none;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.15);
  border-radius: 0.25rem;
}

.dropdown-menu[data-bs-popper] {
  top: 100%;
  left: 0;
  margin-top: 0.125rem;
}

.dropdown-menu-start {
  --bs-position: start;
}

.dropdown-menu-start[data-bs-popper] {
  right: auto
    /* rtl:ignore */
  ;
  left: 0
    /* rtl:ignore */
  ;
}

.dropdown-menu-end {
  --bs-position: end;
}

.dropdown-menu-end[data-bs-popper] {
  right: 0
    /* rtl:ignore */
  ;
  left: auto
    /* rtl:ignore */
  ;
}

@media (min-width: 576px) {
  .dropdown-menu-sm-start {
    --bs-position: start;
  }

  .dropdown-menu-sm-start[data-bs-popper] {
    right: auto
      /* rtl:ignore */
    ;
    left: 0
      /* rtl:ignore */
    ;
  }

  .dropdown-menu-sm-end {
    --bs-position: end;
  }

  .dropdown-menu-sm-end[data-bs-popper] {
    right: 0
      /* rtl:ignore */
    ;
    left: auto
      /* rtl:ignore */
    ;
  }
}

@media (min-width: 768px) {
  .dropdown-menu-md-start {
    --bs-position: start;
  }

  .dropdown-menu-md-start[data-bs-popper] {
    right: auto
      /* rtl:ignore */
    ;
    left: 0
      /* rtl:ignore */
    ;
  }

  .dropdown-menu-md-end {
    --bs-position: end;
  }

  .dropdown-menu-md-end[data-bs-popper] {
    right: 0
      /* rtl:ignore */
    ;
    left: auto
      /* rtl:ignore */
    ;
  }
}

@media (min-width: 992px) {
  .dropdown-menu-lg-start {
    --bs-position: start;
  }

  .dropdown-menu-lg-start[data-bs-popper] {
    right: auto
      /* rtl:ignore */
    ;
    left: 0
      /* rtl:ignore */
    ;
  }

  .dropdown-menu-lg-end {
    --bs-position: end;
  }

  .dropdown-menu-lg-end[data-bs-popper] {
    right: 0
      /* rtl:ignore */
    ;
    left: auto
      /* rtl:ignore */
    ;
  }
}

@media (min-width: 1200px) {
  .dropdown-menu-xl-start {
    --bs-position: start;
  }

  .dropdown-menu-xl-start[data-bs-popper] {
    right: auto
      /* rtl:ignore */
    ;
    left: 0
      /* rtl:ignore */
    ;
  }

  .dropdown-menu-xl-end {
    --bs-position: end;
  }

  .dropdown-menu-xl-end[data-bs-popper] {
    right: 0
      /* rtl:ignore */
    ;
    left: auto
      /* rtl:ignore */
    ;
  }
}

@media (min-width: 1400px) {
  .dropdown-menu-xxl-start {
    --bs-position: start;
  }

  .dropdown-menu-xxl-start[data-bs-popper] {
    right: auto
      /* rtl:ignore */
    ;
    left: 0
      /* rtl:ignore */
    ;
  }

  .dropdown-menu-xxl-end {
    --bs-position: end;
  }

  .dropdown-menu-xxl-end[data-bs-popper] {
    right: 0
      /* rtl:ignore */
    ;
    left: auto
      /* rtl:ignore */
    ;
  }
}

.dropup .dropdown-menu[data-bs-popper] {
  top: auto;
  bottom: 100%;
  margin-top: 0;
  margin-bottom: 0.125rem;
}

.dropup .dropdown-toggle::after {
  display: inline-block;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
  border-top: 0;
  border-right: 0.3em solid transparent;
  border-bottom: 0.3em solid;
  border-left: 0.3em solid transparent;
}

.dropup .dropdown-toggle:empty::after {
  margin-left: 0;
}

.dropend .dropdown-menu[data-bs-popper] {
  top: 0;
  right: auto;
  left: 100%;
  margin-top: 0;
  margin-left: 0.125rem;
}

.dropend .dropdown-toggle::after {
  display: inline-block;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
  border-top: 0.3em solid transparent;
  border-right: 0;
  border-bottom: 0.3em solid transparent;
  border-left: 0.3em solid;
}

.dropend .dropdown-toggle:empty::after {
  margin-left: 0;
}

.dropend .dropdown-toggle::after {
  vertical-align: 0;
}

.dropstart .dropdown-menu[data-bs-popper] {
  top: 0;
  right: 100%;
  left: auto;
  margin-top: 0;
  margin-right: 0.125rem;
}

.dropstart .dropdown-toggle::after {
  display: inline-block;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
}

.dropstart .dropdown-toggle::after {
  display: none;
}

.dropstart .dropdown-toggle::before {
  display: inline-block;
  margin-right: 0.255em;
  vertical-align: 0.255em;
  content: "";
  border-top: 0.3em solid transparent;
  border-right: 0.3em solid;
  border-bottom: 0.3em solid transparent;
}

.dropstart .dropdown-toggle:empty::after {
  margin-left: 0;
}

.dropstart .dropdown-toggle::before {
  vertical-align: 0;
}

.dropdown-divider {
  height: 0;
  margin: 0.5rem 0;
  overflow: hidden;
  border-top: 1px solid rgba(0, 0, 0, 0.15);
}

.dropdown-item {
  display: block;
  width: 100%;
  padding: 0.25rem 1rem;
  clear: both;
  font-weight: 400;
  color: #212529;
  text-align: inherit;
  text-decoration: none;
  white-space: nowrap;
  background-color: transparent;
  border: 0;
}

.dropdown-item:hover,
.dropdown-item:focus {
  color: #1e2125;
  background-color: #e9ecef;
}

.dropdown-item.active,
.dropdown-item:active {
  color: #fff;
  text-decoration: none;
  background-color: #0d6efd;
}

.dropdown-item.disabled,
.dropdown-item:disabled {
  color: #adb5bd;
  pointer-events: none;
  background-color: transparent;
}

.dropdown-menu.show {
  display: block;
}

.dropdown-header {
  display: block;
  padding: 0.5rem 1rem;
  margin-bottom: 0;
  font-size: 0.875rem;
  color: #6c757d;
  white-space: nowrap;
}

.dropdown-item-text {
  display: block;
  padding: 0.25rem 1rem;
  color: #212529;
}

.dropdown-menu-dark {
  color: #dee2e6;
  background-color: #343a40;
  border-color: rgba(0, 0, 0, 0.15);
}

.dropdown-menu-dark .dropdown-item {
  color: #dee2e6;
}

.dropdown-menu-dark .dropdown-item:hover,
.dropdown-menu-dark .dropdown-item:focus {
  color: #fff;
  background-color: rgba(255, 255, 255, 0.15);
}

.dropdown-menu-dark .dropdown-item.active,
.dropdown-menu-dark .dropdown-item:active {
  color: #fff;
  background-color: #0d6efd;
}

.dropdown-menu-dark .dropdown-item.disabled,
.dropdown-menu-dark .dropdown-item:disabled {
  color: #adb5bd;
}

.dropdown-menu-dark .dropdown-divider {
  border-color: rgba(0, 0, 0, 0.15);
}

.dropdown-menu-dark .dropdown-item-text {
  color: #dee2e6;
}

.dropdown-menu-dark .dropdown-header {
  color: #adb5bd;
}

.btn-group,
.btn-group-vertical {
  position: relative;
  display: inline-flex;
  vertical-align: middle;
}

.btn-group>.btn,
.btn-group-vertical>.btn {
  position: relative;
  flex: 1 1 auto;
}

.btn-group>.btn-check:checked+.btn,
.btn-group>.btn-check:focus+.btn,
.btn-group>.btn:hover,
.btn-group>.btn:focus,
.btn-group>.btn:active,
.btn-group>.btn.active,
.btn-group-vertical>.btn-check:checked+.btn,
.btn-group-vertical>.btn-check:focus+.btn,
.btn-group-vertical>.btn:hover,
.btn-group-vertical>.btn:focus,
.btn-group-vertical>.btn:active,
.btn-group-vertical>.btn.active {
  z-index: 1;
}

.btn-toolbar {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
}

.btn-toolbar .input-group {
  width: auto;
}

.btn-group>.btn:not(:first-child),
.btn-group>.btn-group:not(:first-child) {
  margin-left: -1px;
}

.btn-group>.btn:not(:last-child):not(.dropdown-toggle),
.btn-group>.btn-group:not(:last-child)>.btn {
  border-top-right-radius: 0;
  border-bottom-right-radius: 0;
}

.btn-group>.btn:nth-child(n+3),
.btn-group> :not(.btn-check)+.btn,
.btn-group>.btn-group:not(:first-child)>.btn {
  border-top-left-radius: 0;
  border-bottom-left-radius: 0;
}

.dropdown-toggle-split {
  padding-right: 0.5625rem;
  padding-left: 0.5625rem;
}

.dropdown-toggle-split::after,
.dropup .dropdown-toggle-split::after,
.dropend .dropdown-toggle-split::after {
  margin-left: 0;
}

.dropstart .dropdown-toggle-split::before {
  margin-right: 0;
}

.btn-sm+.dropdown-toggle-split,
.btn-group-sm>.btn+.dropdown-toggle-split {
  padding-right: 0.375rem;
  padding-left: 0.375rem;
}

.btn-lg+.dropdown-toggle-split,
.btn-group-lg>.btn+.dropdown-toggle-split {
  padding-right: 0.75rem;
  padding-left: 0.75rem;
}

.btn-group-vertical {
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
}

.btn-group-vertical>.btn,
.btn-group-vertical>.btn-group {
  width: 100%;
}

.btn-group-vertical>.btn:not(:first-child),
.btn-group-vertical>.btn-group:not(:first-child) {
  margin-top: -1px;
}

.btn-group-vertical>.btn:not(:last-child):not(.dropdown-toggle),
.btn-group-vertical>.btn-group:not(:last-child)>.btn {
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}

.btn-group-vertical>.btn~.btn,
.btn-group-vertical>.btn-group:not(:first-child)>.btn {
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.nav {
  display: flex;
  flex-wrap: wrap;
  padding-left: 0;
  margin-bottom: 0;
  list-style: none;
}

.nav-link {
  display: block;
  padding: 0.5rem 1rem;
  color: #0d6efd;
  text-decoration: none;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .nav-link {
    transition: none;
  }
}

.nav-link:hover,
.nav-link:focus {
  color: #0a58ca;
}

.nav-link.disabled {
  color: #6c757d;
  pointer-events: none;
  cursor: default;
}

.nav-tabs {
  border-bottom: 1px solid #dee2e6;
}

.nav-tabs .nav-link {
  margin-bottom: -1px;
  background: none;
  border: 1px solid transparent;
  border-top-left-radius: 0.25rem;
  border-top-right-radius: 0.25rem;
}

.nav-tabs .nav-link:hover,
.nav-tabs .nav-link:focus {
  border-color: #e9ecef #e9ecef #dee2e6;
  isolation: isolate;
}

.nav-tabs .nav-link.disabled {
  color: #6c757d;
  background-color: transparent;
  border-color: transparent;
}

.nav-tabs .nav-link.active,
.nav-tabs .nav-item.show .nav-link {
  color: #495057;
  background-color: #fff;
  border-color: #dee2e6 #dee2e6 #fff;
}

.nav-tabs .dropdown-menu {
  margin-top: -1px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.nav-pills .nav-link {
  background: none;
  border: 0;
  border-radius: 0.25rem;
}

.nav-pills .nav-link.active,
.nav-pills .show>.nav-link {
  color: #fff;
  background-color: #0d6efd;
}

.nav-fill>.nav-link,
.nav-fill .nav-item {
  flex: 1 1 auto;
  text-align: center;
}

.nav-justified>.nav-link,
.nav-justified .nav-item {
  flex-basis: 0;
  flex-grow: 1;
  text-align: center;
}

.nav-fill .nav-item .nav-link,
.nav-justified .nav-item .nav-link {
  width: 100%;
}

.tab-content>.tab-pane {
  display: none;
}

.tab-content>.active {
  display: block;
}

.navbar {
  position: relative;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-between;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
}

.navbar>.container,
.navbar>.container-fluid,
.navbar>.container-sm,
.navbar>.container-md,
.navbar>.container-lg,
.navbar>.container-xl,
.navbar>.container-xxl {
  display: flex;
  flex-wrap: inherit;
  align-items: center;
  justify-content: space-between;
}

.navbar-brand {
  padding-top: 0.3125rem;
  padding-bottom: 0.3125rem;
  margin-right: 1rem;
  font-size: 1.25rem;
  text-decoration: none;
  white-space: nowrap;
}

.navbar-nav {
  display: flex;
  flex-direction: column;
  padding-left: 0;
  margin-bottom: 0;
  list-style: none;
}

.navbar-nav .nav-link {
  padding-right: 0;
  padding-left: 0;
}

.navbar-nav .dropdown-menu {
  position: static;
}

.navbar-text {
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
}

.navbar-collapse {
  flex-basis: 100%;
  flex-grow: 1;
  align-items: center;
}

.navbar-toggler {
  padding: 0.25rem 0.75rem;
  font-size: 1.25rem;
  line-height: 1;
  background-color: transparent;
  border: 1px solid transparent;
  border-radius: 0.25rem;
  transition: box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .navbar-toggler {
    transition: none;
  }
}

.navbar-toggler:hover {
  text-decoration: none;
}

.navbar-toggler:focus {
  text-decoration: none;
  outline: 0;
  box-shadow: 0 0 0 0.25rem;
}

.navbar-toggler-icon {
  display: inline-block;
  width: 1.5em;
  height: 1.5em;
  vertical-align: middle;
  background-repeat: no-repeat;
  background-position: center;
  background-size: 100%;
}

.navbar-nav-scroll {
  max-height: var(--bs-scroll-height, 75vh);
  overflow-y: auto;
}

@media (min-width: 576px) {
  .navbar-expand-sm {
    flex-wrap: nowrap;
    justify-content: flex-start;
  }

  .navbar-expand-sm .navbar-nav {
    flex-direction: row;
  }

  .navbar-expand-sm .navbar-nav .dropdown-menu {
    position: absolute;
  }

  .navbar-expand-sm .navbar-nav .nav-link {
    padding-right: 0.5rem;
    padding-left: 0.5rem;
  }

  .navbar-expand-sm .navbar-nav-scroll {
    overflow: visible;
  }

  .navbar-expand-sm .navbar-collapse {
    display: flex !important;
    flex-basis: auto;
  }

  .navbar-expand-sm .navbar-toggler {
    display: none;
  }
}

@media (min-width: 768px) {
  .navbar-expand-md {
    flex-wrap: nowrap;
    justify-content: flex-start;
  }

  .navbar-expand-md .navbar-nav {
    flex-direction: row;
  }

  .navbar-expand-md .navbar-nav .dropdown-menu {
    position: absolute;
  }

  .navbar-expand-md .navbar-nav .nav-link {
    padding-right: 0.5rem;
    padding-left: 0.5rem;
  }

  .navbar-expand-md .navbar-nav-scroll {
    overflow: visible;
  }

  .navbar-expand-md .navbar-collapse {
    display: flex !important;
    flex-basis: auto;
  }

  .navbar-expand-md .navbar-toggler {
    display: none;
  }
}

@media (min-width: 992px) {
  .navbar-expand-lg {
    flex-wrap: nowrap;
    justify-content: flex-start;
  }

  .navbar-expand-lg .navbar-nav {
    flex-direction: row;
  }

  .navbar-expand-lg .navbar-nav .dropdown-menu {
    position: absolute;
  }

  .navbar-expand-lg .navbar-nav .nav-link {
    padding-right: 0.5rem;
    padding-left: 0.5rem;
  }

  .navbar-expand-lg .navbar-nav-scroll {
    overflow: visible;
  }

  .navbar-expand-lg .navbar-collapse {
    display: flex !important;
    flex-basis: auto;
  }

  .navbar-expand-lg .navbar-toggler {
    display: none;
  }
}

@media (min-width: 1200px) {
  .navbar-expand-xl {
    flex-wrap: nowrap;
    justify-content: flex-start;
  }

  .navbar-expand-xl .navbar-nav {
    flex-direction: row;
  }

  .navbar-expand-xl .navbar-nav .dropdown-menu {
    position: absolute;
  }

  .navbar-expand-xl .navbar-nav .nav-link {
    padding-right: 0.5rem;
    padding-left: 0.5rem;
  }

  .navbar-expand-xl .navbar-nav-scroll {
    overflow: visible;
  }

  .navbar-expand-xl .navbar-collapse {
    display: flex !important;
    flex-basis: auto;
  }

  .navbar-expand-xl .navbar-toggler {
    display: none;
  }
}

@media (min-width: 1400px) {
  .navbar-expand-xxl {
    flex-wrap: nowrap;
    justify-content: flex-start;
  }

  .navbar-expand-xxl .navbar-nav {
    flex-direction: row;
  }

  .navbar-expand-xxl .navbar-nav .dropdown-menu {
    position: absolute;
  }

  .navbar-expand-xxl .navbar-nav .nav-link {
    padding-right: 0.5rem;
    padding-left: 0.5rem;
  }

  .navbar-expand-xxl .navbar-nav-scroll {
    overflow: visible;
  }

  .navbar-expand-xxl .navbar-collapse {
    display: flex !important;
    flex-basis: auto;
  }

  .navbar-expand-xxl .navbar-toggler {
    display: none;
  }
}

.navbar-expand {
  flex-wrap: nowrap;
  justify-content: flex-start;
}

.navbar-expand .navbar-nav {
  flex-direction: row;
}

.navbar-expand .navbar-nav .dropdown-menu {
  position: absolute;
}

.navbar-expand .navbar-nav .nav-link {
  padding-right: 0.5rem;
  padding-left: 0.5rem;
}

.navbar-expand .navbar-nav-scroll {
  overflow: visible;
}

.navbar-expand .navbar-collapse {
  display: flex !important;
  flex-basis: auto;
}

.navbar-expand .navbar-toggler {
  display: none;
}

.navbar-light .navbar-brand {
  color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-brand:hover,
.navbar-light .navbar-brand:focus {
  color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-nav .nav-link {
  color: rgba(0, 0, 0, 0.55);
}

.navbar-light .navbar-nav .nav-link:hover,
.navbar-light .navbar-nav .nav-link:focus {
  color: rgba(0, 0, 0, 0.7);
}

.navbar-light .navbar-nav .nav-link.disabled {
  color: rgba(0, 0, 0, 0.3);
}

.navbar-light .navbar-nav .show>.nav-link,
.navbar-light .navbar-nav .nav-link.active {
  color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-toggler {
  color: rgba(0, 0, 0, 0.55);
  border-color: rgba(0, 0, 0, 0.1);
}

.navbar-light .navbar-toggler-icon {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba%280, 0, 0, 0.55%29' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
}

.navbar-light .navbar-text {
  color: rgba(0, 0, 0, 0.55);
}

.navbar-light .navbar-text a,
.navbar-light .navbar-text a:hover,
.navbar-light .navbar-text a:focus {
  color: rgba(0, 0, 0, 0.9);
}

.navbar-dark .navbar-brand {
  color: #fff;
}

.navbar-dark .navbar-brand:hover,
.navbar-dark .navbar-brand:focus {
  color: #fff;
}

.navbar-dark .navbar-nav .nav-link {
  color: rgba(255, 255, 255, 0.55);
}

.navbar-dark .navbar-nav .nav-link:hover,
.navbar-dark .navbar-nav .nav-link:focus {
  color: rgba(255, 255, 255, 0.75);
}

.navbar-dark .navbar-nav .nav-link.disabled {
  color: rgba(255, 255, 255, 0.25);
}

.navbar-dark .navbar-nav .show>.nav-link,
.navbar-dark .navbar-nav .nav-link.active {
  color: #fff;
}

.navbar-dark .navbar-toggler {
  color: rgba(255, 255, 255, 0.55);
  border-color: rgba(255, 255, 255, 0.1);
}

.navbar-dark .navbar-toggler-icon {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba%28255, 255, 255, 0.55%29' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
}

.navbar-dark .navbar-text {
  color: rgba(255, 255, 255, 0.55);
}

.navbar-dark .navbar-text a,
.navbar-dark .navbar-text a:hover,
.navbar-dark .navbar-text a:focus {
  color: #fff;
}

.card {
  position: relative;
  display: flex;
  flex-direction: column;
  min-width: 0;
  word-wrap: break-word;
  background-color: #fff;
  background-clip: border-box;
  border: 1px solid rgba(0, 0, 0, 0.125);
  border-radius: 0.25rem;
}

.card>hr {
  margin-right: 0;
  margin-left: 0;
}

.card>.list-group {
  border-top: inherit;
  border-bottom: inherit;
}

.card>.list-group:first-child {
  border-top-width: 0;
  border-top-left-radius: calc(0.25rem - 1px);
  border-top-right-radius: calc(0.25rem - 1px);
}

.card>.list-group:last-child {
  border-bottom-width: 0;
  border-bottom-right-radius: calc(0.25rem - 1px);
  border-bottom-left-radius: calc(0.25rem - 1px);
}

.card>.card-header+.list-group,
.card>.list-group+.card-footer {
  border-top: 0;
}

.card-body {
  flex: 1 1 auto;
  padding: 1rem 1rem;
}

.card-title {
  margin-bottom: 0.5rem;
}

.card-subtitle {
  margin-top: -0.25rem;
  margin-bottom: 0;
}

.card-text:last-child {
  margin-bottom: 0;
}

.card-link:hover {
  text-decoration: none;
}

.card-link+.card-link {
  margin-left: 1rem;
}

.card-header {
  padding: 0.5rem 1rem;
  margin-bottom: 0;
  background-color: rgba(0, 0, 0, 0.03);
  border-bottom: 1px solid rgba(0, 0, 0, 0.125);
}

.card-header:first-child {
  border-radius: calc(0.25rem - 1px) calc(0.25rem - 1px) 0 0;
}

.card-footer {
  padding: 0.5rem 1rem;
  background-color: rgba(0, 0, 0, 0.03);
  border-top: 1px solid rgba(0, 0, 0, 0.125);
}

.card-footer:last-child {
  border-radius: 0 0 calc(0.25rem - 1px) calc(0.25rem - 1px);
}

.card-header-tabs {
  margin-right: -0.5rem;
  margin-bottom: -0.5rem;
  margin-left: -0.5rem;
  border-bottom: 0;
}

.card-header-pills {
  margin-right: -0.5rem;
  margin-left: -0.5rem;
}

.card-img-overlay {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  padding: 1rem;
  border-radius: calc(0.25rem - 1px);
}

.card-img,
.card-img-top,
.card-img-bottom {
  width: 100%;
}

.card-img,
.card-img-top {
  border-top-left-radius: calc(0.25rem - 1px);
  border-top-right-radius: calc(0.25rem - 1px);
}

.card-img,
.card-img-bottom {
  border-bottom-right-radius: calc(0.25rem - 1px);
  border-bottom-left-radius: calc(0.25rem - 1px);
}

.card-group>.card {
  margin-bottom: 0.75rem;
}

@media (min-width: 576px) {
  .card-group {
    display: flex;
    flex-flow: row wrap;
  }

  .card-group>.card {
    flex: 1 0 0%;
    margin-bottom: 0;
  }

  .card-group>.card+.card {
    margin-left: 0;
    border-left: 0;
  }

  .card-group>.card:not(:last-child) {
    border-top-right-radius: 0;
    border-bottom-right-radius: 0;
  }

  .card-group>.card:not(:last-child) .card-img-top,
  .card-group>.card:not(:last-child) .card-header {
    border-top-right-radius: 0;
  }

  .card-group>.card:not(:last-child) .card-img-bottom,
  .card-group>.card:not(:last-child) .card-footer {
    border-bottom-right-radius: 0;
  }

  .card-group>.card:not(:first-child) {
    border-top-left-radius: 0;
    border-bottom-left-radius: 0;
  }

  .card-group>.card:not(:first-child) .card-img-top,
  .card-group>.card:not(:first-child) .card-header {
    border-top-left-radius: 0;
  }

  .card-group>.card:not(:first-child) .card-img-bottom,
  .card-group>.card:not(:first-child) .card-footer {
    border-bottom-left-radius: 0;
  }
}

.accordion-button {
  position: relative;
  display: flex;
  align-items: center;
  width: 100%;
  padding: 1rem 1.25rem;
  font-size: 1rem;
  color: #212529;
  text-align: left;
  background-color: #fff;
  border: 0;
  border-radius: 0;
  overflow-anchor: none;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out, border-radius 0.15s ease;
}

@media (prefers-reduced-motion: reduce) {
  .accordion-button {
    transition: none;
  }
}

.accordion-button:not(.collapsed) {
  color: #0c63e4;
  background-color: #e7f1ff;
  box-shadow: inset 0 -1px 0 rgba(0, 0, 0, 0.125);
}

.accordion-button:not(.collapsed)::after {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16' fill='%230c63e4'%3e%3cpath fill-rule='evenodd' d='M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z'/%3e%3c/svg%3e");
  transform: rotate(-180deg);
}

.accordion-button::after {
  flex-shrink: 0;
  width: 1.25rem;
  height: 1.25rem;
  margin-left: auto;
  content: "";
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16' fill='%23212529'%3e%3cpath fill-rule='evenodd' d='M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z'/%3e%3c/svg%3e");
  background-repeat: no-repeat;
  background-size: 1.25rem;
  transition: transform 0.2s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .accordion-button::after {
    transition: none;
  }
}

.accordion-button:hover {
  z-index: 2;
}

.accordion-button:focus {
  z-index: 3;
  border-color: #86b7fe;
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.accordion-header {
  margin-bottom: 0;
}

.accordion-item {
  background-color: #fff;
  border: 1px solid rgba(0, 0, 0, 0.125);
}

.accordion-item:first-of-type {
  border-top-left-radius: 0.25rem;
  border-top-right-radius: 0.25rem;
}

.accordion-item:first-of-type .accordion-button {
  border-top-left-radius: calc(0.25rem - 1px);
  border-top-right-radius: calc(0.25rem - 1px);
}

.accordion-item:not(:first-of-type) {
  border-top: 0;
}

.accordion-item:last-of-type {
  border-bottom-right-radius: 0.25rem;
  border-bottom-left-radius: 0.25rem;
}

.accordion-item:last-of-type .accordion-button.collapsed {
  border-bottom-right-radius: calc(0.25rem - 1px);
  border-bottom-left-radius: calc(0.25rem - 1px);
}

.accordion-item:last-of-type .accordion-collapse {
  border-bottom-right-radius: 0.25rem;
  border-bottom-left-radius: 0.25rem;
}

.accordion-body {
  padding: 1rem 1.25rem;
}

.accordion-flush .accordion-collapse {
  border-width: 0;
}

.accordion-flush .accordion-item {
  border-right: 0;
  border-left: 0;
  border-radius: 0;
}

.accordion-flush .accordion-item:first-child {
  border-top: 0;
}

.accordion-flush .accordion-item:last-child {
  border-bottom: 0;
}

.accordion-flush .accordion-item .accordion-button {
  border-radius: 0;
}

.breadcrumb {
  display: flex;
  flex-wrap: wrap;
  padding: 0 0;
  margin-bottom: 1rem;
  list-style: none;
}

.breadcrumb-item+.breadcrumb-item {
  padding-left: 0.5rem;
}

.breadcrumb-item+.breadcrumb-item::before {
  float: left;
  padding-right: 0.5rem;
  color: #6c757d;
  content: var(--bs-breadcrumb-divider, "/")
    /* rtl: var(--bs-breadcrumb-divider, "/") */
  ;
}

.breadcrumb-item.active {
  color: #6c757d;
}

.pagination {
  display: flex;
  padding-left: 0;
  list-style: none;
}

.page-link {
  position: relative;
  display: block;
  color: #0d6efd;
  text-decoration: none;
  background-color: #fff;
  border: 1px solid #dee2e6;
  transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out, border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .page-link {
    transition: none;
  }
}

.page-link:hover {
  z-index: 2;
  color: #0a58ca;
  background-color: #e9ecef;
  border-color: #dee2e6;
}

.page-link:focus {
  z-index: 3;
  color: #0a58ca;
  background-color: #e9ecef;
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
}

.page-item:not(:first-child) .page-link {
  margin-left: -1px;
}

.page-item.active .page-link {
  z-index: 3;
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.page-item.disabled .page-link {
  color: #6c757d;
  pointer-events: none;
  background-color: #fff;
  border-color: #dee2e6;
}

.page-link {
  padding: 0.375rem 0.75rem;
}

.page-item:first-child .page-link {
  border-top-left-radius: 0.25rem;
  border-bottom-left-radius: 0.25rem;
}

.page-item:last-child .page-link {
  border-top-right-radius: 0.25rem;
  border-bottom-right-radius: 0.25rem;
}

.pagination-lg .page-link {
  padding: 0.75rem 1.5rem;
  font-size: 1.25rem;
}

.pagination-lg .page-item:first-child .page-link {
  border-top-left-radius: 0.3rem;
  border-bottom-left-radius: 0.3rem;
}

.pagination-lg .page-item:last-child .page-link {
  border-top-right-radius: 0.3rem;
  border-bottom-right-radius: 0.3rem;
}

.pagination-sm .page-link {
  padding: 0.25rem 0.5rem;
  font-size: 0.875rem;
}

.pagination-sm .page-item:first-child .page-link {
  border-top-left-radius: 0.2rem;
  border-bottom-left-radius: 0.2rem;
}

.pagination-sm .page-item:last-child .page-link {
  border-top-right-radius: 0.2rem;
  border-bottom-right-radius: 0.2rem;
}

.badge {
  display: inline-block;
  padding: 0.35em 0.65em;
  font-size: 0.75em;
  font-weight: 700;
  line-height: 1;
  color: #fff;
  text-align: center;
  white-space: nowrap;
  vertical-align: baseline;
  border-radius: 0.25rem;
}

.badge:empty {
  display: none;
}

.btn .badge {
  position: relative;
  top: -1px;
}

.alert {
  position: relative;
  padding: 1rem 1rem;
  margin-bottom: 1rem;
  border: 1px solid transparent;
  border-radius: 0.25rem;
}

.alert-heading {
  color: inherit;
}

.alert-link {
  font-weight: 700;
}

.alert-dismissible {
  padding-right: 3rem;
}

.alert-dismissible .btn-close {
  position: absolute;
  top: 0;
  right: 0;
  z-index: 2;
  padding: 1.25rem 1rem;
}

.alert-primary {
  color: #084298;
  background-color: #cfe2ff;
  border-color: #b6d4fe;
}

.alert-primary .alert-link {
  color: #06357a;
}

.alert-secondary {
  color: #41464b;
  background-color: #e2e3e5;
  border-color: #d3d6d8;
}

.alert-secondary .alert-link {
  color: #34383c;
}

.alert-success {
  color: #0f5132;
  background-color: #d1e7dd;
  border-color: #badbcc;
}

.alert-success .alert-link {
  color: #0c4128;
}

.alert-info {
  color: #055160;
  background-color: #cff4fc;
  border-color: #b6effb;
}

.alert-info .alert-link {
  color: #04414d;
}

.alert-warning {
  color: #664d03;
  background-color: #fff3cd;
  border-color: #ffecb5;
}

.alert-warning .alert-link {
  color: #523e02;
}

.alert-danger {
  color: #842029;
  background-color: #f8d7da;
  border-color: #f5c2c7;
}

.alert-danger .alert-link {
  color: #6a1a21;
}

.alert-light {
  color: #636464;
  background-color: #fefefe;
  border-color: #fdfdfe;
}

.alert-light .alert-link {
  color: #4f5050;
}

.alert-dark {
  color: #141619;
  background-color: #d3d3d4;
  border-color: #bcbebf;
}

.alert-dark .alert-link {
  color: #101214;
}

@-webkit-keyframes progress-bar-stripes {
  0% {
    background-position-x: 1rem;
  }
}

@keyframes progress-bar-stripes {
  0% {
    background-position-x: 1rem;
  }
}

.progress {
  display: flex;
  height: 1rem;
  overflow: hidden;
  font-size: 0.75rem;
  background-color: #e9ecef;
  border-radius: 0.25rem;
}

.progress-bar {
  display: flex;
  flex-direction: column;
  justify-content: center;
  overflow: hidden;
  color: #fff;
  text-align: center;
  white-space: nowrap;
  background-color: #0d6efd;
  transition: width 0.6s ease;
}

@media (prefers-reduced-motion: reduce) {
  .progress-bar {
    transition: none;
  }
}

.progress-bar-striped {
  background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.15) 50%, rgba(255, 255, 255, 0.15) 75%, transparent 75%, transparent);
  background-size: 1rem 1rem;
}

.progress-bar-animated {
  -webkit-animation: 1s linear infinite progress-bar-stripes;
  animation: 1s linear infinite progress-bar-stripes;
}

@media (prefers-reduced-motion: reduce) {
  .progress-bar-animated {
    -webkit-animation: none;
    animation: none;
  }
}

.list-group {
  display: flex;
  flex-direction: column;
  padding-left: 0;
  margin-bottom: 0;
  border-radius: 0.25rem;
}

.list-group-numbered {
  list-style-type: none;
  counter-reset: section;
}

.list-group-numbered>li::before {
  content: counters(section, ".") ". ";
  counter-increment: section;
}

.list-group-item-action {
  width: 100%;
  color: #495057;
  text-align: inherit;
}

.list-group-item-action:hover,
.list-group-item-action:focus {
  z-index: 1;
  color: #495057;
  text-decoration: none;
  background-color: #f8f9fa;
}

.list-group-item-action:active {
  color: #212529;
  background-color: #e9ecef;
}

.list-group-item {
  position: relative;
  display: block;
  padding: 0.5rem 1rem;
  color: #212529;
  text-decoration: none;
  background-color: #fff;
  border: 1px solid rgba(0, 0, 0, 0.125);
}

.list-group-item:first-child {
  border-top-left-radius: inherit;
  border-top-right-radius: inherit;
}

.list-group-item:last-child {
  border-bottom-right-radius: inherit;
  border-bottom-left-radius: inherit;
}

.list-group-item.disabled,
.list-group-item:disabled {
  color: #6c757d;
  pointer-events: none;
  background-color: #fff;
}

.list-group-item.active {
  z-index: 2;
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}

.list-group-item+.list-group-item {
  border-top-width: 0;
}

.list-group-item+.list-group-item.active {
  margin-top: -1px;
  border-top-width: 1px;
}

.list-group-horizontal {
  flex-direction: row;
}

.list-group-horizontal>.list-group-item:first-child {
  border-bottom-left-radius: 0.25rem;
  border-top-right-radius: 0;
}

.list-group-horizontal>.list-group-item:last-child {
  border-top-right-radius: 0.25rem;
  border-bottom-left-radius: 0;
}

.list-group-horizontal>.list-group-item.active {
  margin-top: 0;
}

.list-group-horizontal>.list-group-item+.list-group-item {
  border-top-width: 1px;
  border-left-width: 0;
}

.list-group-horizontal>.list-group-item+.list-group-item.active {
  margin-left: -1px;
  border-left-width: 1px;
}

@media (min-width: 576px) {
  .list-group-horizontal-sm {
    flex-direction: row;
  }

  .list-group-horizontal-sm>.list-group-item:first-child {
    border-bottom-left-radius: 0.25rem;
    border-top-right-radius: 0;
  }

  .list-group-horizontal-sm>.list-group-item:last-child {
    border-top-right-radius: 0.25rem;
    border-bottom-left-radius: 0;
  }

  .list-group-horizontal-sm>.list-group-item.active {
    margin-top: 0;
  }

  .list-group-horizontal-sm>.list-group-item+.list-group-item {
    border-top-width: 1px;
    border-left-width: 0;
  }

  .list-group-horizontal-sm>.list-group-item+.list-group-item.active {
    margin-left: -1px;
    border-left-width: 1px;
  }
}

@media (min-width: 768px) {
  .list-group-horizontal-md {
    flex-direction: row;
  }

  .list-group-horizontal-md>.list-group-item:first-child {
    border-bottom-left-radius: 0.25rem;
    border-top-right-radius: 0;
  }

  .list-group-horizontal-md>.list-group-item:last-child {
    border-top-right-radius: 0.25rem;
    border-bottom-left-radius: 0;
  }

  .list-group-horizontal-md>.list-group-item.active {
    margin-top: 0;
  }

  .list-group-horizontal-md>.list-group-item+.list-group-item {
    border-top-width: 1px;
    border-left-width: 0;
  }

  .list-group-horizontal-md>.list-group-item+.list-group-item.active {
    margin-left: -1px;
    border-left-width: 1px;
  }
}

@media (min-width: 992px) {
  .list-group-horizontal-lg {
    flex-direction: row;
  }

  .list-group-horizontal-lg>.list-group-item:first-child {
    border-bottom-left-radius: 0.25rem;
    border-top-right-radius: 0;
  }

  .list-group-horizontal-lg>.list-group-item:last-child {
    border-top-right-radius: 0.25rem;
    border-bottom-left-radius: 0;
  }

  .list-group-horizontal-lg>.list-group-item.active {
    margin-top: 0;
  }

  .list-group-horizontal-lg>.list-group-item+.list-group-item {
    border-top-width: 1px;
    border-left-width: 0;
  }

  .list-group-horizontal-lg>.list-group-item+.list-group-item.active {
    margin-left: -1px;
    border-left-width: 1px;
  }
}

@media (min-width: 1200px) {
  .list-group-horizontal-xl {
    flex-direction: row;
  }

  .list-group-horizontal-xl>.list-group-item:first-child {
    border-bottom-left-radius: 0.25rem;
    border-top-right-radius: 0;
  }

  .list-group-horizontal-xl>.list-group-item:last-child {
    border-top-right-radius: 0.25rem;
    border-bottom-left-radius: 0;
  }

  .list-group-horizontal-xl>.list-group-item.active {
    margin-top: 0;
  }

  .list-group-horizontal-xl>.list-group-item+.list-group-item {
    border-top-width: 1px;
    border-left-width: 0;
  }

  .list-group-horizontal-xl>.list-group-item+.list-group-item.active {
    margin-left: -1px;
    border-left-width: 1px;
  }
}

@media (min-width: 1400px) {
  .list-group-horizontal-xxl {
    flex-direction: row;
  }

  .list-group-horizontal-xxl>.list-group-item:first-child {
    border-bottom-left-radius: 0.25rem;
    border-top-right-radius: 0;
  }

  .list-group-horizontal-xxl>.list-group-item:last-child {
    border-top-right-radius: 0.25rem;
    border-bottom-left-radius: 0;
  }

  .list-group-horizontal-xxl>.list-group-item.active {
    margin-top: 0;
  }

  .list-group-horizontal-xxl>.list-group-item+.list-group-item {
    border-top-width: 1px;
    border-left-width: 0;
  }

  .list-group-horizontal-xxl>.list-group-item+.list-group-item.active {
    margin-left: -1px;
    border-left-width: 1px;
  }
}

.list-group-flush {
  border-radius: 0;
}

.list-group-flush>.list-group-item {
  border-width: 0 0 1px;
}

.list-group-flush>.list-group-item:last-child {
  border-bottom-width: 0;
}

.list-group-item-primary {
  color: #084298;
  background-color: #cfe2ff;
}

.list-group-item-primary.list-group-item-action:hover,
.list-group-item-primary.list-group-item-action:focus {
  color: #084298;
  background-color: #bacbe6;
}

.list-group-item-primary.list-group-item-action.active {
  color: #fff;
  background-color: #084298;
  border-color: #084298;
}

.list-group-item-secondary {
  color: #41464b;
  background-color: #e2e3e5;
}

.list-group-item-secondary.list-group-item-action:hover,
.list-group-item-secondary.list-group-item-action:focus {
  color: #41464b;
  background-color: #cbccce;
}

.list-group-item-secondary.list-group-item-action.active {
  color: #fff;
  background-color: #41464b;
  border-color: #41464b;
}

.list-group-item-success {
  color: #0f5132;
  background-color: #d1e7dd;
}

.list-group-item-success.list-group-item-action:hover,
.list-group-item-success.list-group-item-action:focus {
  color: #0f5132;
  background-color: #bcd0c7;
}

.list-group-item-success.list-group-item-action.active {
  color: #fff;
  background-color: #0f5132;
  border-color: #0f5132;
}

.list-group-item-info {
  color: #055160;
  background-color: #cff4fc;
}

.list-group-item-info.list-group-item-action:hover,
.list-group-item-info.list-group-item-action:focus {
  color: #055160;
  background-color: #badce3;
}

.list-group-item-info.list-group-item-action.active {
  color: #fff;
  background-color: #055160;
  border-color: #055160;
}

.list-group-item-warning {
  color: #664d03;
  background-color: #fff3cd;
}

.list-group-item-warning.list-group-item-action:hover,
.list-group-item-warning.list-group-item-action:focus {
  color: #664d03;
  background-color: #e6dbb9;
}

.list-group-item-warning.list-group-item-action.active {
  color: #fff;
  background-color: #664d03;
  border-color: #664d03;
}

.list-group-item-danger {
  color: #842029;
  background-color: #f8d7da;
}

.list-group-item-danger.list-group-item-action:hover,
.list-group-item-danger.list-group-item-action:focus {
  color: #842029;
  background-color: #dfc2c4;
}

.list-group-item-danger.list-group-item-action.active {
  color: #fff;
  background-color: #842029;
  border-color: #842029;
}

.list-group-item-light {
  color: #636464;
  background-color: #fefefe;
}

.list-group-item-light.list-group-item-action:hover,
.list-group-item-light.list-group-item-action:focus {
  color: #636464;
  background-color: #e5e5e5;
}

.list-group-item-light.list-group-item-action.active {
  color: #fff;
  background-color: #636464;
  border-color: #636464;
}

.list-group-item-dark {
  color: #141619;
  background-color: #d3d3d4;
}

.list-group-item-dark.list-group-item-action:hover,
.list-group-item-dark.list-group-item-action:focus {
  color: #141619;
  background-color: #bebebf;
}

.list-group-item-dark.list-group-item-action.active {
  color: #fff;
  background-color: #141619;
  border-color: #141619;
}

.btn-close {
  box-sizing: content-box;
  width: 1em;
  height: 1em;
  padding: 0.25em 0.25em;
  color: #000;
  background: transparent url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16' fill='%23000'%3e%3cpath d='M.293.293a1 1 0 011.414 0L8 6.586 14.293.293a1 1 0 111.414 1.414L9.414 8l6.293 6.293a1 1 0 01-1.414 1.414L8 9.414l-6.293 6.293a1 1 0 01-1.414-1.414L6.586 8 .293 1.707a1 1 0 010-1.414z'/%3e%3c/svg%3e") center/1em auto no-repeat;
  border: 0;
  border-radius: 0.25rem;
  opacity: 0.5;
}

.btn-close:hover {
  color: #000;
  text-decoration: none;
  opacity: 0.75;
}

.btn-close:focus {
  outline: 0;
  box-shadow: 0 0 0 0.25rem rgba(13, 110, 253, 0.25);
  opacity: 1;
}

.btn-close:disabled,
.btn-close.disabled {
  pointer-events: none;
  -webkit-user-select: none;
  -moz-user-select: none;
  user-select: none;
  opacity: 0.25;
}

.btn-close-white {
  filter: invert(1) grayscale(100%) brightness(200%);
}

.toast {
  width: 350px;
  max-width: 100%;
  font-size: 0.875rem;
  pointer-events: auto;
  background-color: rgba(255, 255, 255, 0.85);
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.1);
  box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
  border-radius: 0.25rem;
}

.toast:not(.showing):not(.show) {
  opacity: 0;
}

.toast.hide {
  display: none;
}

.toast-container {
  width: -webkit-max-content;
  width: -moz-max-content;
  width: max-content;
  max-width: 100%;
  pointer-events: none;
}

.toast-container> :not(:last-child) {
  margin-bottom: 0.75rem;
}

.toast-header {
  display: flex;
  align-items: center;
  padding: 0.5rem 0.75rem;
  color: #6c757d;
  background-color: rgba(255, 255, 255, 0.85);
  background-clip: padding-box;
  border-bottom: 1px solid rgba(0, 0, 0, 0.05);
  border-top-left-radius: calc(0.25rem - 1px);
  border-top-right-radius: calc(0.25rem - 1px);
}

.toast-header .btn-close {
  margin-right: -0.375rem;
  margin-left: 0.75rem;
}

.toast-body {
  padding: 0.75rem;
  word-wrap: break-word;
}

.modal {
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1060;
  display: none;
  width: 100%;
  height: 100%;
  overflow-x: hidden;
  overflow-y: auto;
  outline: 0;
}

.modal-dialog {
  position: relative;
  width: auto;
  margin: 0.5rem;
  pointer-events: none;
}

.modal.fade .modal-dialog {
  transition: transform 0.3s ease-out;
  transform: translate(0, -50px);
}

@media (prefers-reduced-motion: reduce) {
  .modal.fade .modal-dialog {
    transition: none;
  }
}

.modal.show .modal-dialog {
  transform: none;
}

.modal.modal-static .modal-dialog {
  transform: scale(1.02);
}

.modal-dialog-scrollable {
  height: calc(100% - 1rem);
}

.modal-dialog-scrollable .modal-content {
  max-height: 100%;
  overflow: hidden;
}

.modal-dialog-scrollable .modal-body {
  overflow-y: auto;
}

.modal-dialog-centered {
  display: flex;
  align-items: center;
  min-height: calc(100% - 1rem);
}

.modal-content {
  position: relative;
  display: flex;
  flex-direction: column;
  width: 100%;
  pointer-events: auto;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 0.3rem;
  outline: 0;
}

.modal-backdrop {
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1040;
  width: 100vw;
  height: 100vh;
  background-color: #000;
}

.modal-backdrop.fade {
  opacity: 0;
}

.modal-backdrop.show {
  opacity: 0.5;
}

.modal-header {
  display: flex;
  flex-shrink: 0;
  align-items: center;
  justify-content: space-between;
  padding: 1rem 1rem;
  border-bottom: 1px solid #dee2e6;
  border-top-left-radius: calc(0.3rem - 1px);
  border-top-right-radius: calc(0.3rem - 1px);
}

.modal-header .btn-close {
  padding: 0.5rem 0.5rem;
  margin: -0.5rem -0.5rem -0.5rem auto;
}

.modal-title {
  margin-bottom: 0;
  line-height: 1.5;
}

.modal-body {
  position: relative;
  flex: 1 1 auto;
  padding: 1rem;
}

.modal-footer {
  display: flex;
  flex-wrap: wrap;
  flex-shrink: 0;
  align-items: center;
  justify-content: flex-end;
  padding: 0.75rem;
  border-top: 1px solid #dee2e6;
  border-bottom-right-radius: calc(0.3rem - 1px);
  border-bottom-left-radius: calc(0.3rem - 1px);
}

.modal-footer>* {
  margin: 0.25rem;
}

@media (min-width: 576px) {
  .modal-dialog {
    max-width: 500px;
    margin: 1.75rem auto;
  }

  .modal-dialog-scrollable {
    height: calc(100% - 3.5rem);
  }

  .modal-dialog-centered {
    min-height: calc(100% - 3.5rem);
  }

  .modal-sm {
    max-width: 300px;
  }
}

@media (min-width: 992px) {

  .modal-lg,
  .modal-xl {
    max-width: 800px;
  }
}

@media (min-width: 1200px) {
  .modal-xl {
    max-width: 1140px;
  }
}

.modal-fullscreen {
  width: 100vw;
  max-width: none;
  height: 100%;
  margin: 0;
}

.modal-fullscreen .modal-content {
  height: 100%;
  border: 0;
  border-radius: 0;
}

.modal-fullscreen .modal-header {
  border-radius: 0;
}

.modal-fullscreen .modal-body {
  overflow-y: auto;
}

.modal-fullscreen .modal-footer {
  border-radius: 0;
}

@media (max-width: 575.98px) {
  .modal-fullscreen-sm-down {
    width: 100vw;
    max-width: none;
    height: 100%;
    margin: 0;
  }

  .modal-fullscreen-sm-down .modal-content {
    height: 100%;
    border: 0;
    border-radius: 0;
  }

  .modal-fullscreen-sm-down .modal-header {
    border-radius: 0;
  }

  .modal-fullscreen-sm-down .modal-body {
    overflow-y: auto;
  }

  .modal-fullscreen-sm-down .modal-footer {
    border-radius: 0;
  }
}

@media (max-width: 767.98px) {
  .modal-fullscreen-md-down {
    width: 100vw;
    max-width: none;
    height: 100%;
    margin: 0;
  }

  .modal-fullscreen-md-down .modal-content {
    height: 100%;
    border: 0;
    border-radius: 0;
  }

  .modal-fullscreen-md-down .modal-header {
    border-radius: 0;
  }

  .modal-fullscreen-md-down .modal-body {
    overflow-y: auto;
  }

  .modal-fullscreen-md-down .modal-footer {
    border-radius: 0;
  }
}

@media (max-width: 991.98px) {
  .modal-fullscreen-lg-down {
    width: 100vw;
    max-width: none;
    height: 100%;
    margin: 0;
  }

  .modal-fullscreen-lg-down .modal-content {
    height: 100%;
    border: 0;
    border-radius: 0;
  }

  .modal-fullscreen-lg-down .modal-header {
    border-radius: 0;
  }

  .modal-fullscreen-lg-down .modal-body {
    overflow-y: auto;
  }

  .modal-fullscreen-lg-down .modal-footer {
    border-radius: 0;
  }
}

@media (max-width: 1199.98px) {
  .modal-fullscreen-xl-down {
    width: 100vw;
    max-width: none;
    height: 100%;
    margin: 0;
  }

  .modal-fullscreen-xl-down .modal-content {
    height: 100%;
    border: 0;
    border-radius: 0;
  }

  .modal-fullscreen-xl-down .modal-header {
    border-radius: 0;
  }

  .modal-fullscreen-xl-down .modal-body {
    overflow-y: auto;
  }

  .modal-fullscreen-xl-down .modal-footer {
    border-radius: 0;
  }
}

@media (max-width: 1399.98px) {
  .modal-fullscreen-xxl-down {
    width: 100vw;
    max-width: none;
    height: 100%;
    margin: 0;
  }

  .modal-fullscreen-xxl-down .modal-content {
    height: 100%;
    border: 0;
    border-radius: 0;
  }

  .modal-fullscreen-xxl-down .modal-header {
    border-radius: 0;
  }

  .modal-fullscreen-xxl-down .modal-body {
    overflow-y: auto;
  }

  .modal-fullscreen-xxl-down .modal-footer {
    border-radius: 0;
  }
}

.tooltip {
  position: absolute;
  z-index: 1080;
  display: block;
  margin: 0;
  font-family: var(--bs-font-sans-serif);
  font-style: normal;
  font-weight: 400;
  line-height: 1.5;
  text-align: left;
  text-align: start;
  text-decoration: none;
  text-shadow: none;
  text-transform: none;
  letter-spacing: normal;
  word-break: normal;
  word-spacing: normal;
  white-space: normal;
  line-break: auto;
  font-size: 0.875rem;
  word-wrap: break-word;
  opacity: 0;
}

.tooltip.show {
  opacity: 0.9;
}

.tooltip .tooltip-arrow {
  position: absolute;
  display: block;
  width: 0.8rem;
  height: 0.4rem;
}

.tooltip .tooltip-arrow::before {
  position: absolute;
  content: "";
  border-color: transparent;
  border-style: solid;
}

.bs-tooltip-top,
.bs-tooltip-auto[data-popper-placement^=top] {
  padding: 0.4rem 0;
}

.bs-tooltip-top .tooltip-arrow,
.bs-tooltip-auto[data-popper-placement^=top] .tooltip-arrow {
  bottom: 0;
}

.bs-tooltip-top .tooltip-arrow::before,
.bs-tooltip-auto[data-popper-placement^=top] .tooltip-arrow::before {
  top: -1px;
  border-width: 0.4rem 0.4rem 0;
  border-top-color: #000;
}

.bs-tooltip-end,
.bs-tooltip-auto[data-popper-placement^=right] {
  padding: 0 0.4rem;
}

.bs-tooltip-end .tooltip-arrow,
.bs-tooltip-auto[data-popper-placement^=right] .tooltip-arrow {
  left: 0;
  width: 0.4rem;
  height: 0.8rem;
}

.bs-tooltip-end .tooltip-arrow::before,
.bs-tooltip-auto[data-popper-placement^=right] .tooltip-arrow::before {
  right: -1px;
  border-width: 0.4rem 0.4rem 0.4rem 0;
  border-right-color: #000;
}

.bs-tooltip-bottom,
.bs-tooltip-auto[data-popper-placement^=bottom] {
  padding: 0.4rem 0;
}

.bs-tooltip-bottom .tooltip-arrow,
.bs-tooltip-auto[data-popper-placement^=bottom] .tooltip-arrow {
  top: 0;
}

.bs-tooltip-bottom .tooltip-arrow::before,
.bs-tooltip-auto[data-popper-placement^=bottom] .tooltip-arrow::before {
  bottom: -1px;
  border-width: 0 0.4rem 0.4rem;
  border-bottom-color: #000;
}

.bs-tooltip-start,
.bs-tooltip-auto[data-popper-placement^=left] {
  padding: 0 0.4rem;
}

.bs-tooltip-start .tooltip-arrow,
.bs-tooltip-auto[data-popper-placement^=left] .tooltip-arrow {
  right: 0;
  width: 0.4rem;
  height: 0.8rem;
}

.bs-tooltip-start .tooltip-arrow::before,
.bs-tooltip-auto[data-popper-placement^=left] .tooltip-arrow::before {
  left: -1px;
  border-width: 0.4rem 0 0.4rem 0.4rem;
  border-left-color: #000;
}

.tooltip-inner {
  max-width: 200px;
  padding: 0.25rem 0.5rem;
  color: #fff;
  text-align: center;
  background-color: #000;
  border-radius: 0.25rem;
}

.popover {
  position: absolute;
  top: 0;
  left: 0
    /* rtl:ignore */
  ;
  z-index: 1070;
  display: block;
  max-width: 276px;
  font-family: var(--bs-font-sans-serif);
  font-style: normal;
  font-weight: 400;
  line-height: 1.5;
  text-align: left;
  text-align: start;
  text-decoration: none;
  text-shadow: none;
  text-transform: none;
  letter-spacing: normal;
  word-break: normal;
  word-spacing: normal;
  white-space: normal;
  line-break: auto;
  font-size: 0.875rem;
  word-wrap: break-word;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 0.3rem;
}

.popover .popover-arrow {
  position: absolute;
  display: block;
  width: 1rem;
  height: 0.5rem;
}

.popover .popover-arrow::before,
.popover .popover-arrow::after {
  position: absolute;
  display: block;
  content: "";
  border-color: transparent;
  border-style: solid;
}

.bs-popover-top>.popover-arrow,
.bs-popover-auto[data-popper-placement^=top]>.popover-arrow {
  bottom: calc(-0.5rem - 1px);
}

.bs-popover-top>.popover-arrow::before,
.bs-popover-auto[data-popper-placement^=top]>.popover-arrow::before {
  bottom: 0;
  border-width: 0.5rem 0.5rem 0;
  border-top-color: rgba(0, 0, 0, 0.25);
}

.bs-popover-top>.popover-arrow::after,
.bs-popover-auto[data-popper-placement^=top]>.popover-arrow::after {
  bottom: 1px;
  border-width: 0.5rem 0.5rem 0;
  border-top-color: #fff;
}

.bs-popover-end>.popover-arrow,
.bs-popover-auto[data-popper-placement^=right]>.popover-arrow {
  left: calc(-0.5rem - 1px);
  width: 0.5rem;
  height: 1rem;
}

.bs-popover-end>.popover-arrow::before,
.bs-popover-auto[data-popper-placement^=right]>.popover-arrow::before {
  left: 0;
  border-width: 0.5rem 0.5rem 0.5rem 0;
  border-right-color: rgba(0, 0, 0, 0.25);
}

.bs-popover-end>.popover-arrow::after,
.bs-popover-auto[data-popper-placement^=right]>.popover-arrow::after {
  left: 1px;
  border-width: 0.5rem 0.5rem 0.5rem 0;
  border-right-color: #fff;
}

.bs-popover-bottom>.popover-arrow,
.bs-popover-auto[data-popper-placement^=bottom]>.popover-arrow {
  top: calc(-0.5rem - 1px);
}

.bs-popover-bottom>.popover-arrow::before,
.bs-popover-auto[data-popper-placement^=bottom]>.popover-arrow::before {
  top: 0;
  border-width: 0 0.5rem 0.5rem 0.5rem;
  border-bottom-color: rgba(0, 0, 0, 0.25);
}

.bs-popover-bottom>.popover-arrow::after,
.bs-popover-auto[data-popper-placement^=bottom]>.popover-arrow::after {
  top: 1px;
  border-width: 0 0.5rem 0.5rem 0.5rem;
  border-bottom-color: #fff;
}

.bs-popover-bottom .popover-header::before,
.bs-popover-auto[data-popper-placement^=bottom] .popover-header::before {
  position: absolute;
  top: 0;
  left: 50%;
  display: block;
  width: 1rem;
  margin-left: -0.5rem;
  content: "";
  border-bottom: 1px solid #f0f0f0;
}

.bs-popover-start>.popover-arrow,
.bs-popover-auto[data-popper-placement^=left]>.popover-arrow {
  right: calc(-0.5rem - 1px);
  width: 0.5rem;
  height: 1rem;
}

.bs-popover-start>.popover-arrow::before,
.bs-popover-auto[data-popper-placement^=left]>.popover-arrow::before {
  right: 0;
  border-width: 0.5rem 0 0.5rem 0.5rem;
  border-left-color: rgba(0, 0, 0, 0.25);
}

.bs-popover-start>.popover-arrow::after,
.bs-popover-auto[data-popper-placement^=left]>.popover-arrow::after {
  right: 1px;
  border-width: 0.5rem 0 0.5rem 0.5rem;
  border-left-color: #fff;
}

.popover-header {
  padding: 0.5rem 1rem;
  margin-bottom: 0;
  font-size: 1rem;
  background-color: #f0f0f0;
  border-bottom: 1px solid #d8d8d8;
  border-top-left-radius: calc(0.3rem - 1px);
  border-top-right-radius: calc(0.3rem - 1px);
}

.popover-header:empty {
  display: none;
}

.popover-body {
  padding: 1rem 1rem;
  color: #212529;
}

.carousel {
  position: relative;
}

.carousel.pointer-event {
  touch-action: pan-y;
}

.carousel-inner {
  position: relative;
  width: 100%;
  overflow: hidden;
}

.carousel-inner::after {
  display: block;
  clear: both;
  content: "";
}

.carousel-item {
  position: relative;
  display: none;
  float: left;
  width: 100%;
  margin-right: -100%;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  transition: transform 0.6s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .carousel-item {
    transition: none;
  }
}

.carousel-item.active,
.carousel-item-next,
.carousel-item-prev {
  display: block;
}

/* rtl:begin:ignore */
.carousel-item-next:not(.carousel-item-start),
.active.carousel-item-end {
  transform: translateX(100%);
}

.carousel-item-prev:not(.carousel-item-end),
.active.carousel-item-start {
  transform: translateX(-100%);
}

/* rtl:end:ignore */
.carousel-fade .carousel-item {
  opacity: 0;
  transition-property: opacity;
  transform: none;
}

.carousel-fade .carousel-item.active,
.carousel-fade .carousel-item-next.carousel-item-start,
.carousel-fade .carousel-item-prev.carousel-item-end {
  z-index: 1;
  opacity: 1;
}

.carousel-fade .active.carousel-item-start,
.carousel-fade .active.carousel-item-end {
  z-index: 0;
  opacity: 0;
  transition: opacity 0s 0.6s;
}

@media (prefers-reduced-motion: reduce) {

  .carousel-fade .active.carousel-item-start,
  .carousel-fade .active.carousel-item-end {
    transition: none;
  }
}

.carousel-control-prev,
.carousel-control-next {
  position: absolute;
  top: 0;
  bottom: 0;
  z-index: 1;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 15%;
  padding: 0;
  color: #fff;
  text-align: center;
  background: none;
  border: 0;
  opacity: 0.5;
  transition: opacity 0.15s ease;
}

@media (prefers-reduced-motion: reduce) {

  .carousel-control-prev,
  .carousel-control-next {
    transition: none;
  }
}

.carousel-control-prev:hover,
.carousel-control-prev:focus,
.carousel-control-next:hover,
.carousel-control-next:focus {
  color: #fff;
  text-decoration: none;
  outline: 0;
  opacity: 0.9;
}

.carousel-control-prev {
  left: 0;
}

.carousel-control-next {
  right: 0;
}

.carousel-control-prev-icon,
.carousel-control-next-icon {
  display: inline-block;
  width: 2rem;
  height: 2rem;
  background-repeat: no-repeat;
  background-position: 50%;
  background-size: 100% 100%;
}

/* rtl:options: {
  "autoRename": true,
  "stringMap":[ {
    "name"    : "prev-next",
    "search"  : "prev",
    "replace" : "next"
  } ]
} */
.carousel-control-prev-icon {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16' fill='%23fff'%3e%3cpath d='M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z'/%3e%3c/svg%3e");
}

.carousel-control-next-icon {
  background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16' fill='%23fff'%3e%3cpath d='M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z'/%3e%3c/svg%3e");
}

.carousel-indicators {
  position: absolute;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 2;
  display: flex;
  justify-content: center;
  padding: 0;
  margin-right: 15%;
  margin-bottom: 1rem;
  margin-left: 15%;
  list-style: none;
}

.carousel-indicators [data-bs-target] {
  box-sizing: content-box;
  flex: 0 1 auto;
  width: 30px;
  height: 3px;
  padding: 0;
  margin-right: 3px;
  margin-left: 3px;
  text-indent: -999px;
  cursor: pointer;
  background-color: #fff;
  background-clip: padding-box;
  border: 0;
  border-top: 10px solid transparent;
  border-bottom: 10px solid transparent;
  opacity: 0.5;
  transition: opacity 0.6s ease;
}

@media (prefers-reduced-motion: reduce) {
  .carousel-indicators [data-bs-target] {
    transition: none;
  }
}

.carousel-indicators .active {
  opacity: 1;
}

.carousel-caption {
  position: absolute;
  right: 15%;
  bottom: 1.25rem;
  left: 15%;
  padding-top: 1.25rem;
  padding-bottom: 1.25rem;
  color: #fff;
  text-align: center;
}

.carousel-dark .carousel-control-prev-icon,
.carousel-dark .carousel-control-next-icon {
  filter: invert(1) grayscale(100);
}

.carousel-dark .carousel-indicators [data-bs-target] {
  background-color: #000;
}

.carousel-dark .carousel-caption {
  color: #000;
}

@-webkit-keyframes spinner-border {
  to {
    transform: rotate(360deg)
      /* rtl:ignore */
    ;
  }
}

@keyframes spinner-border {
  to {
    transform: rotate(360deg)
      /* rtl:ignore */
    ;
  }
}

.spinner-border {
  display: inline-block;
  width: 2rem;
  height: 2rem;
  vertical-align: -0.125em;
  border: 0.25em solid currentColor;
  border-right-color: transparent;
  border-radius: 50%;
  -webkit-animation: 0.75s linear infinite spinner-border;
  animation: 0.75s linear infinite spinner-border;
}

.spinner-border-sm {
  width: 1rem;
  height: 1rem;
  border-width: 0.2em;
}

@-webkit-keyframes spinner-grow {
  0% {
    transform: scale(0);
  }

  50% {
    opacity: 1;
    transform: none;
  }
}

@keyframes spinner-grow {
  0% {
    transform: scale(0);
  }

  50% {
    opacity: 1;
    transform: none;
  }
}

.spinner-grow {
  display: inline-block;
  width: 2rem;
  height: 2rem;
  vertical-align: -0.125em;
  background-color: currentColor;
  border-radius: 50%;
  opacity: 0;
  -webkit-animation: 0.75s linear infinite spinner-grow;
  animation: 0.75s linear infinite spinner-grow;
}

.spinner-grow-sm {
  width: 1rem;
  height: 1rem;
}

@media (prefers-reduced-motion: reduce) {

  .spinner-border,
  .spinner-grow {
    -webkit-animation-duration: 1.5s;
    animation-duration: 1.5s;
  }
}

.offcanvas {
  position: fixed;
  bottom: 0;
  z-index: 1050;
  display: flex;
  flex-direction: column;
  max-width: 100%;
  visibility: hidden;
  background-color: #fff;
  background-clip: padding-box;
  outline: 0;
  transition: transform 0.3s ease-in-out;
}

@media (prefers-reduced-motion: reduce) {
  .offcanvas {
    transition: none;
  }
}

.offcanvas-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 1rem 1rem;
}

.offcanvas-header .btn-close {
  padding: 0.5rem 0.5rem;
  margin: -0.5rem -0.5rem -0.5rem auto;
}

.offcanvas-title {
  margin-bottom: 0;
  line-height: 1.5;
}

.offcanvas-body {
  flex-grow: 1;
  padding: 1rem 1rem;
  overflow-y: auto;
}

.offcanvas-start {
  top: 0;
  left: 0;
  width: 400px;
  border-right: 1px solid rgba(0, 0, 0, 0.2);
  transform: translateX(-100%);
}

.offcanvas-end {
  top: 0;
  right: 0;
  width: 400px;
  border-left: 1px solid rgba(0, 0, 0, 0.2);
  transform: translateX(100%);
}

.offcanvas-top {
  top: 0;
  right: 0;
  left: 0;
  height: 30vh;
  max-height: 100%;
  border-bottom: 1px solid rgba(0, 0, 0, 0.2);
  transform: translateY(-100%);
}

.offcanvas-bottom {
  right: 0;
  left: 0;
  height: 30vh;
  max-height: 100%;
  border-top: 1px solid rgba(0, 0, 0, 0.2);
  transform: translateY(100%);
}

.offcanvas.show {
  transform: none;
}

.clearfix::after {
  display: block;
  clear: both;
  content: "";
}

.link-primary {
  color: #0d6efd;
}

.link-primary:hover,
.link-primary:focus {
  color: #0a58ca;
}

.link-secondary {
  color: #6c757d;
}

.link-secondary:hover,
.link-secondary:focus {
  color: #565e64;
}

.link-success {
  color: #198754;
}

.link-success:hover,
.link-success:focus {
  color: #146c43;
}

.link-info {
  color: #0dcaf0;
}

.link-info:hover,
.link-info:focus {
  color: #3dd5f3;
}

.link-warning {
  color: #ffc107;
}

.link-warning:hover,
.link-warning:focus {
  color: #ffcd39;
}

.link-danger {
  color: #dc3545;
}

.link-danger:hover,
.link-danger:focus {
  color: #b02a37;
}

.link-light {
  color: #f8f9fa;
}

.link-light:hover,
.link-light:focus {
  color: #f9fafb;
}

.link-dark {
  color: #212529;
}

.link-dark:hover,
.link-dark:focus {
  color: #1a1e21;
}

.ratio {
  position: relative;
  width: 100%;
}

.ratio::before {
  display: block;
  padding-top: var(--bs-aspect-ratio);
  content: "";
}

.ratio>* {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}

.ratio-1x1 {
  --bs-aspect-ratio: 100%;
}

.ratio-4x3 {
  --bs-aspect-ratio: calc(3 / 4 * 100%);
}

.ratio-16x9 {
  --bs-aspect-ratio: calc(9 / 16 * 100%);
}

.ratio-21x9 {
  --bs-aspect-ratio: calc(9 / 21 * 100%);
}

.fixed-top {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  z-index: 1030;
}

.fixed-bottom {
  position: fixed;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1030;
}

.sticky-top {
  position: -webkit-sticky;
  position: sticky;
  top: 0;
  z-index: 1020;
}

@media (min-width: 576px) {
  .sticky-sm-top {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    z-index: 1020;
  }
}

@media (min-width: 768px) {
  .sticky-md-top {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    z-index: 1020;
  }
}

@media (min-width: 992px) {
  .sticky-lg-top {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    z-index: 1020;
  }
}

@media (min-width: 1200px) {
  .sticky-xl-top {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    z-index: 1020;
  }
}

@media (min-width: 1400px) {
  .sticky-xxl-top {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    z-index: 1020;
  }
}

.visually-hidden,
.visually-hidden-focusable:not(:focus):not(:focus-within) {
  position: absolute !important;
  width: 1px !important;
  height: 1px !important;
  padding: 0 !important;
  margin: -1px !important;
  overflow: hidden !important;
  clip: rect(0, 0, 0, 0) !important;
  white-space: nowrap !important;
  border: 0 !important;
}

.stretched-link::after {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1;
  content: "";
}

.text-truncate {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.align-baseline {
  vertical-align: baseline !important;
}

.align-top {
  vertical-align: top !important;
}

.align-middle {
  vertical-align: middle !important;
}

.align-bottom {
  vertical-align: bottom !important;
}

.align-text-bottom {
  vertical-align: text-bottom !important;
}

.align-text-top {
  vertical-align: text-top !important;
}

.float-start {
  float: left !important;
}

.float-end {
  float: right !important;
}

.float-none {
  float: none !important;
}

.overflow-auto {
  overflow: auto !important;
}

.overflow-hidden {
  overflow: hidden !important;
}

.overflow-visible {
  overflow: visible !important;
}

.overflow-scroll {
  overflow: scroll !important;
}

.d-inline {
  display: inline !important;
}

.d-inline-block {
  display: inline-block !important;
}

.d-block {
  display: block !important;
}

.d-grid {
  display: grid !important;
}

.d-table {
  display: table !important;
}

.d-table-row {
  display: table-row !important;
}

.d-table-cell {
  display: table-cell !important;
}

.d-flex {
  display: flex !important;
}

.d-inline-flex {
  display: inline-flex !important;
}

.d-none {
  display: none !important;
}

.shadow {
  box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15) !important;
}

.shadow-sm {
  box-shadow: 0 0.125rem 0.25rem rgba(0, 0, 0, 0.075) !important;
}

.shadow-lg {
  box-shadow: 0 1rem 3rem rgba(0, 0, 0, 0.175) !important;
}

.shadow-none {
  box-shadow: none !important;
}

.position-static {
  position: static !important;
}

.position-relative {
  position: relative !important;
}

.position-absolute {
  position: absolute !important;
}

.position-fixed {
  position: fixed !important;
}

.position-sticky {
  position: -webkit-sticky !important;
  position: sticky !important;
}

.top-0 {
  top: 0 !important;
}

.top-50 {
  top: 50% !important;
}

.top-100 {
  top: 100% !important;
}

.bottom-0 {
  bottom: 0 !important;
}

.bottom-50 {
  bottom: 50% !important;
}

.bottom-100 {
  bottom: 100% !important;
}

.start-0 {
  left: 0 !important;
}

.start-50 {
  left: 50% !important;
}

.start-100 {
  left: 100% !important;
}

.end-0 {
  right: 0 !important;
}

.end-50 {
  right: 50% !important;
}

.end-100 {
  right: 100% !important;
}

.translate-middle {
  transform: translate(-50%, -50%) !important;
}

.translate-middle-x {
  transform: translateX(-50%) !important;
}

.translate-middle-y {
  transform: translateY(-50%) !important;
}

.border {
  border: 1px solid #dee2e6 !important;
}

.border-0 {
  border: 0 !important;
}

.border-top {
  border-top: 1px solid #dee2e6 !important;
}

.border-top-0 {
  border-top: 0 !important;
}

.border-end {
  border-right: 1px solid #dee2e6 !important;
}

.border-end-0 {
  border-right: 0 !important;
}

.border-bottom {
  border-bottom: 1px solid #dee2e6 !important;
}

.border-bottom-0 {
  border-bottom: 0 !important;
}

.border-start {
  border-left: 1px solid #dee2e6 !important;
}

.border-start-0 {
  border-left: 0 !important;
}

.border-primary {
  border-color: #0d6efd !important;
}

.border-secondary {
  border-color: #6c757d !important;
}

.border-success {
  border-color: #198754 !important;
}

.border-info {
  border-color: #0dcaf0 !important;
}

.border-warning {
  border-color: #ffc107 !important;
}

.border-danger {
  border-color: #dc3545 !important;
}

.border-light {
  border-color: #f8f9fa !important;
}

.border-dark {
  border-color: #212529 !important;
}

.border-white {
  border-color: #fff !important;
}

.border-1 {
  border-width: 1px !important;
}

.border-2 {
  border-width: 2px !important;
}

.border-3 {
  border-width: 3px !important;
}

.border-4 {
  border-width: 4px !important;
}

.border-5 {
  border-width: 5px !important;
}

.w-25 {
  width: 25% !important;
}

.w-50 {
  width: 50% !important;
}

.w-75 {
  width: 75% !important;
}

.w-100 {
  width: 100% !important;
}

.w-auto {
  width: auto !important;
}

.mw-100 {
  max-width: 100% !important;
}

.vw-100 {
  width: 100vw !important;
}

.min-vw-100 {
  min-width: 100vw !important;
}

.h-25 {
  height: 25% !important;
}

.h-50 {
  height: 50% !important;
}

.h-75 {
  height: 75% !important;
}

.h-100 {
  height: 100% !important;
}

.h-auto {
  height: auto !important;
}

.mh-100 {
  max-height: 100% !important;
}

.vh-100 {
  height: 100vh !important;
}

.min-vh-100 {
  min-height: 100vh !important;
}

.flex-fill {
  flex: 1 1 auto !important;
}

.flex-row {
  flex-direction: row !important;
}

.flex-column {
  flex-direction: column !important;
}

.flex-row-reverse {
  flex-direction: row-reverse !important;
}

.flex-column-reverse {
  flex-direction: column-reverse !important;
}

.flex-grow-0 {
  flex-grow: 0 !important;
}

.flex-grow-1 {
  flex-grow: 1 !important;
}

.flex-shrink-0 {
  flex-shrink: 0 !important;
}

.flex-shrink-1 {
  flex-shrink: 1 !important;
}

.flex-wrap {
  flex-wrap: wrap !important;
}

.flex-nowrap {
  flex-wrap: nowrap !important;
}

.flex-wrap-reverse {
  flex-wrap: wrap-reverse !important;
}

.gap-0 {
  gap: 0 !important;
}

.gap-1 {
  gap: 0.25rem !important;
}

.gap-2 {
  gap: 0.5rem !important;
}

.gap-3 {
  gap: 1rem !important;
}

.gap-4 {
  gap: 1.5rem !important;
}

.gap-5 {
  gap: 3rem !important;
}

.justify-content-start {
  justify-content: flex-start !important;
}

.justify-content-end {
  justify-content: flex-end !important;
}

.justify-content-center {
  justify-content: center !important;
}

.justify-content-between {
  justify-content: space-between !important;
}

.justify-content-around {
  justify-content: space-around !important;
}

.justify-content-evenly {
  justify-content: space-evenly !important;
}

.align-items-start {
  align-items: flex-start !important;
}

.align-items-end {
  align-items: flex-end !important;
}

.align-items-center {
  align-items: center !important;
}

.align-items-baseline {
  align-items: baseline !important;
}

.align-items-stretch {
  align-items: stretch !important;
}

.align-content-start {
  align-content: flex-start !important;
}

.align-content-end {
  align-content: flex-end !important;
}

.align-content-center {
  align-content: center !important;
}

.align-content-between {
  align-content: space-between !important;
}

.align-content-around {
  align-content: space-around !important;
}

.align-content-stretch {
  align-content: stretch !important;
}

.align-self-auto {
  align-self: auto !important;
}

.align-self-start {
  align-self: flex-start !important;
}

.align-self-end {
  align-self: flex-end !important;
}

.align-self-center {
  align-self: center !important;
}

.align-self-baseline {
  align-self: baseline !important;
}

.align-self-stretch {
  align-self: stretch !important;
}

.order-first {
  order: -1 !important;
}

.order-0 {
  order: 0 !important;
}

.order-1 {
  order: 1 !important;
}

.order-2 {
  order: 2 !important;
}

.order-3 {
  order: 3 !important;
}

.order-4 {
  order: 4 !important;
}

.order-5 {
  order: 5 !important;
}

.order-last {
  order: 6 !important;
}

.m-0 {
  margin: 0 !important;
}

.m-1 {
  margin: 0.25rem !important;
}

.m-2 {
  margin: 0.5rem !important;
}

.m-3 {
  margin: 1rem !important;
}

.m-4 {
  margin: 1.5rem !important;
}

.m-5 {
  margin: 3rem !important;
}

.m-auto {
  margin: auto !important;
}

.mx-0 {
  margin-right: 0 !important;
  margin-left: 0 !important;
}

.mx-1 {
  margin-right: 0.25rem !important;
  margin-left: 0.25rem !important;
}

.mx-2 {
  margin-right: 0.5rem !important;
  margin-left: 0.5rem !important;
}

.mx-3 {
  margin-right: 1rem !important;
  margin-left: 1rem !important;
}

.mx-4 {
  margin-right: 1.5rem !important;
  margin-left: 1.5rem !important;
}

.mx-5 {
  margin-right: 3rem !important;
  margin-left: 3rem !important;
}

.mx-auto {
  margin-right: auto !important;
  margin-left: auto !important;
}

.my-0 {
  margin-top: 0 !important;
  margin-bottom: 0 !important;
}

.my-1 {
  margin-top: 0.25rem !important;
  margin-bottom: 0.25rem !important;
}

.my-2 {
  margin-top: 0.5rem !important;
  margin-bottom: 0.5rem !important;
}

.my-3 {
  margin-top: 1rem !important;
  margin-bottom: 1rem !important;
}

.my-4 {
  margin-top: 1.5rem !important;
  margin-bottom: 1.5rem !important;
}

.my-5 {
  margin-top: 3rem !important;
  margin-bottom: 3rem !important;
}

.my-auto {
  margin-top: auto !important;
  margin-bottom: auto !important;
}

.mt-0 {
  margin-top: 0 !important;
}

.mt-1 {
  margin-top: 0.25rem !important;
}

.mt-2 {
  margin-top: 0.5rem !important;
}

.mt-3 {
  margin-top: 1rem !important;
}

.mt-4 {
  margin-top: 1.5rem !important;
}

.mt-5 {
  margin-top: 3rem !important;
}

.mt-auto {
  margin-top: auto !important;
}

.me-0 {
  margin-right: 0 !important;
}

.me-1 {
  margin-right: 0.25rem !important;
}

.me-2 {
  margin-right: 0.5rem !important;
}

.me-3 {
  margin-right: 1rem !important;
}

.me-4 {
  margin-right: 1.5rem !important;
}

.me-5 {
  margin-right: 3rem !important;
}

.me-auto {
  margin-right: auto !important;
}

.mb-0 {
  margin-bottom: 0 !important;
}

.mb-1 {
  margin-bottom: 0.25rem !important;
}

.mb-2 {
  margin-bottom: 0.5rem !important;
}

.mb-3 {
  margin-bottom: 1rem !important;
}

.mb-4 {
  margin-bottom: 1.5rem !important;
}

.mb-5 {
  margin-bottom: 3rem !important;
}

.mb-auto {
  margin-bottom: auto !important;
}

.ms-0 {
  margin-left: 0 !important;
}

.ms-1 {
  margin-left: 0.25rem !important;
}

.ms-2 {
  margin-left: 0.5rem !important;
}

.ms-3 {
  margin-left: 1rem !important;
}

.ms-4 {
  margin-left: 1.5rem !important;
}

.ms-5 {
  margin-left: 3rem !important;
}

.ms-auto {
  margin-left: auto !important;
}

.p-0 {
  padding: 0 !important;
}

.p-1 {
  padding: 0.25rem !important;
}

.p-2 {
  padding: 0.5rem !important;
}

.p-3 {
  padding: 1rem !important;
}

.p-4 {
  padding: 1.5rem !important;
}

.p-5 {
  padding: 3rem !important;
}

.px-0 {
  padding-right: 0 !important;
  padding-left: 0 !important;
}

.px-1 {
  padding-right: 0.25rem !important;
  padding-left: 0.25rem !important;
}

.px-2 {
  padding-right: 0.5rem !important;
  padding-left: 0.5rem !important;
}

.px-3 {
  padding-right: 1rem !important;
  padding-left: 1rem !important;
}

.px-4 {
  padding-right: 1.5rem !important;
  padding-left: 1.5rem !important;
}

.px-5 {
  padding-right: 3rem !important;
  padding-left: 3rem !important;
}

.py-0 {
  padding-top: 0 !important;
  padding-bottom: 0 !important;
}

.py-1 {
  padding-top: 0.25rem !important;
  padding-bottom: 0.25rem !important;
}

.py-2 {
  padding-top: 0.5rem !important;
  padding-bottom: 0.5rem !important;
}

.py-3 {
  padding-top: 1rem !important;
  padding-bottom: 1rem !important;
}

.py-4 {
  padding-top: 1.5rem !important;
  padding-bottom: 1.5rem !important;
}

.py-5 {
  padding-top: 3rem !important;
  padding-bottom: 3rem !important;
}

.pt-0 {
  padding-top: 0 !important;
}

.pt-1 {
  padding-top: 0.25rem !important;
}

.pt-2 {
  padding-top: 0.5rem !important;
}

.pt-3 {
  padding-top: 1rem !important;
}

.pt-4 {
  padding-top: 1.5rem !important;
}

.pt-5 {
  padding-top: 3rem !important;
}

.pe-0 {
  padding-right: 0 !important;
}

.pe-1 {
  padding-right: 0.25rem !important;
}

.pe-2 {
  padding-right: 0.5rem !important;
}

.pe-3 {
  padding-right: 1rem !important;
}

.pe-4 {
  padding-right: 1.5rem !important;
}

.pe-5 {
  padding-right: 3rem !important;
}

.pb-0 {
  padding-bottom: 0 !important;
}

.pb-1 {
  padding-bottom: 0.25rem !important;
}

.pb-2 {
  padding-bottom: 0.5rem !important;
}

.pb-3 {
  padding-bottom: 1rem !important;
}

.pb-4 {
  padding-bottom: 1.5rem !important;
}

.pb-5 {
  padding-bottom: 3rem !important;
}

.ps-0 {
  padding-left: 0 !important;
}

.ps-1 {
  padding-left: 0.25rem !important;
}

.ps-2 {
  padding-left: 0.5rem !important;
}

.ps-3 {
  padding-left: 1rem !important;
}

.ps-4 {
  padding-left: 1.5rem !important;
}

.ps-5 {
  padding-left: 3rem !important;
}

.font-monospace {
  font-family: var(--bs-font-monospace) !important;
}

.fs-1 {
  font-size: calc(1.375rem + 1.5vw) !important;
}

.fs-2 {
  font-size: calc(1.325rem + 0.9vw) !important;
}

.fs-3 {
  font-size: calc(1.3rem + 0.6vw) !important;
}

.fs-4 {
  font-size: calc(1.275rem + 0.3vw) !important;
}

.fs-5 {
  font-size: 1.25rem !important;
}

.fs-6 {
  font-size: 1rem !important;
}

.fst-italic {
  font-style: italic !important;
}

.fst-normal {
  font-style: normal !important;
}

.fw-light {
  font-weight: 300 !important;
}

.fw-lighter {
  font-weight: lighter !important;
}

.fw-normal {
  font-weight: 400 !important;
}

.fw-bold {
  font-weight: 700 !important;
}

.fw-bolder {
  font-weight: bolder !important;
}

.lh-1 {
  line-height: 1 !important;
}

.lh-sm {
  line-height: 1.25 !important;
}

.lh-base {
  line-height: 1.5 !important;
}

.lh-lg {
  line-height: 2 !important;
}

.text-start {
  text-align: left !important;
}

.text-end {
  text-align: right !important;
}

.text-center {
  text-align: center !important;
}

.text-decoration-none {
  text-decoration: none !important;
}

.text-decoration-underline {
  text-decoration: underline !important;
}

.text-decoration-line-through {
  text-decoration: line-through !important;
}

.text-lowercase {
  text-transform: lowercase !important;
}

.text-uppercase {
  text-transform: uppercase !important;
}

.text-capitalize {
  text-transform: capitalize !important;
}

.text-wrap {
  white-space: normal !important;
}

.text-nowrap {
  white-space: nowrap !important;
}

/* rtl:begin:remove */
.text-break {
  word-wrap: break-word !important;
  word-break: break-word !important;
}

/* rtl:end:remove */
.text-primary {
  color: #0d6efd !important;
}

.text-secondary {
  color: #6c757d !important;
}

.text-success {
  color: #198754 !important;
}

.text-info {
  color: #0dcaf0 !important;
}

.text-warning {
  color: #ffc107 !important;
}

.text-danger {
  color: #dc3545 !important;
}

.text-light {
  color: #f8f9fa !important;
}

.text-dark {
  color: #212529 !important;
}

.text-white {
  color: #fff !important;
}

.text-body {
  color: #212529 !important;
}

.text-muted {
  color: #6c757d !important;
}

.text-black-50 {
  color: rgba(0, 0, 0, 0.5) !important;
}

.text-white-50 {
  color: rgba(255, 255, 255, 0.5) !important;
}

.text-reset {
  color: inherit !important;
}

.bg-primary {
  background-color: #0d6efd !important;
}

.bg-secondary {
  background-color: #6c757d !important;
}

.bg-success {
  background-color: #198754 !important;
}

.bg-info {
  background-color: #0dcaf0 !important;
}

.bg-warning {
  background-color: #ffc107 !important;
}

.bg-danger {
  background-color: #dc3545 !important;
}

.bg-light {
  background-color: #f8f9fa !important;
}

.bg-dark {
  background-color: #212529 !important;
}

.bg-body {
  background-color: #fff !important;
}

.bg-white {
  background-color: #fff !important;
}

.bg-transparent {
  background-color: transparent !important;
}

.bg-gradient {
  background-image: var(--bs-gradient) !important;
}

.user-select-all {
  -webkit-user-select: all !important;
  -moz-user-select: all !important;
  user-select: all !important;
}

.user-select-auto {
  -webkit-user-select: auto !important;
  -moz-user-select: auto !important;
  user-select: auto !important;
}

.user-select-none {
  -webkit-user-select: none !important;
  -moz-user-select: none !important;
  user-select: none !important;
}

.pe-none {
  pointer-events: none !important;
}

.pe-auto {
  pointer-events: auto !important;
}

.rounded {
  border-radius: 0.25rem !important;
}

.rounded-0 {
  border-radius: 0 !important;
}

.rounded-1 {
  border-radius: 0.2rem !important;
}

.rounded-2 {
  border-radius: 0.25rem !important;
}

.rounded-3 {
  border-radius: 0.3rem !important;
}

.rounded-circle {
  border-radius: 50% !important;
}

.rounded-pill {
  border-radius: 50rem !important;
}

.rounded-top {
  border-top-left-radius: 0.25rem !important;
  border-top-right-radius: 0.25rem !important;
}

.rounded-end {
  border-top-right-radius: 0.25rem !important;
  border-bottom-right-radius: 0.25rem !important;
}

.rounded-bottom {
  border-bottom-right-radius: 0.25rem !important;
  border-bottom-left-radius: 0.25rem !important;
}

.rounded-start {
  border-bottom-left-radius: 0.25rem !important;
  border-top-left-radius: 0.25rem !important;
}

.visible {
  visibility: visible !important;
}

.invisible {
  visibility: hidden !important;
}

@media (min-width: 576px) {
  .float-sm-start {
    float: left !important;
  }

  .float-sm-end {
    float: right !important;
  }

  .float-sm-none {
    float: none !important;
  }

  .d-sm-inline {
    display: inline !important;
  }

  .d-sm-inline-block {
    display: inline-block !important;
  }

  .d-sm-block {
    display: block !important;
  }

  .d-sm-grid {
    display: grid !important;
  }

  .d-sm-table {
    display: table !important;
  }

  .d-sm-table-row {
    display: table-row !important;
  }

  .d-sm-table-cell {
    display: table-cell !important;
  }

  .d-sm-flex {
    display: flex !important;
  }

  .d-sm-inline-flex {
    display: inline-flex !important;
  }

  .d-sm-none {
    display: none !important;
  }

  .flex-sm-fill {
    flex: 1 1 auto !important;
  }

  .flex-sm-row {
    flex-direction: row !important;
  }

  .flex-sm-column {
    flex-direction: column !important;
  }

  .flex-sm-row-reverse {
    flex-direction: row-reverse !important;
  }

  .flex-sm-column-reverse {
    flex-direction: column-reverse !important;
  }

  .flex-sm-grow-0 {
    flex-grow: 0 !important;
  }

  .flex-sm-grow-1 {
    flex-grow: 1 !important;
  }

  .flex-sm-shrink-0 {
    flex-shrink: 0 !important;
  }

  .flex-sm-shrink-1 {
    flex-shrink: 1 !important;
  }

  .flex-sm-wrap {
    flex-wrap: wrap !important;
  }

  .flex-sm-nowrap {
    flex-wrap: nowrap !important;
  }

  .flex-sm-wrap-reverse {
    flex-wrap: wrap-reverse !important;
  }

  .gap-sm-0 {
    gap: 0 !important;
  }

  .gap-sm-1 {
    gap: 0.25rem !important;
  }

  .gap-sm-2 {
    gap: 0.5rem !important;
  }

  .gap-sm-3 {
    gap: 1rem !important;
  }

  .gap-sm-4 {
    gap: 1.5rem !important;
  }

  .gap-sm-5 {
    gap: 3rem !important;
  }

  .justify-content-sm-start {
    justify-content: flex-start !important;
  }

  .justify-content-sm-end {
    justify-content: flex-end !important;
  }

  .justify-content-sm-center {
    justify-content: center !important;
  }

  .justify-content-sm-between {
    justify-content: space-between !important;
  }

  .justify-content-sm-around {
    justify-content: space-around !important;
  }

  .justify-content-sm-evenly {
    justify-content: space-evenly !important;
  }

  .align-items-sm-start {
    align-items: flex-start !important;
  }

  .align-items-sm-end {
    align-items: flex-end !important;
  }

  .align-items-sm-center {
    align-items: center !important;
  }

  .align-items-sm-baseline {
    align-items: baseline !important;
  }

  .align-items-sm-stretch {
    align-items: stretch !important;
  }

  .align-content-sm-start {
    align-content: flex-start !important;
  }

  .align-content-sm-end {
    align-content: flex-end !important;
  }

  .align-content-sm-center {
    align-content: center !important;
  }

  .align-content-sm-between {
    align-content: space-between !important;
  }

  .align-content-sm-around {
    align-content: space-around !important;
  }

  .align-content-sm-stretch {
    align-content: stretch !important;
  }

  .align-self-sm-auto {
    align-self: auto !important;
  }

  .align-self-sm-start {
    align-self: flex-start !important;
  }

  .align-self-sm-end {
    align-self: flex-end !important;
  }

  .align-self-sm-center {
    align-self: center !important;
  }

  .align-self-sm-baseline {
    align-self: baseline !important;
  }

  .align-self-sm-stretch {
    align-self: stretch !important;
  }

  .order-sm-first {
    order: -1 !important;
  }

  .order-sm-0 {
    order: 0 !important;
  }

  .order-sm-1 {
    order: 1 !important;
  }

  .order-sm-2 {
    order: 2 !important;
  }

  .order-sm-3 {
    order: 3 !important;
  }

  .order-sm-4 {
    order: 4 !important;
  }

  .order-sm-5 {
    order: 5 !important;
  }

  .order-sm-last {
    order: 6 !important;
  }

  .m-sm-0 {
    margin: 0 !important;
  }

  .m-sm-1 {
    margin: 0.25rem !important;
  }

  .m-sm-2 {
    margin: 0.5rem !important;
  }

  .m-sm-3 {
    margin: 1rem !important;
  }

  .m-sm-4 {
    margin: 1.5rem !important;
  }

  .m-sm-5 {
    margin: 3rem !important;
  }

  .m-sm-auto {
    margin: auto !important;
  }

  .mx-sm-0 {
    margin-right: 0 !important;
    margin-left: 0 !important;
  }

  .mx-sm-1 {
    margin-right: 0.25rem !important;
    margin-left: 0.25rem !important;
  }

  .mx-sm-2 {
    margin-right: 0.5rem !important;
    margin-left: 0.5rem !important;
  }

  .mx-sm-3 {
    margin-right: 1rem !important;
    margin-left: 1rem !important;
  }

  .mx-sm-4 {
    margin-right: 1.5rem !important;
    margin-left: 1.5rem !important;
  }

  .mx-sm-5 {
    margin-right: 3rem !important;
    margin-left: 3rem !important;
  }

  .mx-sm-auto {
    margin-right: auto !important;
    margin-left: auto !important;
  }

  .my-sm-0 {
    margin-top: 0 !important;
    margin-bottom: 0 !important;
  }

  .my-sm-1 {
    margin-top: 0.25rem !important;
    margin-bottom: 0.25rem !important;
  }

  .my-sm-2 {
    margin-top: 0.5rem !important;
    margin-bottom: 0.5rem !important;
  }

  .my-sm-3 {
    margin-top: 1rem !important;
    margin-bottom: 1rem !important;
  }

  .my-sm-4 {
    margin-top: 1.5rem !important;
    margin-bottom: 1.5rem !important;
  }

  .my-sm-5 {
    margin-top: 3rem !important;
    margin-bottom: 3rem !important;
  }

  .my-sm-auto {
    margin-top: auto !important;
    margin-bottom: auto !important;
  }

  .mt-sm-0 {
    margin-top: 0 !important;
  }

  .mt-sm-1 {
    margin-top: 0.25rem !important;
  }

  .mt-sm-2 {
    margin-top: 0.5rem !important;
  }

  .mt-sm-3 {
    margin-top: 1rem !important;
  }

  .mt-sm-4 {
    margin-top: 1.5rem !important;
  }

  .mt-sm-5 {
    margin-top: 3rem !important;
  }

  .mt-sm-auto {
    margin-top: auto !important;
  }

  .me-sm-0 {
    margin-right: 0 !important;
  }

  .me-sm-1 {
    margin-right: 0.25rem !important;
  }

  .me-sm-2 {
    margin-right: 0.5rem !important;
  }

  .me-sm-3 {
    margin-right: 1rem !important;
  }

  .me-sm-4 {
    margin-right: 1.5rem !important;
  }

  .me-sm-5 {
    margin-right: 3rem !important;
  }

  .me-sm-auto {
    margin-right: auto !important;
  }

  .mb-sm-0 {
    margin-bottom: 0 !important;
  }

  .mb-sm-1 {
    margin-bottom: 0.25rem !important;
  }

  .mb-sm-2 {
    margin-bottom: 0.5rem !important;
  }

  .mb-sm-3 {
    margin-bottom: 1rem !important;
  }

  .mb-sm-4 {
    margin-bottom: 1.5rem !important;
  }

  .mb-sm-5 {
    margin-bottom: 3rem !important;
  }

  .mb-sm-auto {
    margin-bottom: auto !important;
  }

  .ms-sm-0 {
    margin-left: 0 !important;
  }

  .ms-sm-1 {
    margin-left: 0.25rem !important;
  }

  .ms-sm-2 {
    margin-left: 0.5rem !important;
  }

  .ms-sm-3 {
    margin-left: 1rem !important;
  }

  .ms-sm-4 {
    margin-left: 1.5rem !important;
  }

  .ms-sm-5 {
    margin-left: 3rem !important;
  }

  .ms-sm-auto {
    margin-left: auto !important;
  }

  .p-sm-0 {
    padding: 0 !important;
  }

  .p-sm-1 {
    padding: 0.25rem !important;
  }

  .p-sm-2 {
    padding: 0.5rem !important;
  }

  .p-sm-3 {
    padding: 1rem !important;
  }

  .p-sm-4 {
    padding: 1.5rem !important;
  }

  .p-sm-5 {
    padding: 3rem !important;
  }

  .px-sm-0 {
    padding-right: 0 !important;
    padding-left: 0 !important;
  }

  .px-sm-1 {
    padding-right: 0.25rem !important;
    padding-left: 0.25rem !important;
  }

  .px-sm-2 {
    padding-right: 0.5rem !important;
    padding-left: 0.5rem !important;
  }

  .px-sm-3 {
    padding-right: 1rem !important;
    padding-left: 1rem !important;
  }

  .px-sm-4 {
    padding-right: 1.5rem !important;
    padding-left: 1.5rem !important;
  }

  .px-sm-5 {
    padding-right: 3rem !important;
    padding-left: 3rem !important;
  }

  .py-sm-0 {
    padding-top: 0 !important;
    padding-bottom: 0 !important;
  }

  .py-sm-1 {
    padding-top: 0.25rem !important;
    padding-bottom: 0.25rem !important;
  }

  .py-sm-2 {
    padding-top: 0.5rem !important;
    padding-bottom: 0.5rem !important;
  }

  .py-sm-3 {
    padding-top: 1rem !important;
    padding-bottom: 1rem !important;
  }

  .py-sm-4 {
    padding-top: 1.5rem !important;
    padding-bottom: 1.5rem !important;
  }

  .py-sm-5 {
    padding-top: 3rem !important;
    padding-bottom: 3rem !important;
  }

  .pt-sm-0 {
    padding-top: 0 !important;
  }

  .pt-sm-1 {
    padding-top: 0.25rem !important;
  }

  .pt-sm-2 {
    padding-top: 0.5rem !important;
  }

  .pt-sm-3 {
    padding-top: 1rem !important;
  }

  .pt-sm-4 {
    padding-top: 1.5rem !important;
  }

  .pt-sm-5 {
    padding-top: 3rem !important;
  }

  .pe-sm-0 {
    padding-right: 0 !important;
  }

  .pe-sm-1 {
    padding-right: 0.25rem !important;
  }

  .pe-sm-2 {
    padding-right: 0.5rem !important;
  }

  .pe-sm-3 {
    padding-right: 1rem !important;
  }

  .pe-sm-4 {
    padding-right: 1.5rem !important;
  }

  .pe-sm-5 {
    padding-right: 3rem !important;
  }

  .pb-sm-0 {
    padding-bottom: 0 !important;
  }

  .pb-sm-1 {
    padding-bottom: 0.25rem !important;
  }

  .pb-sm-2 {
    padding-bottom: 0.5rem !important;
  }

  .pb-sm-3 {
    padding-bottom: 1rem !important;
  }

  .pb-sm-4 {
    padding-bottom: 1.5rem !important;
  }

  .pb-sm-5 {
    padding-bottom: 3rem !important;
  }

  .ps-sm-0 {
    padding-left: 0 !important;
  }

  .ps-sm-1 {
    padding-left: 0.25rem !important;
  }

  .ps-sm-2 {
    padding-left: 0.5rem !important;
  }

  .ps-sm-3 {
    padding-left: 1rem !important;
  }

  .ps-sm-4 {
    padding-left: 1.5rem !important;
  }

  .ps-sm-5 {
    padding-left: 3rem !important;
  }

  .text-sm-start {
    text-align: left !important;
  }

  .text-sm-end {
    text-align: right !important;
  }

  .text-sm-center {
    text-align: center !important;
  }
}

@media (min-width: 768px) {
  .float-md-start {
    float: left !important;
  }

  .float-md-end {
    float: right !important;
  }

  .float-md-none {
    float: none !important;
  }

  .d-md-inline {
    display: inline !important;
  }

  .d-md-inline-block {
    display: inline-block !important;
  }

  .d-md-block {
    display: block !important;
  }

  .d-md-grid {
    display: grid !important;
  }

  .d-md-table {
    display: table !important;
  }

  .d-md-table-row {
    display: table-row !important;
  }

  .d-md-table-cell {
    display: table-cell !important;
  }

  .d-md-flex {
    display: flex !important;
  }

  .d-md-inline-flex {
    display: inline-flex !important;
  }

  .d-md-none {
    display: none !important;
  }

  .flex-md-fill {
    flex: 1 1 auto !important;
  }

  .flex-md-row {
    flex-direction: row !important;
  }

  .flex-md-column {
    flex-direction: column !important;
  }

  .flex-md-row-reverse {
    flex-direction: row-reverse !important;
  }

  .flex-md-column-reverse {
    flex-direction: column-reverse !important;
  }

  .flex-md-grow-0 {
    flex-grow: 0 !important;
  }

  .flex-md-grow-1 {
    flex-grow: 1 !important;
  }

  .flex-md-shrink-0 {
    flex-shrink: 0 !important;
  }

  .flex-md-shrink-1 {
    flex-shrink: 1 !important;
  }

  .flex-md-wrap {
    flex-wrap: wrap !important;
  }

  .flex-md-nowrap {
    flex-wrap: nowrap !important;
  }

  .flex-md-wrap-reverse {
    flex-wrap: wrap-reverse !important;
  }

  .gap-md-0 {
    gap: 0 !important;
  }

  .gap-md-1 {
    gap: 0.25rem !important;
  }

  .gap-md-2 {
    gap: 0.5rem !important;
  }

  .gap-md-3 {
    gap: 1rem !important;
  }

  .gap-md-4 {
    gap: 1.5rem !important;
  }

  .gap-md-5 {
    gap: 3rem !important;
  }

  .justify-content-md-start {
    justify-content: flex-start !important;
  }

  .justify-content-md-end {
    justify-content: flex-end !important;
  }

  .justify-content-md-center {
    justify-content: center !important;
  }

  .justify-content-md-between {
    justify-content: space-between !important;
  }

  .justify-content-md-around {
    justify-content: space-around !important;
  }

  .justify-content-md-evenly {
    justify-content: space-evenly !important;
  }

  .align-items-md-start {
    align-items: flex-start !important;
  }

  .align-items-md-end {
    align-items: flex-end !important;
  }

  .align-items-md-center {
    align-items: center !important;
  }

  .align-items-md-baseline {
    align-items: baseline !important;
  }

  .align-items-md-stretch {
    align-items: stretch !important;
  }

  .align-content-md-start {
    align-content: flex-start !important;
  }

  .align-content-md-end {
    align-content: flex-end !important;
  }

  .align-content-md-center {
    align-content: center !important;
  }

  .align-content-md-between {
    align-content: space-between !important;
  }

  .align-content-md-around {
    align-content: space-around !important;
  }

  .align-content-md-stretch {
    align-content: stretch !important;
  }

  .align-self-md-auto {
    align-self: auto !important;
  }

  .align-self-md-start {
    align-self: flex-start !important;
  }

  .align-self-md-end {
    align-self: flex-end !important;
  }

  .align-self-md-center {
    align-self: center !important;
  }

  .align-self-md-baseline {
    align-self: baseline !important;
  }

  .align-self-md-stretch {
    align-self: stretch !important;
  }

  .order-md-first {
    order: -1 !important;
  }

  .order-md-0 {
    order: 0 !important;
  }

  .order-md-1 {
    order: 1 !important;
  }

  .order-md-2 {
    order: 2 !important;
  }

  .order-md-3 {
    order: 3 !important;
  }

  .order-md-4 {
    order: 4 !important;
  }

  .order-md-5 {
    order: 5 !important;
  }

  .order-md-last {
    order: 6 !important;
  }

  .m-md-0 {
    margin: 0 !important;
  }

  .m-md-1 {
    margin: 0.25rem !important;
  }

  .m-md-2 {
    margin: 0.5rem !important;
  }

  .m-md-3 {
    margin: 1rem !important;
  }

  .m-md-4 {
    margin: 1.5rem !important;
  }

  .m-md-5 {
    margin: 3rem !important;
  }

  .m-md-auto {
    margin: auto !important;
  }

  .mx-md-0 {
    margin-right: 0 !important;
    margin-left: 0 !important;
  }

  .mx-md-1 {
    margin-right: 0.25rem !important;
    margin-left: 0.25rem !important;
  }

  .mx-md-2 {
    margin-right: 0.5rem !important;
    margin-left: 0.5rem !important;
  }

  .mx-md-3 {
    margin-right: 1rem !important;
    margin-left: 1rem !important;
  }

  .mx-md-4 {
    margin-right: 1.5rem !important;
    margin-left: 1.5rem !important;
  }

  .mx-md-5 {
    margin-right: 3rem !important;
    margin-left: 3rem !important;
  }

  .mx-md-auto {
    margin-right: auto !important;
    margin-left: auto !important;
  }

  .my-md-0 {
    margin-top: 0 !important;
    margin-bottom: 0 !important;
  }

  .my-md-1 {
    margin-top: 0.25rem !important;
    margin-bottom: 0.25rem !important;
  }

  .my-md-2 {
    margin-top: 0.5rem !important;
    margin-bottom: 0.5rem !important;
  }

  .my-md-3 {
    margin-top: 1rem !important;
    margin-bottom: 1rem !important;
  }

  .my-md-4 {
    margin-top: 1.5rem !important;
    margin-bottom: 1.5rem !important;
  }

  .my-md-5 {
    margin-top: 3rem !important;
    margin-bottom: 3rem !important;
  }

  .my-md-auto {
    margin-top: auto !important;
    margin-bottom: auto !important;
  }

  .mt-md-0 {
    margin-top: 0 !important;
  }

  .mt-md-1 {
    margin-top: 0.25rem !important;
  }

  .mt-md-2 {
    margin-top: 0.5rem !important;
  }

  .mt-md-3 {
    margin-top: 1rem !important;
  }

  .mt-md-4 {
    margin-top: 1.5rem !important;
  }

  .mt-md-5 {
    margin-top: 3rem !important;
  }

  .mt-md-auto {
    margin-top: auto !important;
  }

  .me-md-0 {
    margin-right: 0 !important;
  }

  .me-md-1 {
    margin-right: 0.25rem !important;
  }

  .me-md-2 {
    margin-right: 0.5rem !important;
  }

  .me-md-3 {
    margin-right: 1rem !important;
  }

  .me-md-4 {
    margin-right: 1.5rem !important;
  }

  .me-md-5 {
    margin-right: 3rem !important;
  }

  .me-md-auto {
    margin-right: auto !important;
  }

  .mb-md-0 {
    margin-bottom: 0 !important;
  }

  .mb-md-1 {
    margin-bottom: 0.25rem !important;
  }

  .mb-md-2 {
    margin-bottom: 0.5rem !important;
  }

  .mb-md-3 {
    margin-bottom: 1rem !important;
  }

  .mb-md-4 {
    margin-bottom: 1.5rem !important;
  }

  .mb-md-5 {
    margin-bottom: 3rem !important;
  }

  .mb-md-auto {
    margin-bottom: auto !important;
  }

  .ms-md-0 {
    margin-left: 0 !important;
  }

  .ms-md-1 {
    margin-left: 0.25rem !important;
  }

  .ms-md-2 {
    margin-left: 0.5rem !important;
  }

  .ms-md-3 {
    margin-left: 1rem !important;
  }

  .ms-md-4 {
    margin-left: 1.5rem !important;
  }

  .ms-md-5 {
    margin-left: 3rem !important;
  }

  .ms-md-auto {
    margin-left: auto !important;
  }

  .p-md-0 {
    padding: 0 !important;
  }

  .p-md-1 {
    padding: 0.25rem !important;
  }

  .p-md-2 {
    padding: 0.5rem !important;
  }

  .p-md-3 {
    padding: 1rem !important;
  }

  .p-md-4 {
    padding: 1.5rem !important;
  }

  .p-md-5 {
    padding: 3rem !important;
  }

  .px-md-0 {
    padding-right: 0 !important;
    padding-left: 0 !important;
  }

  .px-md-1 {
    padding-right: 0.25rem !important;
    padding-left: 0.25rem !important;
  }

  .px-md-2 {
    padding-right: 0.5rem !important;
    padding-left: 0.5rem !important;
  }

  .px-md-3 {
    padding-right: 1rem !important;
    padding-left: 1rem !important;
  }

  .px-md-4 {
    padding-right: 1.5rem !important;
    padding-left: 1.5rem !important;
  }

  .px-md-5 {
    padding-right: 3rem !important;
    padding-left: 3rem !important;
  }

  .py-md-0 {
    padding-top: 0 !important;
    padding-bottom: 0 !important;
  }

  .py-md-1 {
    padding-top: 0.25rem !important;
    padding-bottom: 0.25rem !important;
  }

  .py-md-2 {
    padding-top: 0.5rem !important;
    padding-bottom: 0.5rem !important;
  }

  .py-md-3 {
    padding-top: 1rem !important;
    padding-bottom: 1rem !important;
  }

  .py-md-4 {
    padding-top: 1.5rem !important;
    padding-bottom: 1.5rem !important;
  }

  .py-md-5 {
    padding-top: 3rem !important;
    padding-bottom: 3rem !important;
  }

  .pt-md-0 {
    padding-top: 0 !important;
  }

  .pt-md-1 {
    padding-top: 0.25rem !important;
  }

  .pt-md-2 {
    padding-top: 0.5rem !important;
  }

  .pt-md-3 {
    padding-top: 1rem !important;
  }

  .pt-md-4 {
    padding-top: 1.5rem !important;
  }

  .pt-md-5 {
    padding-top: 3rem !important;
  }

  .pe-md-0 {
    padding-right: 0 !important;
  }

  .pe-md-1 {
    padding-right: 0.25rem !important;
  }

  .pe-md-2 {
    padding-right: 0.5rem !important;
  }

  .pe-md-3 {
    padding-right: 1rem !important;
  }

  .pe-md-4 {
    padding-right: 1.5rem !important;
  }

  .pe-md-5 {
    padding-right: 3rem !important;
  }

  .pb-md-0 {
    padding-bottom: 0 !important;
  }

  .pb-md-1 {
    padding-bottom: 0.25rem !important;
  }

  .pb-md-2 {
    padding-bottom: 0.5rem !important;
  }

  .pb-md-3 {
    padding-bottom: 1rem !important;
  }

  .pb-md-4 {
    padding-bottom: 1.5rem !important;
  }

  .pb-md-5 {
    padding-bottom: 3rem !important;
  }

  .ps-md-0 {
    padding-left: 0 !important;
  }

  .ps-md-1 {
    padding-left: 0.25rem !important;
  }

  .ps-md-2 {
    padding-left: 0.5rem !important;
  }

  .ps-md-3 {
    padding-left: 1rem !important;
  }

  .ps-md-4 {
    padding-left: 1.5rem !important;
  }

  .ps-md-5 {
    padding-left: 3rem !important;
  }

  .text-md-start {
    text-align: left !important;
  }

  .text-md-end {
    text-align: right !important;
  }

  .text-md-center {
    text-align: center !important;
  }
}

@media (min-width: 992px) {
  .float-lg-start {
    float: left !important;
  }

  .float-lg-end {
    float: right !important;
  }

  .float-lg-none {
    float: none !important;
  }

  .d-lg-inline {
    display: inline !important;
  }

  .d-lg-inline-block {
    display: inline-block !important;
  }

  .d-lg-block {
    display: block !important;
  }

  .d-lg-grid {
    display: grid !important;
  }

  .d-lg-table {
    display: table !important;
  }

  .d-lg-table-row {
    display: table-row !important;
  }

  .d-lg-table-cell {
    display: table-cell !important;
  }

  .d-lg-flex {
    display: flex !important;
  }

  .d-lg-inline-flex {
    display: inline-flex !important;
  }

  .d-lg-none {
    display: none !important;
  }

  .flex-lg-fill {
    flex: 1 1 auto !important;
  }

  .flex-lg-row {
    flex-direction: row !important;
  }

  .flex-lg-column {
    flex-direction: column !important;
  }

  .flex-lg-row-reverse {
    flex-direction: row-reverse !important;
  }

  .flex-lg-column-reverse {
    flex-direction: column-reverse !important;
  }

  .flex-lg-grow-0 {
    flex-grow: 0 !important;
  }

  .flex-lg-grow-1 {
    flex-grow: 1 !important;
  }

  .flex-lg-shrink-0 {
    flex-shrink: 0 !important;
  }

  .flex-lg-shrink-1 {
    flex-shrink: 1 !important;
  }

  .flex-lg-wrap {
    flex-wrap: wrap !important;
  }

  .flex-lg-nowrap {
    flex-wrap: nowrap !important;
  }

  .flex-lg-wrap-reverse {
    flex-wrap: wrap-reverse !important;
  }

  .gap-lg-0 {
    gap: 0 !important;
  }

  .gap-lg-1 {
    gap: 0.25rem !important;
  }

  .gap-lg-2 {
    gap: 0.5rem !important;
  }

  .gap-lg-3 {
    gap: 1rem !important;
  }

  .gap-lg-4 {
    gap: 1.5rem !important;
  }

  .gap-lg-5 {
    gap: 3rem !important;
  }

  .justify-content-lg-start {
    justify-content: flex-start !important;
  }

  .justify-content-lg-end {
    justify-content: flex-end !important;
  }

  .justify-content-lg-center {
    justify-content: center !important;
  }

  .justify-content-lg-between {
    justify-content: space-between !important;
  }

  .justify-content-lg-around {
    justify-content: space-around !important;
  }

  .justify-content-lg-evenly {
    justify-content: space-evenly !important;
  }

  .align-items-lg-start {
    align-items: flex-start !important;
  }

  .align-items-lg-end {
    align-items: flex-end !important;
  }

  .align-items-lg-center {
    align-items: center !important;
  }

  .align-items-lg-baseline {
    align-items: baseline !important;
  }

  .align-items-lg-stretch {
    align-items: stretch !important;
  }

  .align-content-lg-start {
    align-content: flex-start !important;
  }

  .align-content-lg-end {
    align-content: flex-end !important;
  }

  .align-content-lg-center {
    align-content: center !important;
  }

  .align-content-lg-between {
    align-content: space-between !important;
  }

  .align-content-lg-around {
    align-content: space-around !important;
  }

  .align-content-lg-stretch {
    align-content: stretch !important;
  }

  .align-self-lg-auto {
    align-self: auto !important;
  }

  .align-self-lg-start {
    align-self: flex-start !important;
  }

  .align-self-lg-end {
    align-self: flex-end !important;
  }

  .align-self-lg-center {
    align-self: center !important;
  }

  .align-self-lg-baseline {
    align-self: baseline !important;
  }

  .align-self-lg-stretch {
    align-self: stretch !important;
  }

  .order-lg-first {
    order: -1 !important;
  }

  .order-lg-0 {
    order: 0 !important;
  }

  .order-lg-1 {
    order: 1 !important;
  }

  .order-lg-2 {
    order: 2 !important;
  }

  .order-lg-3 {
    order: 3 !important;
  }

  .order-lg-4 {
    order: 4 !important;
  }

  .order-lg-5 {
    order: 5 !important;
  }

  .order-lg-last {
    order: 6 !important;
  }

  .m-lg-0 {
    margin: 0 !important;
  }

  .m-lg-1 {
    margin: 0.25rem !important;
  }

  .m-lg-2 {
    margin: 0.5rem !important;
  }

  .m-lg-3 {
    margin: 1rem !important;
  }

  .m-lg-4 {
    margin: 1.5rem !important;
  }

  .m-lg-5 {
    margin: 3rem !important;
  }

  .m-lg-auto {
    margin: auto !important;
  }

  .mx-lg-0 {
    margin-right: 0 !important;
    margin-left: 0 !important;
  }

  .mx-lg-1 {
    margin-right: 0.25rem !important;
    margin-left: 0.25rem !important;
  }

  .mx-lg-2 {
    margin-right: 0.5rem !important;
    margin-left: 0.5rem !important;
  }

  .mx-lg-3 {
    margin-right: 1rem !important;
    margin-left: 1rem !important;
  }

  .mx-lg-4 {
    margin-right: 1.5rem !important;
    margin-left: 1.5rem !important;
  }

  .mx-lg-5 {
    margin-right: 3rem !important;
    margin-left: 3rem !important;
  }

  .mx-lg-auto {
    margin-right: auto !important;
    margin-left: auto !important;
  }

  .my-lg-0 {
    margin-top: 0 !important;
    margin-bottom: 0 !important;
  }

  .my-lg-1 {
    margin-top: 0.25rem !important;
    margin-bottom: 0.25rem !important;
  }

  .my-lg-2 {
    margin-top: 0.5rem !important;
    margin-bottom: 0.5rem !important;
  }

  .my-lg-3 {
    margin-top: 1rem !important;
    margin-bottom: 1rem !important;
  }

  .my-lg-4 {
    margin-top: 1.5rem !important;
    margin-bottom: 1.5rem !important;
  }

  .my-lg-5 {
    margin-top: 3rem !important;
    margin-bottom: 3rem !important;
  }

  .my-lg-auto {
    margin-top: auto !important;
    margin-bottom: auto !important;
  }

  .mt-lg-0 {
    margin-top: 0 !important;
  }

  .mt-lg-1 {
    margin-top: 0.25rem !important;
  }

  .mt-lg-2 {
    margin-top: 0.5rem !important;
  }

  .mt-lg-3 {
    margin-top: 1rem !important;
  }

  .mt-lg-4 {
    margin-top: 1.5rem !important;
  }

  .mt-lg-5 {
    margin-top: 3rem !important;
  }

  .mt-lg-auto {
    margin-top: auto !important;
  }

  .me-lg-0 {
    margin-right: 0 !important;
  }

  .me-lg-1 {
    margin-right: 0.25rem !important;
  }

  .me-lg-2 {
    margin-right: 0.5rem !important;
  }

  .me-lg-3 {
    margin-right: 1rem !important;
  }

  .me-lg-4 {
    margin-right: 1.5rem !important;
  }

  .me-lg-5 {
    margin-right: 3rem !important;
  }

  .me-lg-auto {
    margin-right: auto !important;
  }

  .mb-lg-0 {
    margin-bottom: 0 !important;
  }

  .mb-lg-1 {
    margin-bottom: 0.25rem !important;
  }

  .mb-lg-2 {
    margin-bottom: 0.5rem !important;
  }

  .mb-lg-3 {
    margin-bottom: 1rem !important;
  }

  .mb-lg-4 {
    margin-bottom: 1.5rem !important;
  }

  .mb-lg-5 {
    margin-bottom: 3rem !important;
  }

  .mb-lg-auto {
    margin-bottom: auto !important;
  }

  .ms-lg-0 {
    margin-left: 0 !important;
  }

  .ms-lg-1 {
    margin-left: 0.25rem !important;
  }

  .ms-lg-2 {
    margin-left: 0.5rem !important;
  }

  .ms-lg-3 {
    margin-left: 1rem !important;
  }

  .ms-lg-4 {
    margin-left: 1.5rem !important;
  }

  .ms-lg-5 {
    margin-left: 3rem !important;
  }

  .ms-lg-auto {
    margin-left: auto !important;
  }

  .p-lg-0 {
    padding: 0 !important;
  }

  .p-lg-1 {
    padding: 0.25rem !important;
  }

  .p-lg-2 {
    padding: 0.5rem !important;
  }

  .p-lg-3 {
    padding: 1rem !important;
  }

  .p-lg-4 {
    padding: 1.5rem !important;
  }

  .p-lg-5 {
    padding: 3rem !important;
  }

  .px-lg-0 {
    padding-right: 0 !important;
    padding-left: 0 !important;
  }

  .px-lg-1 {
    padding-right: 0.25rem !important;
    padding-left: 0.25rem !important;
  }

  .px-lg-2 {
    padding-right: 0.5rem !important;
    padding-left: 0.5rem !important;
  }

  .px-lg-3 {
    padding-right: 1rem !important;
    padding-left: 1rem !important;
  }

  .px-lg-4 {
    padding-right: 1.5rem !important;
    padding-left: 1.5rem !important;
  }

  .px-lg-5 {
    padding-right: 3rem !important;
    padding-left: 3rem !important;
  }

  .py-lg-0 {
    padding-top: 0 !important;
    padding-bottom: 0 !important;
  }

  .py-lg-1 {
    padding-top: 0.25rem !important;
    padding-bottom: 0.25rem !important;
  }

  .py-lg-2 {
    padding-top: 0.5rem !important;
    padding-bottom: 0.5rem !important;
  }

  .py-lg-3 {
    padding-top: 1rem !important;
    padding-bottom: 1rem !important;
  }

  .py-lg-4 {
    padding-top: 1.5rem !important;
    padding-bottom: 1.5rem !important;
  }

  .py-lg-5 {
    padding-top: 3rem !important;
    padding-bottom: 3rem !important;
  }

  .pt-lg-0 {
    padding-top: 0 !important;
  }

  .pt-lg-1 {
    padding-top: 0.25rem !important;
  }

  .pt-lg-2 {
    padding-top: 0.5rem !important;
  }

  .pt-lg-3 {
    padding-top: 1rem !important;
  }

  .pt-lg-4 {
    padding-top: 1.5rem !important;
  }

  .pt-lg-5 {
    padding-top: 3rem !important;
  }

  .pe-lg-0 {
    padding-right: 0 !important;
  }

  .pe-lg-1 {
    padding-right: 0.25rem !important;
  }

  .pe-lg-2 {
    padding-right: 0.5rem !important;
  }

  .pe-lg-3 {
    padding-right: 1rem !important;
  }

  .pe-lg-4 {
    padding-right: 1.5rem !important;
  }

  .pe-lg-5 {
    padding-right: 3rem !important;
  }

  .pb-lg-0 {
    padding-bottom: 0 !important;
  }

  .pb-lg-1 {
    padding-bottom: 0.25rem !important;
  }

  .pb-lg-2 {
    padding-bottom: 0.5rem !important;
  }

  .pb-lg-3 {
    padding-bottom: 1rem !important;
  }

  .pb-lg-4 {
    padding-bottom: 1.5rem !important;
  }

  .pb-lg-5 {
    padding-bottom: 3rem !important;
  }

  .ps-lg-0 {
    padding-left: 0 !important;
  }

  .ps-lg-1 {
    padding-left: 0.25rem !important;
  }

  .ps-lg-2 {
    padding-left: 0.5rem !important;
  }

  .ps-lg-3 {
    padding-left: 1rem !important;
  }

  .ps-lg-4 {
    padding-left: 1.5rem !important;
  }

  .ps-lg-5 {
    padding-left: 3rem !important;
  }

  .text-lg-start {
    text-align: left !important;
  }

  .text-lg-end {
    text-align: right !important;
  }

  .text-lg-center {
    text-align: center !important;
  }
}

@media (min-width: 1200px) {
  .float-xl-start {
    float: left !important;
  }

  .float-xl-end {
    float: right !important;
  }

  .float-xl-none {
    float: none !important;
  }

  .d-xl-inline {
    display: inline !important;
  }

  .d-xl-inline-block {
    display: inline-block !important;
  }

  .d-xl-block {
    display: block !important;
  }

  .d-xl-grid {
    display: grid !important;
  }

  .d-xl-table {
    display: table !important;
  }

  .d-xl-table-row {
    display: table-row !important;
  }

  .d-xl-table-cell {
    display: table-cell !important;
  }

  .d-xl-flex {
    display: flex !important;
  }

  .d-xl-inline-flex {
    display: inline-flex !important;
  }

  .d-xl-none {
    display: none !important;
  }

  .flex-xl-fill {
    flex: 1 1 auto !important;
  }

  .flex-xl-row {
    flex-direction: row !important;
  }

  .flex-xl-column {
    flex-direction: column !important;
  }

  .flex-xl-row-reverse {
    flex-direction: row-reverse !important;
  }

  .flex-xl-column-reverse {
    flex-direction: column-reverse !important;
  }

  .flex-xl-grow-0 {
    flex-grow: 0 !important;
  }

  .flex-xl-grow-1 {
    flex-grow: 1 !important;
  }

  .flex-xl-shrink-0 {
    flex-shrink: 0 !important;
  }

  .flex-xl-shrink-1 {
    flex-shrink: 1 !important;
  }

  .flex-xl-wrap {
    flex-wrap: wrap !important;
  }

  .flex-xl-nowrap {
    flex-wrap: nowrap !important;
  }

  .flex-xl-wrap-reverse {
    flex-wrap: wrap-reverse !important;
  }

  .gap-xl-0 {
    gap: 0 !important;
  }

  .gap-xl-1 {
    gap: 0.25rem !important;
  }

  .gap-xl-2 {
    gap: 0.5rem !important;
  }

  .gap-xl-3 {
    gap: 1rem !important;
  }

  .gap-xl-4 {
    gap: 1.5rem !important;
  }

  .gap-xl-5 {
    gap: 3rem !important;
  }

  .justify-content-xl-start {
    justify-content: flex-start !important;
  }

  .justify-content-xl-end {
    justify-content: flex-end !important;
  }

  .justify-content-xl-center {
    justify-content: center !important;
  }

  .justify-content-xl-between {
    justify-content: space-between !important;
  }

  .justify-content-xl-around {
    justify-content: space-around !important;
  }

  .justify-content-xl-evenly {
    justify-content: space-evenly !important;
  }

  .align-items-xl-start {
    align-items: flex-start !important;
  }

  .align-items-xl-end {
    align-items: flex-end !important;
  }

  .align-items-xl-center {
    align-items: center !important;
  }

  .align-items-xl-baseline {
    align-items: baseline !important;
  }

  .align-items-xl-stretch {
    align-items: stretch !important;
  }

  .align-content-xl-start {
    align-content: flex-start !important;
  }

  .align-content-xl-end {
    align-content: flex-end !important;
  }

  .align-content-xl-center {
    align-content: center !important;
  }

  .align-content-xl-between {
    align-content: space-between !important;
  }

  .align-content-xl-around {
    align-content: space-around !important;
  }

  .align-content-xl-stretch {
    align-content: stretch !important;
  }

  .align-self-xl-auto {
    align-self: auto !important;
  }

  .align-self-xl-start {
    align-self: flex-start !important;
  }

  .align-self-xl-end {
    align-self: flex-end !important;
  }

  .align-self-xl-center {
    align-self: center !important;
  }

  .align-self-xl-baseline {
    align-self: baseline !important;
  }

  .align-self-xl-stretch {
    align-self: stretch !important;
  }

  .order-xl-first {
    order: -1 !important;
  }

  .order-xl-0 {
    order: 0 !important;
  }

  .order-xl-1 {
    order: 1 !important;
  }

  .order-xl-2 {
    order: 2 !important;
  }

  .order-xl-3 {
    order: 3 !important;
  }

  .order-xl-4 {
    order: 4 !important;
  }

  .order-xl-5 {
    order: 5 !important;
  }

  .order-xl-last {
    order: 6 !important;
  }

  .m-xl-0 {
    margin: 0 !important;
  }

  .m-xl-1 {
    margin: 0.25rem !important;
  }

  .m-xl-2 {
    margin: 0.5rem !important;
  }

  .m-xl-3 {
    margin: 1rem !important;
  }

  .m-xl-4 {
    margin: 1.5rem !important;
  }

  .m-xl-5 {
    margin: 3rem !important;
  }

  .m-xl-auto {
    margin: auto !important;
  }

  .mx-xl-0 {
    margin-right: 0 !important;
    margin-left: 0 !important;
  }

  .mx-xl-1 {
    margin-right: 0.25rem !important;
    margin-left: 0.25rem !important;
  }

  .mx-xl-2 {
    margin-right: 0.5rem !important;
    margin-left: 0.5rem !important;
  }

  .mx-xl-3 {
    margin-right: 1rem !important;
    margin-left: 1rem !important;
  }

  .mx-xl-4 {
    margin-right: 1.5rem !important;
    margin-left: 1.5rem !important;
  }

  .mx-xl-5 {
    margin-right: 3rem !important;
    margin-left: 3rem !important;
  }

  .mx-xl-auto {
    margin-right: auto !important;
    margin-left: auto !important;
  }

  .my-xl-0 {
    margin-top: 0 !important;
    margin-bottom: 0 !important;
  }

  .my-xl-1 {
    margin-top: 0.25rem !important;
    margin-bottom: 0.25rem !important;
  }

  .my-xl-2 {
    margin-top: 0.5rem !important;
    margin-bottom: 0.5rem !important;
  }

  .my-xl-3 {
    margin-top: 1rem !important;
    margin-bottom: 1rem !important;
  }

  .my-xl-4 {
    margin-top: 1.5rem !important;
    margin-bottom: 1.5rem !important;
  }

  .my-xl-5 {
    margin-top: 3rem !important;
    margin-bottom: 3rem !important;
  }

  .my-xl-auto {
    margin-top: auto !important;
    margin-bottom: auto !important;
  }

  .mt-xl-0 {
    margin-top: 0 !important;
  }

  .mt-xl-1 {
    margin-top: 0.25rem !important;
  }

  .mt-xl-2 {
    margin-top: 0.5rem !important;
  }

  .mt-xl-3 {
    margin-top: 1rem !important;
  }

  .mt-xl-4 {
    margin-top: 1.5rem !important;
  }

  .mt-xl-5 {
    margin-top: 3rem !important;
  }

  .mt-xl-auto {
    margin-top: auto !important;
  }

  .me-xl-0 {
    margin-right: 0 !important;
  }

  .me-xl-1 {
    margin-right: 0.25rem !important;
  }

  .me-xl-2 {
    margin-right: 0.5rem !important;
  }

  .me-xl-3 {
    margin-right: 1rem !important;
  }

  .me-xl-4 {
    margin-right: 1.5rem !important;
  }

  .me-xl-5 {
    margin-right: 3rem !important;
  }

  .me-xl-auto {
    margin-right: auto !important;
  }

  .mb-xl-0 {
    margin-bottom: 0 !important;
  }

  .mb-xl-1 {
    margin-bottom: 0.25rem !important;
  }

  .mb-xl-2 {
    margin-bottom: 0.5rem !important;
  }

  .mb-xl-3 {
    margin-bottom: 1rem !important;
  }

  .mb-xl-4 {
    margin-bottom: 1.5rem !important;
  }

  .mb-xl-5 {
    margin-bottom: 3rem !important;
  }

  .mb-xl-auto {
    margin-bottom: auto !important;
  }

  .ms-xl-0 {
    margin-left: 0 !important;
  }

  .ms-xl-1 {
    margin-left: 0.25rem !important;
  }

  .ms-xl-2 {
    margin-left: 0.5rem !important;
  }

  .ms-xl-3 {
    margin-left: 1rem !important;
  }

  .ms-xl-4 {
    margin-left: 1.5rem !important;
  }

  .ms-xl-5 {
    margin-left: 3rem !important;
  }

  .ms-xl-auto {
    margin-left: auto !important;
  }

  .p-xl-0 {
    padding: 0 !important;
  }

  .p-xl-1 {
    padding: 0.25rem !important;
  }

  .p-xl-2 {
    padding: 0.5rem !important;
  }

  .p-xl-3 {
    padding: 1rem !important;
  }

  .p-xl-4 {
    padding: 1.5rem !important;
  }

  .p-xl-5 {
    padding: 3rem !important;
  }

  .px-xl-0 {
    padding-right: 0 !important;
    padding-left: 0 !important;
  }

  .px-xl-1 {
    padding-right: 0.25rem !important;
    padding-left: 0.25rem !important;
  }

  .px-xl-2 {
    padding-right: 0.5rem !important;
    padding-left: 0.5rem !important;
  }

  .px-xl-3 {
    padding-right: 1rem !important;
    padding-left: 1rem !important;
  }

  .px-xl-4 {
    padding-right: 1.5rem !important;
    padding-left: 1.5rem !important;
  }

  .px-xl-5 {
    padding-right: 3rem !important;
    padding-left: 3rem !important;
  }

  .py-xl-0 {
    padding-top: 0 !important;
    padding-bottom: 0 !important;
  }

  .py-xl-1 {
    padding-top: 0.25rem !important;
    padding-bottom: 0.25rem !important;
  }

  .py-xl-2 {
    padding-top: 0.5rem !important;
    padding-bottom: 0.5rem !important;
  }

  .py-xl-3 {
    padding-top: 1rem !important;
    padding-bottom: 1rem !important;
  }

  .py-xl-4 {
    padding-top: 1.5rem !important;
    padding-bottom: 1.5rem !important;
  }

  .py-xl-5 {
    padding-top: 3rem !important;
    padding-bottom: 3rem !important;
  }

  .pt-xl-0 {
    padding-top: 0 !important;
  }

  .pt-xl-1 {
    padding-top: 0.25rem !important;
  }

  .pt-xl-2 {
    padding-top: 0.5rem !important;
  }

  .pt-xl-3 {
    padding-top: 1rem !important;
  }

  .pt-xl-4 {
    padding-top: 1.5rem !important;
  }

  .pt-xl-5 {
    padding-top: 3rem !important;
  }

  .pe-xl-0 {
    padding-right: 0 !important;
  }

  .pe-xl-1 {
    padding-right: 0.25rem !important;
  }

  .pe-xl-2 {
    padding-right: 0.5rem !important;
  }

  .pe-xl-3 {
    padding-right: 1rem !important;
  }

  .pe-xl-4 {
    padding-right: 1.5rem !important;
  }

  .pe-xl-5 {
    padding-right: 3rem !important;
  }

  .pb-xl-0 {
    padding-bottom: 0 !important;
  }

  .pb-xl-1 {
    padding-bottom: 0.25rem !important;
  }

  .pb-xl-2 {
    padding-bottom: 0.5rem !important;
  }

  .pb-xl-3 {
    padding-bottom: 1rem !important;
  }

  .pb-xl-4 {
    padding-bottom: 1.5rem !important;
  }

  .pb-xl-5 {
    padding-bottom: 3rem !important;
  }

  .ps-xl-0 {
    padding-left: 0 !important;
  }

  .ps-xl-1 {
    padding-left: 0.25rem !important;
  }

  .ps-xl-2 {
    padding-left: 0.5rem !important;
  }

  .ps-xl-3 {
    padding-left: 1rem !important;
  }

  .ps-xl-4 {
    padding-left: 1.5rem !important;
  }

  .ps-xl-5 {
    padding-left: 3rem !important;
  }

  .text-xl-start {
    text-align: left !important;
  }

  .text-xl-end {
    text-align: right !important;
  }

  .text-xl-center {
    text-align: center !important;
  }
}

@media (min-width: 1400px) {
  .float-xxl-start {
    float: left !important;
  }

  .float-xxl-end {
    float: right !important;
  }

  .float-xxl-none {
    float: none !important;
  }

  .d-xxl-inline {
    display: inline !important;
  }

  .d-xxl-inline-block {
    display: inline-block !important;
  }

  .d-xxl-block {
    display: block !important;
  }

  .d-xxl-grid {
    display: grid !important;
  }

  .d-xxl-table {
    display: table !important;
  }

  .d-xxl-table-row {
    display: table-row !important;
  }

  .d-xxl-table-cell {
    display: table-cell !important;
  }

  .d-xxl-flex {
    display: flex !important;
  }

  .d-xxl-inline-flex {
    display: inline-flex !important;
  }

  .d-xxl-none {
    display: none !important;
  }

  .flex-xxl-fill {
    flex: 1 1 auto !important;
  }

  .flex-xxl-row {
    flex-direction: row !important;
  }

  .flex-xxl-column {
    flex-direction: column !important;
  }

  .flex-xxl-row-reverse {
    flex-direction: row-reverse !important;
  }

  .flex-xxl-column-reverse {
    flex-direction: column-reverse !important;
  }

  .flex-xxl-grow-0 {
    flex-grow: 0 !important;
  }

  .flex-xxl-grow-1 {
    flex-grow: 1 !important;
  }

  .flex-xxl-shrink-0 {
    flex-shrink: 0 !important;
  }

  .flex-xxl-shrink-1 {
    flex-shrink: 1 !important;
  }

  .flex-xxl-wrap {
    flex-wrap: wrap !important;
  }

  .flex-xxl-nowrap {
    flex-wrap: nowrap !important;
  }

  .flex-xxl-wrap-reverse {
    flex-wrap: wrap-reverse !important;
  }

  .gap-xxl-0 {
    gap: 0 !important;
  }

  .gap-xxl-1 {
    gap: 0.25rem !important;
  }

  .gap-xxl-2 {
    gap: 0.5rem !important;
  }

  .gap-xxl-3 {
    gap: 1rem !important;
  }

  .gap-xxl-4 {
    gap: 1.5rem !important;
  }

  .gap-xxl-5 {
    gap: 3rem !important;
  }

  .justify-content-xxl-start {
    justify-content: flex-start !important;
  }

  .justify-content-xxl-end {
    justify-content: flex-end !important;
  }

  .justify-content-xxl-center {
    justify-content: center !important;
  }

  .justify-content-xxl-between {
    justify-content: space-between !important;
  }

  .justify-content-xxl-around {
    justify-content: space-around !important;
  }

  .justify-content-xxl-evenly {
    justify-content: space-evenly !important;
  }

  .align-items-xxl-start {
    align-items: flex-start !important;
  }

  .align-items-xxl-end {
    align-items: flex-end !important;
  }

  .align-items-xxl-center {
    align-items: center !important;
  }

  .align-items-xxl-baseline {
    align-items: baseline !important;
  }

  .align-items-xxl-stretch {
    align-items: stretch !important;
  }

  .align-content-xxl-start {
    align-content: flex-start !important;
  }

  .align-content-xxl-end {
    align-content: flex-end !important;
  }

  .align-content-xxl-center {
    align-content: center !important;
  }

  .align-content-xxl-between {
    align-content: space-between !important;
  }

  .align-content-xxl-around {
    align-content: space-around !important;
  }

  .align-content-xxl-stretch {
    align-content: stretch !important;
  }

  .align-self-xxl-auto {
    align-self: auto !important;
  }

  .align-self-xxl-start {
    align-self: flex-start !important;
  }

  .align-self-xxl-end {
    align-self: flex-end !important;
  }

  .align-self-xxl-center {
    align-self: center !important;
  }

  .align-self-xxl-baseline {
    align-self: baseline !important;
  }

  .align-self-xxl-stretch {
    align-self: stretch !important;
  }

  .order-xxl-first {
    order: -1 !important;
  }

  .order-xxl-0 {
    order: 0 !important;
  }

  .order-xxl-1 {
    order: 1 !important;
  }

  .order-xxl-2 {
    order: 2 !important;
  }

  .order-xxl-3 {
    order: 3 !important;
  }

  .order-xxl-4 {
    order: 4 !important;
  }

  .order-xxl-5 {
    order: 5 !important;
  }

  .order-xxl-last {
    order: 6 !important;
  }

  .m-xxl-0 {
    margin: 0 !important;
  }

  .m-xxl-1 {
    margin: 0.25rem !important;
  }

  .m-xxl-2 {
    margin: 0.5rem !important;
  }

  .m-xxl-3 {
    margin: 1rem !important;
  }

  .m-xxl-4 {
    margin: 1.5rem !important;
  }

  .m-xxl-5 {
    margin: 3rem !important;
  }

  .m-xxl-auto {
    margin: auto !important;
  }

  .mx-xxl-0 {
    margin-right: 0 !important;
    margin-left: 0 !important;
  }

  .mx-xxl-1 {
    margin-right: 0.25rem !important;
    margin-left: 0.25rem !important;
  }

  .mx-xxl-2 {
    margin-right: 0.5rem !important;
    margin-left: 0.5rem !important;
  }

  .mx-xxl-3 {
    margin-right: 1rem !important;
    margin-left: 1rem !important;
  }

  .mx-xxl-4 {
    margin-right: 1.5rem !important;
    margin-left: 1.5rem !important;
  }

  .mx-xxl-5 {
    margin-right: 3rem !important;
    margin-left: 3rem !important;
  }

  .mx-xxl-auto {
    margin-right: auto !important;
    margin-left: auto !important;
  }

  .my-xxl-0 {
    margin-top: 0 !important;
    margin-bottom: 0 !important;
  }

  .my-xxl-1 {
    margin-top: 0.25rem !important;
    margin-bottom: 0.25rem !important;
  }

  .my-xxl-2 {
    margin-top: 0.5rem !important;
    margin-bottom: 0.5rem !important;
  }

  .my-xxl-3 {
    margin-top: 1rem !important;
    margin-bottom: 1rem !important;
  }

  .my-xxl-4 {
    margin-top: 1.5rem !important;
    margin-bottom: 1.5rem !important;
  }

  .my-xxl-5 {
    margin-top: 3rem !important;
    margin-bottom: 3rem !important;
  }

  .my-xxl-auto {
    margin-top: auto !important;
    margin-bottom: auto !important;
  }

  .mt-xxl-0 {
    margin-top: 0 !important;
  }

  .mt-xxl-1 {
    margin-top: 0.25rem !important;
  }

  .mt-xxl-2 {
    margin-top: 0.5rem !important;
  }

  .mt-xxl-3 {
    margin-top: 1rem !important;
  }

  .mt-xxl-4 {
    margin-top: 1.5rem !important;
  }

  .mt-xxl-5 {
    margin-top: 3rem !important;
  }

  .mt-xxl-auto {
    margin-top: auto !important;
  }

  .me-xxl-0 {
    margin-right: 0 !important;
  }

  .me-xxl-1 {
    margin-right: 0.25rem !important;
  }

  .me-xxl-2 {
    margin-right: 0.5rem !important;
  }

  .me-xxl-3 {
    margin-right: 1rem !important;
  }

  .me-xxl-4 {
    margin-right: 1.5rem !important;
  }

  .me-xxl-5 {
    margin-right: 3rem !important;
  }

  .me-xxl-auto {
    margin-right: auto !important;
  }

  .mb-xxl-0 {
    margin-bottom: 0 !important;
  }

  .mb-xxl-1 {
    margin-bottom: 0.25rem !important;
  }

  .mb-xxl-2 {
    margin-bottom: 0.5rem !important;
  }

  .mb-xxl-3 {
    margin-bottom: 1rem !important;
  }

  .mb-xxl-4 {
    margin-bottom: 1.5rem !important;
  }

  .mb-xxl-5 {
    margin-bottom: 3rem !important;
  }

  .mb-xxl-auto {
    margin-bottom: auto !important;
  }

  .ms-xxl-0 {
    margin-left: 0 !important;
  }

  .ms-xxl-1 {
    margin-left: 0.25rem !important;
  }

  .ms-xxl-2 {
    margin-left: 0.5rem !important;
  }

  .ms-xxl-3 {
    margin-left: 1rem !important;
  }

  .ms-xxl-4 {
    margin-left: 1.5rem !important;
  }

  .ms-xxl-5 {
    margin-left: 3rem !important;
  }

  .ms-xxl-auto {
    margin-left: auto !important;
  }

  .p-xxl-0 {
    padding: 0 !important;
  }

  .p-xxl-1 {
    padding: 0.25rem !important;
  }

  .p-xxl-2 {
    padding: 0.5rem !important;
  }

  .p-xxl-3 {
    padding: 1rem !important;
  }

  .p-xxl-4 {
    padding: 1.5rem !important;
  }

  .p-xxl-5 {
    padding: 3rem !important;
  }

  .px-xxl-0 {
    padding-right: 0 !important;
    padding-left: 0 !important;
  }

  .px-xxl-1 {
    padding-right: 0.25rem !important;
    padding-left: 0.25rem !important;
  }

  .px-xxl-2 {
    padding-right: 0.5rem !important;
    padding-left: 0.5rem !important;
  }

  .px-xxl-3 {
    padding-right: 1rem !important;
    padding-left: 1rem !important;
  }

  .px-xxl-4 {
    padding-right: 1.5rem !important;
    padding-left: 1.5rem !important;
  }

  .px-xxl-5 {
    padding-right: 3rem !important;
    padding-left: 3rem !important;
  }

  .py-xxl-0 {
    padding-top: 0 !important;
    padding-bottom: 0 !important;
  }

  .py-xxl-1 {
    padding-top: 0.25rem !important;
    padding-bottom: 0.25rem !important;
  }

  .py-xxl-2 {
    padding-top: 0.5rem !important;
    padding-bottom: 0.5rem !important;
  }

  .py-xxl-3 {
    padding-top: 1rem !important;
    padding-bottom: 1rem !important;
  }

  .py-xxl-4 {
    padding-top: 1.5rem !important;
    padding-bottom: 1.5rem !important;
  }

  .py-xxl-5 {
    padding-top: 3rem !important;
    padding-bottom: 3rem !important;
  }

  .pt-xxl-0 {
    padding-top: 0 !important;
  }

  .pt-xxl-1 {
    padding-top: 0.25rem !important;
  }

  .pt-xxl-2 {
    padding-top: 0.5rem !important;
  }

  .pt-xxl-3 {
    padding-top: 1rem !important;
  }

  .pt-xxl-4 {
    padding-top: 1.5rem !important;
  }

  .pt-xxl-5 {
    padding-top: 3rem !important;
  }

  .pe-xxl-0 {
    padding-right: 0 !important;
  }

  .pe-xxl-1 {
    padding-right: 0.25rem !important;
  }

  .pe-xxl-2 {
    padding-right: 0.5rem !important;
  }

  .pe-xxl-3 {
    padding-right: 1rem !important;
  }

  .pe-xxl-4 {
    padding-right: 1.5rem !important;
  }

  .pe-xxl-5 {
    padding-right: 3rem !important;
  }

  .pb-xxl-0 {
    padding-bottom: 0 !important;
  }

  .pb-xxl-1 {
    padding-bottom: 0.25rem !important;
  }

  .pb-xxl-2 {
    padding-bottom: 0.5rem !important;
  }

  .pb-xxl-3 {
    padding-bottom: 1rem !important;
  }

  .pb-xxl-4 {
    padding-bottom: 1.5rem !important;
  }

  .pb-xxl-5 {
    padding-bottom: 3rem !important;
  }

  .ps-xxl-0 {
    padding-left: 0 !important;
  }

  .ps-xxl-1 {
    padding-left: 0.25rem !important;
  }

  .ps-xxl-2 {
    padding-left: 0.5rem !important;
  }

  .ps-xxl-3 {
    padding-left: 1rem !important;
  }

  .ps-xxl-4 {
    padding-left: 1.5rem !important;
  }

  .ps-xxl-5 {
    padding-left: 3rem !important;
  }

  .text-xxl-start {
    text-align: left !important;
  }

  .text-xxl-end {
    text-align: right !important;
  }

  .text-xxl-center {
    text-align: center !important;
  }
}

@media (min-width: 1200px) {
  .fs-1 {
    font-size: 2.5rem !important;
  }

  .fs-2 {
    font-size: 2rem !important;
  }

  .fs-3 {
    font-size: 1.75rem !important;
  }

  .fs-4 {
    font-size: 1.5rem !important;
  }
}

@media print {
  .d-print-inline {
    display: inline !important;
  }

  .d-print-inline-block {
    display: inline-block !important;
  }

  .d-print-block {
    display: block !important;
  }

  .d-print-grid {
    display: grid !important;
  }

  .d-print-table {
    display: table !important;
  }

  .d-print-table-row {
    display: table-row !important;
  }

  .d-print-table-cell {
    display: table-cell !important;
  }

  .d-print-flex {
    display: flex !important;
  }

  .d-print-inline-flex {
    display: inline-flex !important;
  }

  .d-print-none {
    display: none !important;
  }
}

/*# sourceMappingURL=bootstrap.css.map */
/* //bootstrap */

/* css style */
:root {
  --primary-color: #fbb034;
  --secondary-color: #00a4f5;
  --bg-color: #fff;
  --heading-color: #060606;
  --font-color: #6f6f6f;
  --border-radius: 8px;
  --border-radius-full: 30px;
  --border-color-light: #eee;
  --iframe-filter: grayscale(0%);
  --bg-grey: #f4f4f4;
  --bg-light: #fbfbfb;
  --box-shadow: 0 0.5rem 1rem rgb(12 12 12 / 5%);
  --banner-layer: rgb(255 255 255 / 90%);
  --gradient-color: linear-gradient(to left, #11d5ff 0%, #0089cd 100%);
  --gradient-color-banner: linear-gradient(to left, #00c9f5 0%, #00a4f5 100%);
  --layer: rgb(1 121 179 / 75%);
  --subscribe-footer-input: #fff;
}

[data-theme="dark"] {
  --primary-color: #fbb034;
  --secondary-color: #00a4f5;
  --bg-color: #08171e;
  --heading-color: #fdfffc;
  --font-color: #b7b7b7;
  --border-color-light: rgba(255, 255, 255, 0.2);
  --iframe-filter: grayscale(100%);
  --bg-grey: #040b0e;
  --bg-light: #131917;
  --box-shadow: 0 0.5rem 1rem rgb(5 14 18);
  --banner-layer: rgb(8 23 30 / 85%);
  --subscribe-footer-input: #040b0e;
}

* {
  box-sizing: border-box;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen-Sans, Ubuntu, Cantarell, "Helvetica Neue", sans-serif;
  font-family: 'Ubuntu', sans-serif;
}

.noscroll {
  min-height: 100vh;
  overflow: hidden;
}

html {
  scroll-behavior: smooth;
}

body,
html {
  margin: 0;
  padding: 0;
  background: var(--bg-color);
  color: var(--heading-color);
}

body a,
button,
.btn {
  cursor: pointer !important;
}

a {
  color: var(--heading-color);
  text-decoration: none;
  background-color: transparent;
}

a:hover {
  color: var(--primary-color);
  text-decoration: underline;
}

a,
a:hover,
button,
button:hover {
  text-decoration: none;
  transition: .5s all;
  -moz-transition: .5s all;
}

.clear {
  clear: both;
}

.img-responsive {
  max-width: 100%;
  display: block;
  width: 100%;
}

.d-grid {
  display: grid;
}

button,
input,
select,
label,
li,
span {
  -webkit-appearance: none;
  outline: none;
}

a,
a:hover,
button,
button:hover {
  text-decoration: none;
  transition: .5s all;
  -moz-transition: .5s all;
}

iframe {
  border: none;
  display: block;
}

ul {
  margin: 0;
  padding: 0;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  margin: 0;
  padding: 0;
  color: var(--heading-color);
}

p {
  margin: 0;
  padding: 0;
  font-size: 16px;
  line-height: 28px;
  color: var(--heading-color);
}

li {
  list-style-type: none;
}

.radius-image {
  border-radius: var(--border-radius);
}

.radius-image-full {
  border-radius: var(--border-radius-full);
}

/* container */
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}

@media (min-width: 992px) {
  .container {
    max-width: 960px;
    margin-right: auto;
    margin-left: auto;
  }
}

@media (min-width: 1200px) {
  .container {
    max-width: 1140px;
    margin-right: auto;
    margin-left: auto;
  }
}

@media (min-width: 1280px) {
  .container {
    max-width: 1200px;
  }
}

/* //container */

/* toggle switch */
.theme-switch-wrapper {
  display: flex;
  align-items: center;
}

.theme-switch-wrapper em {
  margin-left: 10px;
  font-size: 1rem;
}

.theme-switch {
  display: inline-block;
  position: relative;
  margin: 0;
}

.theme-switch input {
  display: none;
}

/* //toggle switch */
/* //css style */

/* font awesome css */
/*!
 * Font Awesome Free 5.15.2 by @fontawesome - https://fontawesome.com
 * License - https://fontawesome.com/license/free (Icons: CC BY 4.0, Fonts: SIL OFL 1.1, Code: MIT License)
 */
.fa,
.fas,
.far,
.fal,
.fad,
.fab {
  -moz-osx-font-smoothing: grayscale;
  -webkit-font-smoothing: antialiased;
  display: inline-block;
  font-style: normal;
  font-variant: normal;
  text-rendering: auto;
  line-height: 1;
}

.fa-lg {
  font-size: 1.33333em;
  line-height: 0.75em;
  vertical-align: -.0667em;
}

.fa-xs {
  font-size: .75em;
}

.fa-sm {
  font-size: .875em;
}

.fa-1x {
  font-size: 1em;
}

.fa-2x {
  font-size: 2em;
}

.fa-3x {
  font-size: 3em;
}

.fa-4x {
  font-size: 4em;
}

.fa-5x {
  font-size: 5em;
}

.fa-6x {
  font-size: 6em;
}

.fa-7x {
  font-size: 7em;
}

.fa-8x {
  font-size: 8em;
}

.fa-9x {
  font-size: 9em;
}

.fa-10x {
  font-size: 10em;
}

.fa-fw {
  text-align: center;
  width: 1.25em;
}

.fa-ul {
  list-style-type: none;
  margin-left: 2.5em;
  padding-left: 0;
}

.fa-ul>li {
  position: relative;
}

.fa-li {
  left: -2em;
  position: absolute;
  text-align: center;
  width: 2em;
  line-height: inherit;
}

.fa-border {
  border: solid 0.08em #eee;
  border-radius: .1em;
  padding: .2em .25em .15em;
}

.fa-pull-left {
  float: left;
}

.fa-pull-right {
  float: right;
}

.fa.fa-pull-left,
.fas.fa-pull-left,
.far.fa-pull-left,
.fal.fa-pull-left,
.fab.fa-pull-left {
  margin-right: .3em;
}

.fa.fa-pull-right,
.fas.fa-pull-right,
.far.fa-pull-right,
.fal.fa-pull-right,
.fab.fa-pull-right {
  margin-left: .3em;
}

.fa-spin {
  -webkit-animation: fa-spin 2s infinite linear;
  animation: fa-spin 2s infinite linear;
}

.fa-pulse {
  -webkit-animation: fa-spin 1s infinite steps(8);
  animation: fa-spin 1s infinite steps(8);
}

@-webkit-keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
    transform: rotate(0deg);
  }

  100% {
    -webkit-transform: rotate(360deg);
    transform: rotate(360deg);
  }
}

@keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
    transform: rotate(0deg);
  }

  100% {
    -webkit-transform: rotate(360deg);
    transform: rotate(360deg);
  }
}

.fa-rotate-90 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=1)";
  -webkit-transform: rotate(90deg);
  transform: rotate(90deg);
}

.fa-rotate-180 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2)";
  -webkit-transform: rotate(180deg);
  transform: rotate(180deg);
}

.fa-rotate-270 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=3)";
  -webkit-transform: rotate(270deg);
  transform: rotate(270deg);
}

.fa-flip-horizontal {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=0, mirror=1)";
  -webkit-transform: scale(-1, 1);
  transform: scale(-1, 1);
}

.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(1, -1);
  transform: scale(1, -1);
}

.fa-flip-both,
.fa-flip-horizontal.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(-1, -1);
  transform: scale(-1, -1);
}

:root .fa-rotate-90,
:root .fa-rotate-180,
:root .fa-rotate-270,
:root .fa-flip-horizontal,
:root .fa-flip-vertical,
:root .fa-flip-both {
  -webkit-filter: none;
  filter: none;
}

.fa-stack {
  display: inline-block;
  height: 2em;
  line-height: 2em;
  position: relative;
  vertical-align: middle;
  width: 2.5em;
}

.fa-stack-1x,
.fa-stack-2x {
  left: 0;
  position: absolute;
  text-align: center;
  width: 100%;
}

.fa-stack-1x {
  line-height: inherit;
}

.fa-stack-2x {
  font-size: 2em;
}

.fa-inverse {
  color: #fff;
}

/* Font Awesome uses the Unicode Private Use Area (PUA) to ensure screen
  readers do not read off random characters that represent icons */
.fa-500px:before {
  content: "\f26e";
}

.fa-accessible-icon:before {
  content: "\f368";
}

.fa-accusoft:before {
  content: "\f369";
}

.fa-acquisitions-incorporated:before {
  content: "\f6af";
}

.fa-ad:before {
  content: "\f641";
}

.fa-address-book:before {
  content: "\f2b9";
}

.fa-address-card:before {
  content: "\f2bb";
}

.fa-adjust:before {
  content: "\f042";
}

.fa-adn:before {
  content: "\f170";
}

.fa-adversal:before {
  content: "\f36a";
}

.fa-affiliatetheme:before {
  content: "\f36b";
}

.fa-air-freshener:before {
  content: "\f5d0";
}

.fa-airbnb:before {
  content: "\f834";
}

.fa-algolia:before {
  content: "\f36c";
}

.fa-align-center:before {
  content: "\f037";
}

.fa-align-justify:before {
  content: "\f039";
}

.fa-align-left:before {
  content: "\f036";
}

.fa-align-right:before {
  content: "\f038";
}

.fa-alipay:before {
  content: "\f642";
}

.fa-allergies:before {
  content: "\f461";
}

.fa-amazon:before {
  content: "\f270";
}

.fa-amazon-pay:before {
  content: "\f42c";
}

.fa-ambulance:before {
  content: "\f0f9";
}

.fa-american-sign-language-interpreting:before {
  content: "\f2a3";
}

.fa-amilia:before {
  content: "\f36d";
}

.fa-anchor:before {
  content: "\f13d";
}

.fa-android:before {
  content: "\f17b";
}

.fa-angellist:before {
  content: "\f209";
}

.fa-angle-double-down:before {
  content: "\f103";
}

.fa-angle-double-left:before {
  content: "\f100";
}

.fa-angle-double-right:before {
  content: "\f101";
}

.fa-angle-double-up:before {
  content: "\f102";
}

.fa-angle-down:before {
  content: "\f107";
}

.fa-angle-left:before {
  content: "\f104";
}

.fa-angle-right:before {
  content: "\f105";
}

.fa-angle-up:before {
  content: "\f106";
}

.fa-angry:before {
  content: "\f556";
}

.fa-angrycreative:before {
  content: "\f36e";
}

.fa-angular:before {
  content: "\f420";
}

.fa-ankh:before {
  content: "\f644";
}

.fa-app-store:before {
  content: "\f36f";
}

.fa-app-store-ios:before {
  content: "\f370";
}

.fa-apper:before {
  content: "\f371";
}

.fa-apple:before {
  content: "\f179";
}

.fa-apple-alt:before {
  content: "\f5d1";
}

.fa-apple-pay:before {
  content: "\f415";
}

.fa-archive:before {
  content: "\f187";
}

.fa-archway:before {
  content: "\f557";
}

.fa-arrow-alt-circle-down:before {
  content: "\f358";
}

.fa-arrow-alt-circle-left:before {
  content: "\f359";
}

.fa-arrow-alt-circle-right:before {
  content: "\f35a";
}

.fa-arrow-alt-circle-up:before {
  content: "\f35b";
}

.fa-arrow-circle-down:before {
  content: "\f0ab";
}

.fa-arrow-circle-left:before {
  content: "\f0a8";
}

.fa-arrow-circle-right:before {
  content: "\f0a9";
}

.fa-arrow-circle-up:before {
  content: "\f0aa";
}

.fa-arrow-down:before {
  content: "\f063";
}

.fa-arrow-left:before {
  content: "\f060";
}

.fa-arrow-right:before {
  content: "\f061";
}

.fa-arrow-up:before {
  content: "\f062";
}

.fa-arrows-alt:before {
  content: "\f0b2";
}

.fa-arrows-alt-h:before {
  content: "\f337";
}

.fa-arrows-alt-v:before {
  content: "\f338";
}

.fa-artstation:before {
  content: "\f77a";
}

.fa-assistive-listening-systems:before {
  content: "\f2a2";
}

.fa-asterisk:before {
  content: "\f069";
}

.fa-asymmetrik:before {
  content: "\f372";
}

.fa-at:before {
  content: "\f1fa";
}

.fa-atlas:before {
  content: "\f558";
}

.fa-atlassian:before {
  content: "\f77b";
}

.fa-atom:before {
  content: "\f5d2";
}

.fa-audible:before {
  content: "\f373";
}

.fa-audio-description:before {
  content: "\f29e";
}

.fa-autoprefixer:before {
  content: "\f41c";
}

.fa-avianex:before {
  content: "\f374";
}

.fa-aviato:before {
  content: "\f421";
}

.fa-award:before {
  content: "\f559";
}

.fa-aws:before {
  content: "\f375";
}

.fa-baby:before {
  content: "\f77c";
}

.fa-baby-carriage:before {
  content: "\f77d";
}

.fa-backspace:before {
  content: "\f55a";
}

.fa-backward:before {
  content: "\f04a";
}

.fa-bacon:before {
  content: "\f7e5";
}

.fa-bacteria:before {
  content: "\e059";
}

.fa-bacterium:before {
  content: "\e05a";
}

.fa-bahai:before {
  content: "\f666";
}

.fa-balance-scale:before {
  content: "\f24e";
}

.fa-balance-scale-left:before {
  content: "\f515";
}

.fa-balance-scale-right:before {
  content: "\f516";
}

.fa-ban:before {
  content: "\f05e";
}

.fa-band-aid:before {
  content: "\f462";
}

.fa-bandcamp:before {
  content: "\f2d5";
}

.fa-barcode:before {
  content: "\f02a";
}

.fa-bars:before {
  content: "\f0c9";
}

.fa-baseball-ball:before {
  content: "\f433";
}

.fa-basketball-ball:before {
  content: "\f434";
}

.fa-bath:before {
  content: "\f2cd";
}

.fa-battery-empty:before {
  content: "\f244";
}

.fa-battery-full:before {
  content: "\f240";
}

.fa-battery-half:before {
  content: "\f242";
}

.fa-battery-quarter:before {
  content: "\f243";
}

.fa-battery-three-quarters:before {
  content: "\f241";
}

.fa-battle-net:before {
  content: "\f835";
}

.fa-bed:before {
  content: "\f236";
}

.fa-beer:before {
  content: "\f0fc";
}

.fa-behance:before {
  content: "\f1b4";
}

.fa-behance-square:before {
  content: "\f1b5";
}

.fa-bell:before {
  content: "\f0f3";
}

.fa-bell-slash:before {
  content: "\f1f6";
}

.fa-bezier-curve:before {
  content: "\f55b";
}

.fa-bible:before {
  content: "\f647";
}

.fa-bicycle:before {
  content: "\f206";
}

.fa-biking:before {
  content: "\f84a";
}

.fa-bimobject:before {
  content: "\f378";
}

.fa-binoculars:before {
  content: "\f1e5";
}

.fa-biohazard:before {
  content: "\f780";
}

.fa-birthday-cake:before {
  content: "\f1fd";
}

.fa-bitbucket:before {
  content: "\f171";
}

.fa-bitcoin:before {
  content: "\f379";
}

.fa-bity:before {
  content: "\f37a";
}

.fa-black-tie:before {
  content: "\f27e";
}

.fa-blackberry:before {
  content: "\f37b";
}

.fa-blender:before {
  content: "\f517";
}

.fa-blender-phone:before {
  content: "\f6b6";
}

.fa-blind:before {
  content: "\f29d";
}

.fa-blog:before {
  content: "\f781";
}

.fa-blogger:before {
  content: "\f37c";
}

.fa-blogger-b:before {
  content: "\f37d";
}

.fa-bluetooth:before {
  content: "\f293";
}

.fa-bluetooth-b:before {
  content: "\f294";
}

.fa-bold:before {
  content: "\f032";
}

.fa-bolt:before {
  content: "\f0e7";
}

.fa-bomb:before {
  content: "\f1e2";
}

.fa-bone:before {
  content: "\f5d7";
}

.fa-bong:before {
  content: "\f55c";
}

.fa-book:before {
  content: "\f02d";
}

.fa-book-dead:before {
  content: "\f6b7";
}

.fa-book-medical:before {
  content: "\f7e6";
}

.fa-book-open:before {
  content: "\f518";
}

.fa-book-reader:before {
  content: "\f5da";
}

.fa-bookmark:before {
  content: "\f02e";
}

.fa-bootstrap:before {
  content: "\f836";
}

.fa-border-all:before {
  content: "\f84c";
}

.fa-border-none:before {
  content: "\f850";
}

.fa-border-style:before {
  content: "\f853";
}

.fa-bowling-ball:before {
  content: "\f436";
}

.fa-box:before {
  content: "\f466";
}

.fa-box-open:before {
  content: "\f49e";
}

.fa-box-tissue:before {
  content: "\e05b";
}

.fa-boxes:before {
  content: "\f468";
}

.fa-braille:before {
  content: "\f2a1";
}

.fa-brain:before {
  content: "\f5dc";
}

.fa-bread-slice:before {
  content: "\f7ec";
}

.fa-briefcase:before {
  content: "\f0b1";
}

.fa-briefcase-medical:before {
  content: "\f469";
}

.fa-broadcast-tower:before {
  content: "\f519";
}

.fa-broom:before {
  content: "\f51a";
}

.fa-brush:before {
  content: "\f55d";
}

.fa-btc:before {
  content: "\f15a";
}

.fa-buffer:before {
  content: "\f837";
}

.fa-bug:before {
  content: "\f188";
}

.fa-building:before {
  content: "\f1ad";
}

.fa-bullhorn:before {
  content: "\f0a1";
}

.fa-bullseye:before {
  content: "\f140";
}

.fa-burn:before {
  content: "\f46a";
}

.fa-buromobelexperte:before {
  content: "\f37f";
}

.fa-bus:before {
  content: "\f207";
}

.fa-bus-alt:before {
  content: "\f55e";
}

.fa-business-time:before {
  content: "\f64a";
}

.fa-buy-n-large:before {
  content: "\f8a6";
}

.fa-buysellads:before {
  content: "\f20d";
}

.fa-calculator:before {
  content: "\f1ec";
}

.fa-calendar:before {
  content: "\f133";
}

.fa-calendar-alt:before {
  content: "\f073";
}

.fa-calendar-check:before {
  content: "\f274";
}

.fa-calendar-day:before {
  content: "\f783";
}

.fa-calendar-minus:before {
  content: "\f272";
}

.fa-calendar-plus:before {
  content: "\f271";
}

.fa-calendar-times:before {
  content: "\f273";
}

.fa-calendar-week:before {
  content: "\f784";
}

.fa-camera:before {
  content: "\f030";
}

.fa-camera-retro:before {
  content: "\f083";
}

.fa-campground:before {
  content: "\f6bb";
}

.fa-canadian-maple-leaf:before {
  content: "\f785";
}

.fa-candy-cane:before {
  content: "\f786";
}

.fa-cannabis:before {
  content: "\f55f";
}

.fa-capsules:before {
  content: "\f46b";
}

.fa-car:before {
  content: "\f1b9";
}

.fa-car-alt:before {
  content: "\f5de";
}

.fa-car-battery:before {
  content: "\f5df";
}

.fa-car-crash:before {
  content: "\f5e1";
}

.fa-car-side:before {
  content: "\f5e4";
}

.fa-caravan:before {
  content: "\f8ff";
}

.fa-caret-down:before {
  content: "\f0d7";
}

.fa-caret-left:before {
  content: "\f0d9";
}

.fa-caret-right:before {
  content: "\f0da";
}

.fa-caret-square-down:before {
  content: "\f150";
}

.fa-caret-square-left:before {
  content: "\f191";
}

.fa-caret-square-right:before {
  content: "\f152";
}

.fa-caret-square-up:before {
  content: "\f151";
}

.fa-caret-up:before {
  content: "\f0d8";
}

.fa-carrot:before {
  content: "\f787";
}

.fa-cart-arrow-down:before {
  content: "\f218";
}

.fa-cart-plus:before {
  content: "\f217";
}

.fa-cash-register:before {
  content: "\f788";
}

.fa-cat:before {
  content: "\f6be";
}

.fa-cc-amazon-pay:before {
  content: "\f42d";
}

.fa-cc-amex:before {
  content: "\f1f3";
}

.fa-cc-apple-pay:before {
  content: "\f416";
}

.fa-cc-diners-club:before {
  content: "\f24c";
}

.fa-cc-discover:before {
  content: "\f1f2";
}

.fa-cc-jcb:before {
  content: "\f24b";
}

.fa-cc-mastercard:before {
  content: "\f1f1";
}

.fa-cc-paypal:before {
  content: "\f1f4";
}

.fa-cc-stripe:before {
  content: "\f1f5";
}

.fa-cc-visa:before {
  content: "\f1f0";
}

.fa-centercode:before {
  content: "\f380";
}

.fa-centos:before {
  content: "\f789";
}

.fa-certificate:before {
  content: "\f0a3";
}

.fa-chair:before {
  content: "\f6c0";
}

.fa-chalkboard:before {
  content: "\f51b";
}

.fa-chalkboard-teacher:before {
  content: "\f51c";
}

.fa-charging-station:before {
  content: "\f5e7";
}

.fa-chart-area:before {
  content: "\f1fe";
}

.fa-chart-bar:before {
  content: "\f080";
}

.fa-chart-line:before {
  content: "\f201";
}

.fa-chart-pie:before {
  content: "\f200";
}

.fa-check:before {
  content: "\f00c";
}

.fa-check-circle:before {
  content: "\f058";
}

.fa-check-double:before {
  content: "\f560";
}

.fa-check-square:before {
  content: "\f14a";
}

.fa-cheese:before {
  content: "\f7ef";
}

.fa-chess:before {
  content: "\f439";
}

.fa-chess-bishop:before {
  content: "\f43a";
}

.fa-chess-board:before {
  content: "\f43c";
}

.fa-chess-king:before {
  content: "\f43f";
}

.fa-chess-knight:before {
  content: "\f441";
}

.fa-chess-pawn:before {
  content: "\f443";
}

.fa-chess-queen:before {
  content: "\f445";
}

.fa-chess-rook:before {
  content: "\f447";
}

.fa-chevron-circle-down:before {
  content: "\f13a";
}

.fa-chevron-circle-left:before {
  content: "\f137";
}

.fa-chevron-circle-right:before {
  content: "\f138";
}

.fa-chevron-circle-up:before {
  content: "\f139";
}

.fa-chevron-down:before {
  content: "\f078";
}

.fa-chevron-left:before {
  content: "\f053";
}

.fa-chevron-right:before {
  content: "\f054";
}

.fa-chevron-up:before {
  content: "\f077";
}

.fa-child:before {
  content: "\f1ae";
}

.fa-chrome:before {
  content: "\f268";
}

.fa-chromecast:before {
  content: "\f838";
}

.fa-church:before {
  content: "\f51d";
}

.fa-circle:before {
  content: "\f111";
}

.fa-circle-notch:before {
  content: "\f1ce";
}

.fa-city:before {
  content: "\f64f";
}

.fa-clinic-medical:before {
  content: "\f7f2";
}

.fa-clipboard:before {
  content: "\f328";
}

.fa-clipboard-check:before {
  content: "\f46c";
}

.fa-clipboard-list:before {
  content: "\f46d";
}

.fa-clock:before {
  content: "\f017";
}

.fa-clone:before {
  content: "\f24d";
}

.fa-closed-captioning:before {
  content: "\f20a";
}

.fa-cloud:before {
  content: "\f0c2";
}

.fa-cloud-download-alt:before {
  content: "\f381";
}

.fa-cloud-meatball:before {
  content: "\f73b";
}

.fa-cloud-moon:before {
  content: "\f6c3";
}

.fa-cloud-moon-rain:before {
  content: "\f73c";
}

.fa-cloud-rain:before {
  content: "\f73d";
}

.fa-cloud-showers-heavy:before {
  content: "\f740";
}

.fa-cloud-sun:before {
  content: "\f6c4";
}

.fa-cloud-sun-rain:before {
  content: "\f743";
}

.fa-cloud-upload-alt:before {
  content: "\f382";
}

.fa-cloudflare:before {
  content: "\e07d";
}

.fa-cloudscale:before {
  content: "\f383";
}

.fa-cloudsmith:before {
  content: "\f384";
}

.fa-cloudversify:before {
  content: "\f385";
}

.fa-cocktail:before {
  content: "\f561";
}

.fa-code:before {
  content: "\f121";
}

.fa-code-branch:before {
  content: "\f126";
}

.fa-codepen:before {
  content: "\f1cb";
}

.fa-codiepie:before {
  content: "\f284";
}

.fa-coffee:before {
  content: "\f0f4";
}

.fa-cog:before {
  content: "\f013";
}

.fa-cogs:before {
  content: "\f085";
}

.fa-coins:before {
  content: "\f51e";
}

.fa-columns:before {
  content: "\f0db";
}

.fa-comment:before {
  content: "\f075";
}

.fa-comment-alt:before {
  content: "\f27a";
}

.fa-comment-dollar:before {
  content: "\f651";
}

.fa-comment-dots:before {
  content: "\f4ad";
}

.fa-comment-medical:before {
  content: "\f7f5";
}

.fa-comment-slash:before {
  content: "\f4b3";
}

.fa-comments:before {
  content: "\f086";
}

.fa-comments-dollar:before {
  content: "\f653";
}

.fa-compact-disc:before {
  content: "\f51f";
}

.fa-compass:before {
  content: "\f14e";
}

.fa-compress:before {
  content: "\f066";
}

.fa-compress-alt:before {
  content: "\f422";
}

.fa-compress-arrows-alt:before {
  content: "\f78c";
}

.fa-concierge-bell:before {
  content: "\f562";
}

.fa-confluence:before {
  content: "\f78d";
}

.fa-connectdevelop:before {
  content: "\f20e";
}

.fa-contao:before {
  content: "\f26d";
}

.fa-cookie:before {
  content: "\f563";
}

.fa-cookie-bite:before {
  content: "\f564";
}

.fa-copy:before {
  content: "\f0c5";
}

.fa-copyright:before {
  content: "\f1f9";
}

.fa-cotton-bureau:before {
  content: "\f89e";
}

.fa-couch:before {
  content: "\f4b8";
}

.fa-cpanel:before {
  content: "\f388";
}

.fa-creative-commons:before {
  content: "\f25e";
}

.fa-creative-commons-by:before {
  content: "\f4e7";
}

.fa-creative-commons-nc:before {
  content: "\f4e8";
}

.fa-creative-commons-nc-eu:before {
  content: "\f4e9";
}

.fa-creative-commons-nc-jp:before {
  content: "\f4ea";
}

.fa-creative-commons-nd:before {
  content: "\f4eb";
}

.fa-creative-commons-pd:before {
  content: "\f4ec";
}

.fa-creative-commons-pd-alt:before {
  content: "\f4ed";
}

.fa-creative-commons-remix:before {
  content: "\f4ee";
}

.fa-creative-commons-sa:before {
  content: "\f4ef";
}

.fa-creative-commons-sampling:before {
  content: "\f4f0";
}

.fa-creative-commons-sampling-plus:before {
  content: "\f4f1";
}

.fa-creative-commons-share:before {
  content: "\f4f2";
}

.fa-creative-commons-zero:before {
  content: "\f4f3";
}

.fa-credit-card:before {
  content: "\f09d";
}

.fa-critical-role:before {
  content: "\f6c9";
}

.fa-crop:before {
  content: "\f125";
}

.fa-crop-alt:before {
  content: "\f565";
}

.fa-cross:before {
  content: "\f654";
}

.fa-crosshairs:before {
  content: "\f05b";
}

.fa-crow:before {
  content: "\f520";
}

.fa-crown:before {
  content: "\f521";
}

.fa-crutch:before {
  content: "\f7f7";
}

.fa-css3:before {
  content: "\f13c";
}

.fa-css3-alt:before {
  content: "\f38b";
}

.fa-cube:before {
  content: "\f1b2";
}

.fa-cubes:before {
  content: "\f1b3";
}

.fa-cut:before {
  content: "\f0c4";
}

.fa-cuttlefish:before {
  content: "\f38c";
}

.fa-d-and-d:before {
  content: "\f38d";
}

.fa-d-and-d-beyond:before {
  content: "\f6ca";
}

.fa-dailymotion:before {
  content: "\e052";
}

.fa-dashcube:before {
  content: "\f210";
}

.fa-database:before {
  content: "\f1c0";
}

.fa-deaf:before {
  content: "\f2a4";
}

.fa-deezer:before {
  content: "\e077";
}

.fa-delicious:before {
  content: "\f1a5";
}

.fa-democrat:before {
  content: "\f747";
}

.fa-deploydog:before {
  content: "\f38e";
}

.fa-deskpro:before {
  content: "\f38f";
}

.fa-desktop:before {
  content: "\f108";
}

.fa-dev:before {
  content: "\f6cc";
}

.fa-deviantart:before {
  content: "\f1bd";
}

.fa-dharmachakra:before {
  content: "\f655";
}

.fa-dhl:before {
  content: "\f790";
}

.fa-diagnoses:before {
  content: "\f470";
}

.fa-diaspora:before {
  content: "\f791";
}

.fa-dice:before {
  content: "\f522";
}

.fa-dice-d20:before {
  content: "\f6cf";
}

.fa-dice-d6:before {
  content: "\f6d1";
}

.fa-dice-five:before {
  content: "\f523";
}

.fa-dice-four:before {
  content: "\f524";
}

.fa-dice-one:before {
  content: "\f525";
}

.fa-dice-six:before {
  content: "\f526";
}

.fa-dice-three:before {
  content: "\f527";
}

.fa-dice-two:before {
  content: "\f528";
}

.fa-digg:before {
  content: "\f1a6";
}

.fa-digital-ocean:before {
  content: "\f391";
}

.fa-digital-tachograph:before {
  content: "\f566";
}

.fa-directions:before {
  content: "\f5eb";
}

.fa-discord:before {
  content: "\f392";
}

.fa-discourse:before {
  content: "\f393";
}

.fa-disease:before {
  content: "\f7fa";
}

.fa-divide:before {
  content: "\f529";
}

.fa-dizzy:before {
  content: "\f567";
}

.fa-dna:before {
  content: "\f471";
}

.fa-dochub:before {
  content: "\f394";
}

.fa-docker:before {
  content: "\f395";
}

.fa-dog:before {
  content: "\f6d3";
}

.fa-dollar-sign:before {
  content: "\f155";
}

.fa-dolly:before {
  content: "\f472";
}

.fa-dolly-flatbed:before {
  content: "\f474";
}

.fa-donate:before {
  content: "\f4b9";
}

.fa-door-closed:before {
  content: "\f52a";
}

.fa-door-open:before {
  content: "\f52b";
}

.fa-dot-circle:before {
  content: "\f192";
}

.fa-dove:before {
  content: "\f4ba";
}

.fa-download:before {
  content: "\f019";
}

.fa-draft2digital:before {
  content: "\f396";
}

.fa-drafting-compass:before {
  content: "\f568";
}

.fa-dragon:before {
  content: "\f6d5";
}

.fa-draw-polygon:before {
  content: "\f5ee";
}

.fa-dribbble:before {
  content: "\f17d";
}

.fa-dribbble-square:before {
  content: "\f397";
}

.fa-dropbox:before {
  content: "\f16b";
}

.fa-drum:before {
  content: "\f569";
}

.fa-drum-steelpan:before {
  content: "\f56a";
}

.fa-drumstick-bite:before {
  content: "\f6d7";
}

.fa-drupal:before {
  content: "\f1a9";
}

.fa-dumbbell:before {
  content: "\f44b";
}

.fa-dumpster:before {
  content: "\f793";
}

.fa-dumpster-fire:before {
  content: "\f794";
}

.fa-dungeon:before {
  content: "\f6d9";
}

.fa-dyalog:before {
  content: "\f399";
}

.fa-earlybirds:before {
  content: "\f39a";
}

.fa-ebay:before {
  content: "\f4f4";
}

.fa-edge:before {
  content: "\f282";
}

.fa-edge-legacy:before {
  content: "\e078";
}

.fa-edit:before {
  content: "\f044";
}

.fa-egg:before {
  content: "\f7fb";
}

.fa-eject:before {
  content: "\f052";
}

.fa-elementor:before {
  content: "\f430";
}

.fa-ellipsis-h:before {
  content: "\f141";
}

.fa-ellipsis-v:before {
  content: "\f142";
}

.fa-ello:before {
  content: "\f5f1";
}

.fa-ember:before {
  content: "\f423";
}

.fa-empire:before {
  content: "\f1d1";
}

.fa-envelope:before {
  content: "\f0e0";
}

.fa-envelope-open:before {
  content: "\f2b6";
}

.fa-envelope-open-text:before {
  content: "\f658";
}

.fa-envelope-square:before {
  content: "\f199";
}

.fa-envira:before {
  content: "\f299";
}

.fa-equals:before {
  content: "\f52c";
}

.fa-eraser:before {
  content: "\f12d";
}

.fa-erlang:before {
  content: "\f39d";
}

.fa-ethereum:before {
  content: "\f42e";
}

.fa-ethernet:before {
  content: "\f796";
}

.fa-etsy:before {
  content: "\f2d7";
}

.fa-euro-sign:before {
  content: "\f153";
}

.fa-evernote:before {
  content: "\f839";
}

.fa-exchange-alt:before {
  content: "\f362";
}

.fa-exclamation:before {
  content: "\f12a";
}

.fa-exclamation-circle:before {
  content: "\f06a";
}

.fa-exclamation-triangle:before {
  content: "\f071";
}

.fa-expand:before {
  content: "\f065";
}

.fa-expand-alt:before {
  content: "\f424";
}

.fa-expand-arrows-alt:before {
  content: "\f31e";
}

.fa-expeditedssl:before {
  content: "\f23e";
}

.fa-external-link-alt:before {
  content: "\f35d";
}

.fa-external-link-square-alt:before {
  content: "\f360";
}

.fa-eye:before {
  content: "\f06e";
}

.fa-eye-dropper:before {
  content: "\f1fb";
}

.fa-eye-slash:before {
  content: "\f070";
}

.fa-facebook:before {
  content: "\f09a";
}

.fa-facebook-f:before {
  content: "\f39e";
}

.fa-facebook-messenger:before {
  content: "\f39f";
}

.fa-facebook-square:before {
  content: "\f082";
}

.fa-fan:before {
  content: "\f863";
}

.fa-fantasy-flight-games:before {
  content: "\f6dc";
}

.fa-fast-backward:before {
  content: "\f049";
}

.fa-fast-forward:before {
  content: "\f050";
}

.fa-faucet:before {
  content: "\e005";
}

.fa-fax:before {
  content: "\f1ac";
}

.fa-feather:before {
  content: "\f52d";
}

.fa-feather-alt:before {
  content: "\f56b";
}

.fa-fedex:before {
  content: "\f797";
}

.fa-fedora:before {
  content: "\f798";
}

.fa-female:before {
  content: "\f182";
}

.fa-fighter-jet:before {
  content: "\f0fb";
}

.fa-figma:before {
  content: "\f799";
}

.fa-file:before {
  content: "\f15b";
}

.fa-file-alt:before {
  content: "\f15c";
}

.fa-file-archive:before {
  content: "\f1c6";
}

.fa-file-audio:before {
  content: "\f1c7";
}

.fa-file-code:before {
  content: "\f1c9";
}

.fa-file-contract:before {
  content: "\f56c";
}

.fa-file-csv:before {
  content: "\f6dd";
}

.fa-file-download:before {
  content: "\f56d";
}

.fa-file-excel:before {
  content: "\f1c3";
}

.fa-file-export:before {
  content: "\f56e";
}

.fa-file-image:before {
  content: "\f1c5";
}

.fa-file-import:before {
  content: "\f56f";
}

.fa-file-invoice:before {
  content: "\f570";
}

.fa-file-invoice-dollar:before {
  content: "\f571";
}

.fa-file-medical:before {
  content: "\f477";
}

.fa-file-medical-alt:before {
  content: "\f478";
}

.fa-file-pdf:before {
  content: "\f1c1";
}

.fa-file-powerpoint:before {
  content: "\f1c4";
}

.fa-file-prescription:before {
  content: "\f572";
}

.fa-file-signature:before {
  content: "\f573";
}

.fa-file-upload:before {
  content: "\f574";
}

.fa-file-video:before {
  content: "\f1c8";
}

.fa-file-word:before {
  content: "\f1c2";
}

.fa-fill:before {
  content: "\f575";
}

.fa-fill-drip:before {
  content: "\f576";
}

.fa-film:before {
  content: "\f008";
}

.fa-filter:before {
  content: "\f0b0";
}

.fa-fingerprint:before {
  content: "\f577";
}

.fa-fire:before {
  content: "\f06d";
}

.fa-fire-alt:before {
  content: "\f7e4";
}

.fa-fire-extinguisher:before {
  content: "\f134";
}

.fa-firefox:before {
  content: "\f269";
}

.fa-firefox-browser:before {
  content: "\e007";
}

.fa-first-aid:before {
  content: "\f479";
}

.fa-first-order:before {
  content: "\f2b0";
}

.fa-first-order-alt:before {
  content: "\f50a";
}

.fa-firstdraft:before {
  content: "\f3a1";
}

.fa-fish:before {
  content: "\f578";
}

.fa-fist-raised:before {
  content: "\f6de";
}

.fa-flag:before {
  content: "\f024";
}

.fa-flag-checkered:before {
  content: "\f11e";
}

.fa-flag-usa:before {
  content: "\f74d";
}

.fa-flask:before {
  content: "\f0c3";
}

.fa-flickr:before {
  content: "\f16e";
}

.fa-flipboard:before {
  content: "\f44d";
}

.fa-flushed:before {
  content: "\f579";
}

.fa-fly:before {
  content: "\f417";
}

.fa-folder:before {
  content: "\f07b";
}

.fa-folder-minus:before {
  content: "\f65d";
}

.fa-folder-open:before {
  content: "\f07c";
}

.fa-folder-plus:before {
  content: "\f65e";
}

.fa-font:before {
  content: "\f031";
}

.fa-font-awesome:before {
  content: "\f2b4";
}

.fa-font-awesome-alt:before {
  content: "\f35c";
}

.fa-font-awesome-flag:before {
  content: "\f425";
}

.fa-font-awesome-logo-full:before {
  content: "\f4e6";
}

.fa-fonticons:before {
  content: "\f280";
}

.fa-fonticons-fi:before {
  content: "\f3a2";
}

.fa-football-ball:before {
  content: "\f44e";
}

.fa-fort-awesome:before {
  content: "\f286";
}

.fa-fort-awesome-alt:before {
  content: "\f3a3";
}

.fa-forumbee:before {
  content: "\f211";
}

.fa-forward:before {
  content: "\f04e";
}

.fa-foursquare:before {
  content: "\f180";
}

.fa-free-code-camp:before {
  content: "\f2c5";
}

.fa-freebsd:before {
  content: "\f3a4";
}

.fa-frog:before {
  content: "\f52e";
}

.fa-frown:before {
  content: "\f119";
}

.fa-frown-open:before {
  content: "\f57a";
}

.fa-fulcrum:before {
  content: "\f50b";
}

.fa-funnel-dollar:before {
  content: "\f662";
}

.fa-futbol:before {
  content: "\f1e3";
}

.fa-galactic-republic:before {
  content: "\f50c";
}

.fa-galactic-senate:before {
  content: "\f50d";
}

.fa-gamepad:before {
  content: "\f11b";
}

.fa-gas-pump:before {
  content: "\f52f";
}

.fa-gavel:before {
  content: "\f0e3";
}

.fa-gem:before {
  content: "\f3a5";
}

.fa-genderless:before {
  content: "\f22d";
}

.fa-get-pocket:before {
  content: "\f265";
}

.fa-gg:before {
  content: "\f260";
}

.fa-gg-circle:before {
  content: "\f261";
}

.fa-ghost:before {
  content: "\f6e2";
}

.fa-gift:before {
  content: "\f06b";
}

.fa-gifts:before {
  content: "\f79c";
}

.fa-git:before {
  content: "\f1d3";
}

.fa-git-alt:before {
  content: "\f841";
}

.fa-git-square:before {
  content: "\f1d2";
}

.fa-github:before {
  content: "\f09b";
}

.fa-github-alt:before {
  content: "\f113";
}

.fa-github-square:before {
  content: "\f092";
}

.fa-gitkraken:before {
  content: "\f3a6";
}

.fa-gitlab:before {
  content: "\f296";
}

.fa-gitter:before {
  content: "\f426";
}

.fa-glass-cheers:before {
  content: "\f79f";
}

.fa-glass-martini:before {
  content: "\f000";
}

.fa-glass-martini-alt:before {
  content: "\f57b";
}

.fa-glass-whiskey:before {
  content: "\f7a0";
}

.fa-glasses:before {
  content: "\f530";
}

.fa-glide:before {
  content: "\f2a5";
}

.fa-glide-g:before {
  content: "\f2a6";
}

.fa-globe:before {
  content: "\f0ac";
}

.fa-globe-africa:before {
  content: "\f57c";
}

.fa-globe-americas:before {
  content: "\f57d";
}

.fa-globe-asia:before {
  content: "\f57e";
}

.fa-globe-europe:before {
  content: "\f7a2";
}

.fa-gofore:before {
  content: "\f3a7";
}

.fa-golf-ball:before {
  content: "\f450";
}

.fa-goodreads:before {
  content: "\f3a8";
}

.fa-goodreads-g:before {
  content: "\f3a9";
}

.fa-google:before {
  content: "\f1a0";
}

.fa-google-drive:before {
  content: "\f3aa";
}

.fa-google-pay:before {
  content: "\e079";
}

.fa-google-play:before {
  content: "\f3ab";
}

.fa-google-plus:before {
  content: "\f2b3";
}

.fa-google-plus-g:before {
  content: "\f0d5";
}

.fa-google-plus-square:before {
  content: "\f0d4";
}

.fa-google-wallet:before {
  content: "\f1ee";
}

.fa-gopuram:before {
  content: "\f664";
}

.fa-graduation-cap:before {
  content: "\f19d";
}

.fa-gratipay:before {
  content: "\f184";
}

.fa-grav:before {
  content: "\f2d6";
}

.fa-greater-than:before {
  content: "\f531";
}

.fa-greater-than-equal:before {
  content: "\f532";
}

.fa-grimace:before {
  content: "\f57f";
}

.fa-grin:before {
  content: "\f580";
}

.fa-grin-alt:before {
  content: "\f581";
}

.fa-grin-beam:before {
  content: "\f582";
}

.fa-grin-beam-sweat:before {
  content: "\f583";
}

.fa-grin-hearts:before {
  content: "\f584";
}

.fa-grin-squint:before {
  content: "\f585";
}

.fa-grin-squint-tears:before {
  content: "\f586";
}

.fa-grin-stars:before {
  content: "\f587";
}

.fa-grin-tears:before {
  content: "\f588";
}

.fa-grin-tongue:before {
  content: "\f589";
}

.fa-grin-tongue-squint:before {
  content: "\f58a";
}

.fa-grin-tongue-wink:before {
  content: "\f58b";
}

.fa-grin-wink:before {
  content: "\f58c";
}

.fa-grip-horizontal:before {
  content: "\f58d";
}

.fa-grip-lines:before {
  content: "\f7a4";
}

.fa-grip-lines-vertical:before {
  content: "\f7a5";
}

.fa-grip-vertical:before {
  content: "\f58e";
}

.fa-gripfire:before {
  content: "\f3ac";
}

.fa-grunt:before {
  content: "\f3ad";
}

.fa-guilded:before {
  content: "\e07e";
}

.fa-guitar:before {
  content: "\f7a6";
}

.fa-gulp:before {
  content: "\f3ae";
}

.fa-h-square:before {
  content: "\f0fd";
}

.fa-hacker-news:before {
  content: "\f1d4";
}

.fa-hacker-news-square:before {
  content: "\f3af";
}

.fa-hackerrank:before {
  content: "\f5f7";
}

.fa-hamburger:before {
  content: "\f805";
}

.fa-hammer:before {
  content: "\f6e3";
}

.fa-hamsa:before {
  content: "\f665";
}

.fa-hand-holding:before {
  content: "\f4bd";
}

.fa-hand-holding-heart:before {
  content: "\f4be";
}

.fa-hand-holding-medical:before {
  content: "\e05c";
}

.fa-hand-holding-usd:before {
  content: "\f4c0";
}

.fa-hand-holding-water:before {
  content: "\f4c1";
}

.fa-hand-lizard:before {
  content: "\f258";
}

.fa-hand-middle-finger:before {
  content: "\f806";
}

.fa-hand-paper:before {
  content: "\f256";
}

.fa-hand-peace:before {
  content: "\f25b";
}

.fa-hand-point-down:before {
  content: "\f0a7";
}

.fa-hand-point-left:before {
  content: "\f0a5";
}

.fa-hand-point-right:before {
  content: "\f0a4";
}

.fa-hand-point-up:before {
  content: "\f0a6";
}

.fa-hand-pointer:before {
  content: "\f25a";
}

.fa-hand-rock:before {
  content: "\f255";
}

.fa-hand-scissors:before {
  content: "\f257";
}

.fa-hand-sparkles:before {
  content: "\e05d";
}

.fa-hand-spock:before {
  content: "\f259";
}

.fa-hands:before {
  content: "\f4c2";
}

.fa-hands-helping:before {
  content: "\f4c4";
}

.fa-hands-wash:before {
  content: "\e05e";
}

.fa-handshake:before {
  content: "\f2b5";
}

.fa-handshake-alt-slash:before {
  content: "\e05f";
}

.fa-handshake-slash:before {
  content: "\e060";
}

.fa-hanukiah:before {
  content: "\f6e6";
}

.fa-hard-hat:before {
  content: "\f807";
}

.fa-hashtag:before {
  content: "\f292";
}

.fa-hat-cowboy:before {
  content: "\f8c0";
}

.fa-hat-cowboy-side:before {
  content: "\f8c1";
}

.fa-hat-wizard:before {
  content: "\f6e8";
}

.fa-hdd:before {
  content: "\f0a0";
}

.fa-head-side-cough:before {
  content: "\e061";
}

.fa-head-side-cough-slash:before {
  content: "\e062";
}

.fa-head-side-mask:before {
  content: "\e063";
}

.fa-head-side-virus:before {
  content: "\e064";
}

.fa-heading:before {
  content: "\f1dc";
}

.fa-headphones:before {
  content: "\f025";
}

.fa-headphones-alt:before {
  content: "\f58f";
}

.fa-headset:before {
  content: "\f590";
}

.fa-heart:before {
  content: "\f004";
}

.fa-heart-broken:before {
  content: "\f7a9";
}

.fa-heartbeat:before {
  content: "\f21e";
}

.fa-helicopter:before {
  content: "\f533";
}

.fa-highlighter:before {
  content: "\f591";
}

.fa-hiking:before {
  content: "\f6ec";
}

.fa-hippo:before {
  content: "\f6ed";
}

.fa-hips:before {
  content: "\f452";
}

.fa-hire-a-helper:before {
  content: "\f3b0";
}

.fa-history:before {
  content: "\f1da";
}

.fa-hive:before {
  content: "\e07f";
}

.fa-hockey-puck:before {
  content: "\f453";
}

.fa-holly-berry:before {
  content: "\f7aa";
}

.fa-home:before {
  content: "\f015";
}

.fa-hooli:before {
  content: "\f427";
}

.fa-hornbill:before {
  content: "\f592";
}

.fa-horse:before {
  content: "\f6f0";
}

.fa-horse-head:before {
  content: "\f7ab";
}

.fa-hospital:before {
  content: "\f0f8";
}

.fa-hospital-alt:before {
  content: "\f47d";
}

.fa-hospital-symbol:before {
  content: "\f47e";
}

.fa-hospital-user:before {
  content: "\f80d";
}

.fa-hot-tub:before {
  content: "\f593";
}

.fa-hotdog:before {
  content: "\f80f";
}

.fa-hotel:before {
  content: "\f594";
}

.fa-hotjar:before {
  content: "\f3b1";
}

.fa-hourglass:before {
  content: "\f254";
}

.fa-hourglass-end:before {
  content: "\f253";
}

.fa-hourglass-half:before {
  content: "\f252";
}

.fa-hourglass-start:before {
  content: "\f251";
}

.fa-house-damage:before {
  content: "\f6f1";
}

.fa-house-user:before {
  content: "\e065";
}

.fa-houzz:before {
  content: "\f27c";
}

.fa-hryvnia:before {
  content: "\f6f2";
}

.fa-html5:before {
  content: "\f13b";
}

.fa-hubspot:before {
  content: "\f3b2";
}

.fa-i-cursor:before {
  content: "\f246";
}

.fa-ice-cream:before {
  content: "\f810";
}

.fa-icicles:before {
  content: "\f7ad";
}

.fa-icons:before {
  content: "\f86d";
}

.fa-id-badge:before {
  content: "\f2c1";
}

.fa-id-card:before {
  content: "\f2c2";
}

.fa-id-card-alt:before {
  content: "\f47f";
}

.fa-ideal:before {
  content: "\e013";
}

.fa-igloo:before {
  content: "\f7ae";
}

.fa-image:before {
  content: "\f03e";
}

.fa-images:before {
  content: "\f302";
}

.fa-imdb:before {
  content: "\f2d8";
}

.fa-inbox:before {
  content: "\f01c";
}

.fa-indent:before {
  content: "\f03c";
}

.fa-industry:before {
  content: "\f275";
}

.fa-infinity:before {
  content: "\f534";
}

.fa-info:before {
  content: "\f129";
}

.fa-info-circle:before {
  content: "\f05a";
}

.fa-innosoft:before {
  content: "\e080";
}

.fa-instagram:before {
  content: "\f16d";
}

.fa-instagram-square:before {
  content: "\e055";
}

.fa-instalod:before {
  content: "\e081";
}

.fa-intercom:before {
  content: "\f7af";
}

.fa-internet-explorer:before {
  content: "\f26b";
}

.fa-invision:before {
  content: "\f7b0";
}

.fa-ioxhost:before {
  content: "\f208";
}

.fa-italic:before {
  content: "\f033";
}

.fa-itch-io:before {
  content: "\f83a";
}

.fa-itunes:before {
  content: "\f3b4";
}

.fa-itunes-note:before {
  content: "\f3b5";
}

.fa-java:before {
  content: "\f4e4";
}

.fa-jedi:before {
  content: "\f669";
}

.fa-jedi-order:before {
  content: "\f50e";
}

.fa-jenkins:before {
  content: "\f3b6";
}

.fa-jira:before {
  content: "\f7b1";
}

.fa-joget:before {
  content: "\f3b7";
}

.fa-joint:before {
  content: "\f595";
}

.fa-joomla:before {
  content: "\f1aa";
}

.fa-journal-whills:before {
  content: "\f66a";
}

.fa-js:before {
  content: "\f3b8";
}

.fa-js-square:before {
  content: "\f3b9";
}

.fa-jsfiddle:before {
  content: "\f1cc";
}

.fa-kaaba:before {
  content: "\f66b";
}

.fa-kaggle:before {
  content: "\f5fa";
}

.fa-key:before {
  content: "\f084";
}

.fa-keybase:before {
  content: "\f4f5";
}

.fa-keyboard:before {
  content: "\f11c";
}

.fa-keycdn:before {
  content: "\f3ba";
}

.fa-khanda:before {
  content: "\f66d";
}

.fa-kickstarter:before {
  content: "\f3bb";
}

.fa-kickstarter-k:before {
  content: "\f3bc";
}

.fa-kiss:before {
  content: "\f596";
}

.fa-kiss-beam:before {
  content: "\f597";
}

.fa-kiss-wink-heart:before {
  content: "\f598";
}

.fa-kiwi-bird:before {
  content: "\f535";
}

.fa-korvue:before {
  content: "\f42f";
}

.fa-landmark:before {
  content: "\f66f";
}

.fa-language:before {
  content: "\f1ab";
}

.fa-laptop:before {
  content: "\f109";
}

.fa-laptop-code:before {
  content: "\f5fc";
}

.fa-laptop-house:before {
  content: "\e066";
}

.fa-laptop-medical:before {
  content: "\f812";
}

.fa-laravel:before {
  content: "\f3bd";
}

.fa-lastfm:before {
  content: "\f202";
}

.fa-lastfm-square:before {
  content: "\f203";
}

.fa-laugh:before {
  content: "\f599";
}

.fa-laugh-beam:before {
  content: "\f59a";
}

.fa-laugh-squint:before {
  content: "\f59b";
}

.fa-laugh-wink:before {
  content: "\f59c";
}

.fa-layer-group:before {
  content: "\f5fd";
}

.fa-leaf:before {
  content: "\f06c";
}

.fa-leanpub:before {
  content: "\f212";
}

.fa-lemon:before {
  content: "\f094";
}

.fa-less:before {
  content: "\f41d";
}

.fa-less-than:before {
  content: "\f536";
}

.fa-less-than-equal:before {
  content: "\f537";
}

.fa-level-down-alt:before {
  content: "\f3be";
}

.fa-level-up-alt:before {
  content: "\f3bf";
}

.fa-life-ring:before {
  content: "\f1cd";
}

.fa-lightbulb:before {
  content: "\f0eb";
}

.fa-line:before {
  content: "\f3c0";
}

.fa-link:before {
  content: "\f0c1";
}

.fa-linkedin:before {
  content: "\f08c";
}

.fa-linkedin-in:before {
  content: "\f0e1";
}

.fa-linode:before {
  content: "\f2b8";
}

.fa-linux:before {
  content: "\f17c";
}

.fa-lira-sign:before {
  content: "\f195";
}

.fa-list:before {
  content: "\f03a";
}

.fa-list-alt:before {
  content: "\f022";
}

.fa-list-ol:before {
  content: "\f0cb";
}

.fa-list-ul:before {
  content: "\f0ca";
}

.fa-location-arrow:before {
  content: "\f124";
}

.fa-lock:before {
  content: "\f023";
}

.fa-lock-open:before {
  content: "\f3c1";
}

.fa-long-arrow-alt-down:before {
  content: "\f309";
}

.fa-long-arrow-alt-left:before {
  content: "\f30a";
}

.fa-long-arrow-alt-right:before {
  content: "\f30b";
}

.fa-long-arrow-alt-up:before {
  content: "\f30c";
}

.fa-low-vision:before {
  content: "\f2a8";
}

.fa-luggage-cart:before {
  content: "\f59d";
}

.fa-lungs:before {
  content: "\f604";
}

.fa-lungs-virus:before {
  content: "\e067";
}

.fa-lyft:before {
  content: "\f3c3";
}

.fa-magento:before {
  content: "\f3c4";
}

.fa-magic:before {
  content: "\f0d0";
}

.fa-magnet:before {
  content: "\f076";
}

.fa-mail-bulk:before {
  content: "\f674";
}

.fa-mailchimp:before {
  content: "\f59e";
}

.fa-male:before {
  content: "\f183";
}

.fa-mandalorian:before {
  content: "\f50f";
}

.fa-map:before {
  content: "\f279";
}

.fa-map-marked:before {
  content: "\f59f";
}

.fa-map-marked-alt:before {
  content: "\f5a0";
}

.fa-map-marker:before {
  content: "\f041";
}

.fa-map-marker-alt:before {
  content: "\f3c5";
}

.fa-map-pin:before {
  content: "\f276";
}

.fa-map-signs:before {
  content: "\f277";
}

.fa-markdown:before {
  content: "\f60f";
}

.fa-marker:before {
  content: "\f5a1";
}

.fa-mars:before {
  content: "\f222";
}

.fa-mars-double:before {
  content: "\f227";
}

.fa-mars-stroke:before {
  content: "\f229";
}

.fa-mars-stroke-h:before {
  content: "\f22b";
}

.fa-mars-stroke-v:before {
  content: "\f22a";
}

.fa-mask:before {
  content: "\f6fa";
}

.fa-mastodon:before {
  content: "\f4f6";
}

.fa-maxcdn:before {
  content: "\f136";
}

.fa-mdb:before {
  content: "\f8ca";
}

.fa-medal:before {
  content: "\f5a2";
}

.fa-medapps:before {
  content: "\f3c6";
}

.fa-medium:before {
  content: "\f23a";
}

.fa-medium-m:before {
  content: "\f3c7";
}

.fa-medkit:before {
  content: "\f0fa";
}

.fa-medrt:before {
  content: "\f3c8";
}

.fa-meetup:before {
  content: "\f2e0";
}

.fa-megaport:before {
  content: "\f5a3";
}

.fa-meh:before {
  content: "\f11a";
}

.fa-meh-blank:before {
  content: "\f5a4";
}

.fa-meh-rolling-eyes:before {
  content: "\f5a5";
}

.fa-memory:before {
  content: "\f538";
}

.fa-mendeley:before {
  content: "\f7b3";
}

.fa-menorah:before {
  content: "\f676";
}

.fa-mercury:before {
  content: "\f223";
}

.fa-meteor:before {
  content: "\f753";
}

.fa-microblog:before {
  content: "\e01a";
}

.fa-microchip:before {
  content: "\f2db";
}

.fa-microphone:before {
  content: "\f130";
}

.fa-microphone-alt:before {
  content: "\f3c9";
}

.fa-microphone-alt-slash:before {
  content: "\f539";
}

.fa-microphone-slash:before {
  content: "\f131";
}

.fa-microscope:before {
  content: "\f610";
}

.fa-microsoft:before {
  content: "\f3ca";
}

.fa-minus:before {
  content: "\f068";
}

.fa-minus-circle:before {
  content: "\f056";
}

.fa-minus-square:before {
  content: "\f146";
}

.fa-mitten:before {
  content: "\f7b5";
}

.fa-mix:before {
  content: "\f3cb";
}

.fa-mixcloud:before {
  content: "\f289";
}

.fa-mixer:before {
  content: "\e056";
}

.fa-mizuni:before {
  content: "\f3cc";
}

.fa-mobile:before {
  content: "\f10b";
}

.fa-mobile-alt:before {
  content: "\f3cd";
}

.fa-modx:before {
  content: "\f285";
}

.fa-monero:before {
  content: "\f3d0";
}

.fa-money-bill:before {
  content: "\f0d6";
}

.fa-money-bill-alt:before {
  content: "\f3d1";
}

.fa-money-bill-wave:before {
  content: "\f53a";
}

.fa-money-bill-wave-alt:before {
  content: "\f53b";
}

.fa-money-check:before {
  content: "\f53c";
}

.fa-money-check-alt:before {
  content: "\f53d";
}

.fa-monument:before {
  content: "\f5a6";
}

.fa-moon:before {
  content: "\f186";
}

.fa-mortar-pestle:before {
  content: "\f5a7";
}

.fa-mosque:before {
  content: "\f678";
}

.fa-motorcycle:before {
  content: "\f21c";
}

.fa-mountain:before {
  content: "\f6fc";
}

.fa-mouse:before {
  content: "\f8cc";
}

.fa-mouse-pointer:before {
  content: "\f245";
}

.fa-mug-hot:before {
  content: "\f7b6";
}

.fa-music:before {
  content: "\f001";
}

.fa-napster:before {
  content: "\f3d2";
}

.fa-neos:before {
  content: "\f612";
}

.fa-network-wired:before {
  content: "\f6ff";
}

.fa-neuter:before {
  content: "\f22c";
}

.fa-newspaper:before {
  content: "\f1ea";
}

.fa-nimblr:before {
  content: "\f5a8";
}

.fa-node:before {
  content: "\f419";
}

.fa-node-js:before {
  content: "\f3d3";
}

.fa-not-equal:before {
  content: "\f53e";
}

.fa-notes-medical:before {
  content: "\f481";
}

.fa-npm:before {
  content: "\f3d4";
}

.fa-ns8:before {
  content: "\f3d5";
}

.fa-nutritionix:before {
  content: "\f3d6";
}

.fa-object-group:before {
  content: "\f247";
}

.fa-object-ungroup:before {
  content: "\f248";
}

.fa-octopus-deploy:before {
  content: "\e082";
}

.fa-odnoklassniki:before {
  content: "\f263";
}

.fa-odnoklassniki-square:before {
  content: "\f264";
}

.fa-oil-can:before {
  content: "\f613";
}

.fa-old-republic:before {
  content: "\f510";
}

.fa-om:before {
  content: "\f679";
}

.fa-opencart:before {
  content: "\f23d";
}

.fa-openid:before {
  content: "\f19b";
}

.fa-opera:before {
  content: "\f26a";
}

.fa-optin-monster:before {
  content: "\f23c";
}

.fa-orcid:before {
  content: "\f8d2";
}

.fa-osi:before {
  content: "\f41a";
}

.fa-otter:before {
  content: "\f700";
}

.fa-outdent:before {
  content: "\f03b";
}

.fa-page4:before {
  content: "\f3d7";
}

.fa-pagelines:before {
  content: "\f18c";
}

.fa-pager:before {
  content: "\f815";
}

.fa-paint-brush:before {
  content: "\f1fc";
}

.fa-paint-roller:before {
  content: "\f5aa";
}

.fa-palette:before {
  content: "\f53f";
}

.fa-palfed:before {
  content: "\f3d8";
}

.fa-pallet:before {
  content: "\f482";
}

.fa-paper-plane:before {
  content: "\f1d8";
}

.fa-paperclip:before {
  content: "\f0c6";
}

.fa-parachute-box:before {
  content: "\f4cd";
}

.fa-paragraph:before {
  content: "\f1dd";
}

.fa-parking:before {
  content: "\f540";
}

.fa-passport:before {
  content: "\f5ab";
}

.fa-pastafarianism:before {
  content: "\f67b";
}

.fa-paste:before {
  content: "\f0ea";
}

.fa-patreon:before {
  content: "\f3d9";
}

.fa-pause:before {
  content: "\f04c";
}

.fa-pause-circle:before {
  content: "\f28b";
}

.fa-paw:before {
  content: "\f1b0";
}

.fa-paypal:before {
  content: "\f1ed";
}

.fa-peace:before {
  content: "\f67c";
}

.fa-pen:before {
  content: "\f304";
}

.fa-pen-alt:before {
  content: "\f305";
}

.fa-pen-fancy:before {
  content: "\f5ac";
}

.fa-pen-nib:before {
  content: "\f5ad";
}

.fa-pen-square:before {
  content: "\f14b";
}

.fa-pencil-alt:before {
  content: "\f303";
}

.fa-pencil-ruler:before {
  content: "\f5ae";
}

.fa-penny-arcade:before {
  content: "\f704";
}

.fa-people-arrows:before {
  content: "\e068";
}

.fa-people-carry:before {
  content: "\f4ce";
}

.fa-pepper-hot:before {
  content: "\f816";
}

.fa-perbyte:before {
  content: "\e083";
}

.fa-percent:before {
  content: "\f295";
}

.fa-percentage:before {
  content: "\f541";
}

.fa-periscope:before {
  content: "\f3da";
}

.fa-person-booth:before {
  content: "\f756";
}

.fa-phabricator:before {
  content: "\f3db";
}

.fa-phoenix-framework:before {
  content: "\f3dc";
}

.fa-phoenix-squadron:before {
  content: "\f511";
}

.fa-phone:before {
  content: "\f095";
}

.fa-phone-alt:before {
  content: "\f879";
}

.fa-phone-slash:before {
  content: "\f3dd";
}

.fa-phone-square:before {
  content: "\f098";
}

.fa-phone-square-alt:before {
  content: "\f87b";
}

.fa-phone-volume:before {
  content: "\f2a0";
}

.fa-photo-video:before {
  content: "\f87c";
}

.fa-php:before {
  content: "\f457";
}

.fa-pied-piper:before {
  content: "\f2ae";
}

.fa-pied-piper-alt:before {
  content: "\f1a8";
}

.fa-pied-piper-hat:before {
  content: "\f4e5";
}

.fa-pied-piper-pp:before {
  content: "\f1a7";
}

.fa-pied-piper-square:before {
  content: "\e01e";
}

.fa-piggy-bank:before {
  content: "\f4d3";
}

.fa-pills:before {
  content: "\f484";
}

.fa-pinterest:before {
  content: "\f0d2";
}

.fa-pinterest-p:before {
  content: "\f231";
}

.fa-pinterest-square:before {
  content: "\f0d3";
}

.fa-pizza-slice:before {
  content: "\f818";
}

.fa-place-of-worship:before {
  content: "\f67f";
}

.fa-plane:before {
  content: "\f072";
}

.fa-plane-arrival:before {
  content: "\f5af";
}

.fa-plane-departure:before {
  content: "\f5b0";
}

.fa-plane-slash:before {
  content: "\e069";
}

.fa-play:before {
  content: "\f04b";
}

.fa-play-circle:before {
  content: "\f144";
}

.fa-playstation:before {
  content: "\f3df";
}

.fa-plug:before {
  content: "\f1e6";
}

.fa-plus:before {
  content: "\f067";
}

.fa-plus-circle:before {
  content: "\f055";
}

.fa-plus-square:before {
  content: "\f0fe";
}

.fa-podcast:before {
  content: "\f2ce";
}

.fa-poll:before {
  content: "\f681";
}

.fa-poll-h:before {
  content: "\f682";
}

.fa-poo:before {
  content: "\f2fe";
}

.fa-poo-storm:before {
  content: "\f75a";
}

.fa-poop:before {
  content: "\f619";
}

.fa-portrait:before {
  content: "\f3e0";
}

.fa-pound-sign:before {
  content: "\f154";
}

.fa-power-off:before {
  content: "\f011";
}

.fa-pray:before {
  content: "\f683";
}

.fa-praying-hands:before {
  content: "\f684";
}

.fa-prescription:before {
  content: "\f5b1";
}

.fa-prescription-bottle:before {
  content: "\f485";
}

.fa-prescription-bottle-alt:before {
  content: "\f486";
}

.fa-print:before {
  content: "\f02f";
}

.fa-procedures:before {
  content: "\f487";
}

.fa-product-hunt:before {
  content: "\f288";
}

.fa-project-diagram:before {
  content: "\f542";
}

.fa-pump-medical:before {
  content: "\e06a";
}

.fa-pump-soap:before {
  content: "\e06b";
}

.fa-pushed:before {
  content: "\f3e1";
}

.fa-puzzle-piece:before {
  content: "\f12e";
}

.fa-python:before {
  content: "\f3e2";
}

.fa-qq:before {
  content: "\f1d6";
}

.fa-qrcode:before {
  content: "\f029";
}

.fa-question:before {
  content: "\f128";
}

.fa-question-circle:before {
  content: "\f059";
}

.fa-quidditch:before {
  content: "\f458";
}

.fa-quinscape:before {
  content: "\f459";
}

.fa-quora:before {
  content: "\f2c4";
}

.fa-quote-left:before {
  content: "\f10d";
}

.fa-quote-right:before {
  content: "\f10e";
}

.fa-quran:before {
  content: "\f687";
}

.fa-r-project:before {
  content: "\f4f7";
}

.fa-radiation:before {
  content: "\f7b9";
}

.fa-radiation-alt:before {
  content: "\f7ba";
}

.fa-rainbow:before {
  content: "\f75b";
}

.fa-random:before {
  content: "\f074";
}

.fa-raspberry-pi:before {
  content: "\f7bb";
}

.fa-ravelry:before {
  content: "\f2d9";
}

.fa-react:before {
  content: "\f41b";
}

.fa-reacteurope:before {
  content: "\f75d";
}

.fa-readme:before {
  content: "\f4d5";
}

.fa-rebel:before {
  content: "\f1d0";
}

.fa-receipt:before {
  content: "\f543";
}

.fa-record-vinyl:before {
  content: "\f8d9";
}

.fa-recycle:before {
  content: "\f1b8";
}

.fa-red-river:before {
  content: "\f3e3";
}

.fa-reddit:before {
  content: "\f1a1";
}

.fa-reddit-alien:before {
  content: "\f281";
}

.fa-reddit-square:before {
  content: "\f1a2";
}

.fa-redhat:before {
  content: "\f7bc";
}

.fa-redo:before {
  content: "\f01e";
}

.fa-redo-alt:before {
  content: "\f2f9";
}

.fa-registered:before {
  content: "\f25d";
}

.fa-remove-format:before {
  content: "\f87d";
}

.fa-renren:before {
  content: "\f18b";
}

.fa-reply:before {
  content: "\f3e5";
}

.fa-reply-all:before {
  content: "\f122";
}

.fa-replyd:before {
  content: "\f3e6";
}

.fa-republican:before {
  content: "\f75e";
}

.fa-researchgate:before {
  content: "\f4f8";
}

.fa-resolving:before {
  content: "\f3e7";
}

.fa-restroom:before {
  content: "\f7bd";
}

.fa-retweet:before {
  content: "\f079";
}

.fa-rev:before {
  content: "\f5b2";
}

.fa-ribbon:before {
  content: "\f4d6";
}

.fa-ring:before {
  content: "\f70b";
}

.fa-road:before {
  content: "\f018";
}

.fa-robot:before {
  content: "\f544";
}

.fa-rocket:before {
  content: "\f135";
}

.fa-rocketchat:before {
  content: "\f3e8";
}

.fa-rockrms:before {
  content: "\f3e9";
}

.fa-route:before {
  content: "\f4d7";
}

.fa-rss:before {
  content: "\f09e";
}

.fa-rss-square:before {
  content: "\f143";
}

.fa-ruble-sign:before {
  content: "\f158";
}

.fa-ruler:before {
  content: "\f545";
}

.fa-ruler-combined:before {
  content: "\f546";
}

.fa-ruler-horizontal:before {
  content: "\f547";
}

.fa-ruler-vertical:before {
  content: "\f548";
}

.fa-running:before {
  content: "\f70c";
}

.fa-rupee-sign:before {
  content: "\f156";
}

.fa-rust:before {
  content: "\e07a";
}

.fa-sad-cry:before {
  content: "\f5b3";
}

.fa-sad-tear:before {
  content: "\f5b4";
}

.fa-safari:before {
  content: "\f267";
}

.fa-salesforce:before {
  content: "\f83b";
}

.fa-sass:before {
  content: "\f41e";
}

.fa-satellite:before {
  content: "\f7bf";
}

.fa-satellite-dish:before {
  content: "\f7c0";
}

.fa-save:before {
  content: "\f0c7";
}

.fa-schlix:before {
  content: "\f3ea";
}

.fa-school:before {
  content: "\f549";
}

.fa-screwdriver:before {
  content: "\f54a";
}

.fa-scribd:before {
  content: "\f28a";
}

.fa-scroll:before {
  content: "\f70e";
}

.fa-sd-card:before {
  content: "\f7c2";
}

.fa-search:before {
  content: "\f002";
}

.fa-search-dollar:before {
  content: "\f688";
}

.fa-search-location:before {
  content: "\f689";
}

.fa-search-minus:before {
  content: "\f010";
}

.fa-search-plus:before {
  content: "\f00e";
}

.fa-searchengin:before {
  content: "\f3eb";
}

.fa-seedling:before {
  content: "\f4d8";
}

.fa-sellcast:before {
  content: "\f2da";
}

.fa-sellsy:before {
  content: "\f213";
}

.fa-server:before {
  content: "\f233";
}

.fa-servicestack:before {
  content: "\f3ec";
}

.fa-shapes:before {
  content: "\f61f";
}

.fa-share:before {
  content: "\f064";
}

.fa-share-alt:before {
  content: "\f1e0";
}

.fa-share-alt-square:before {
  content: "\f1e1";
}

.fa-share-square:before {
  content: "\f14d";
}

.fa-shekel-sign:before {
  content: "\f20b";
}

.fa-shield-alt:before {
  content: "\f3ed";
}

.fa-shield-virus:before {
  content: "\e06c";
}

.fa-ship:before {
  content: "\f21a";
}

.fa-shipping-fast:before {
  content: "\f48b";
}

.fa-shirtsinbulk:before {
  content: "\f214";
}

.fa-shoe-prints:before {
  content: "\f54b";
}

.fa-shopify:before {
  content: "\e057";
}

.fa-shopping-bag:before {
  content: "\f290";
}

.fa-shopping-basket:before {
  content: "\f291";
}

.fa-shopping-cart:before {
  content: "\f07a";
}

.fa-shopware:before {
  content: "\f5b5";
}

.fa-shower:before {
  content: "\f2cc";
}

.fa-shuttle-van:before {
  content: "\f5b6";
}

.fa-sign:before {
  content: "\f4d9";
}

.fa-sign-in-alt:before {
  content: "\f2f6";
}

.fa-sign-language:before {
  content: "\f2a7";
}

.fa-sign-out-alt:before {
  content: "\f2f5";
}

.fa-signal:before {
  content: "\f012";
}

.fa-signature:before {
  content: "\f5b7";
}

.fa-sim-card:before {
  content: "\f7c4";
}

.fa-simplybuilt:before {
  content: "\f215";
}

.fa-sink:before {
  content: "\e06d";
}

.fa-sistrix:before {
  content: "\f3ee";
}

.fa-sitemap:before {
  content: "\f0e8";
}

.fa-sith:before {
  content: "\f512";
}

.fa-skating:before {
  content: "\f7c5";
}

.fa-sketch:before {
  content: "\f7c6";
}

.fa-skiing:before {
  content: "\f7c9";
}

.fa-skiing-nordic:before {
  content: "\f7ca";
}

.fa-skull:before {
  content: "\f54c";
}

.fa-skull-crossbones:before {
  content: "\f714";
}

.fa-skyatlas:before {
  content: "\f216";
}

.fa-skype:before {
  content: "\f17e";
}

.fa-slack:before {
  content: "\f198";
}

.fa-slack-hash:before {
  content: "\f3ef";
}

.fa-slash:before {
  content: "\f715";
}

.fa-sleigh:before {
  content: "\f7cc";
}

.fa-sliders-h:before {
  content: "\f1de";
}

.fa-slideshare:before {
  content: "\f1e7";
}

.fa-smile:before {
  content: "\f118";
}

.fa-smile-beam:before {
  content: "\f5b8";
}

.fa-smile-wink:before {
  content: "\f4da";
}

.fa-smog:before {
  content: "\f75f";
}

.fa-smoking:before {
  content: "\f48d";
}

.fa-smoking-ban:before {
  content: "\f54d";
}

.fa-sms:before {
  content: "\f7cd";
}

.fa-snapchat:before {
  content: "\f2ab";
}

.fa-snapchat-ghost:before {
  content: "\f2ac";
}

.fa-snapchat-square:before {
  content: "\f2ad";
}

.fa-snowboarding:before {
  content: "\f7ce";
}

.fa-snowflake:before {
  content: "\f2dc";
}

.fa-snowman:before {
  content: "\f7d0";
}

.fa-snowplow:before {
  content: "\f7d2";
}

.fa-soap:before {
  content: "\e06e";
}

.fa-socks:before {
  content: "\f696";
}

.fa-solar-panel:before {
  content: "\f5ba";
}

.fa-sort:before {
  content: "\f0dc";
}

.fa-sort-alpha-down:before {
  content: "\f15d";
}

.fa-sort-alpha-down-alt:before {
  content: "\f881";
}

.fa-sort-alpha-up:before {
  content: "\f15e";
}

.fa-sort-alpha-up-alt:before {
  content: "\f882";
}

.fa-sort-amount-down:before {
  content: "\f160";
}

.fa-sort-amount-down-alt:before {
  content: "\f884";
}

.fa-sort-amount-up:before {
  content: "\f161";
}

.fa-sort-amount-up-alt:before {
  content: "\f885";
}

.fa-sort-down:before {
  content: "\f0dd";
}

.fa-sort-numeric-down:before {
  content: "\f162";
}

.fa-sort-numeric-down-alt:before {
  content: "\f886";
}

.fa-sort-numeric-up:before {
  content: "\f163";
}

.fa-sort-numeric-up-alt:before {
  content: "\f887";
}

.fa-sort-up:before {
  content: "\f0de";
}

.fa-soundcloud:before {
  content: "\f1be";
}

.fa-sourcetree:before {
  content: "\f7d3";
}

.fa-spa:before {
  content: "\f5bb";
}

.fa-space-shuttle:before {
  content: "\f197";
}

.fa-speakap:before {
  content: "\f3f3";
}

.fa-speaker-deck:before {
  content: "\f83c";
}

.fa-spell-check:before {
  content: "\f891";
}

.fa-spider:before {
  content: "\f717";
}

.fa-spinner:before {
  content: "\f110";
}

.fa-splotch:before {
  content: "\f5bc";
}

.fa-spotify:before {
  content: "\f1bc";
}

.fa-spray-can:before {
  content: "\f5bd";
}

.fa-square:before {
  content: "\f0c8";
}

.fa-square-full:before {
  content: "\f45c";
}

.fa-square-root-alt:before {
  content: "\f698";
}

.fa-squarespace:before {
  content: "\f5be";
}

.fa-stack-exchange:before {
  content: "\f18d";
}

.fa-stack-overflow:before {
  content: "\f16c";
}

.fa-stackpath:before {
  content: "\f842";
}

.fa-stamp:before {
  content: "\f5bf";
}

.fa-star:before {
  content: "\f005";
}

.fa-star-and-crescent:before {
  content: "\f699";
}

.fa-star-half:before {
  content: "\f089";
}

.fa-star-half-alt:before {
  content: "\f5c0";
}

.fa-star-of-david:before {
  content: "\f69a";
}

.fa-star-of-life:before {
  content: "\f621";
}

.fa-staylinked:before {
  content: "\f3f5";
}

.fa-steam:before {
  content: "\f1b6";
}

.fa-steam-square:before {
  content: "\f1b7";
}

.fa-steam-symbol:before {
  content: "\f3f6";
}

.fa-step-backward:before {
  content: "\f048";
}

.fa-step-forward:before {
  content: "\f051";
}

.fa-stethoscope:before {
  content: "\f0f1";
}

.fa-sticker-mule:before {
  content: "\f3f7";
}

.fa-sticky-note:before {
  content: "\f249";
}

.fa-stop:before {
  content: "\f04d";
}

.fa-stop-circle:before {
  content: "\f28d";
}

.fa-stopwatch:before {
  content: "\f2f2";
}

.fa-stopwatch-20:before {
  content: "\e06f";
}

.fa-store:before {
  content: "\f54e";
}

.fa-store-alt:before {
  content: "\f54f";
}

.fa-store-alt-slash:before {
  content: "\e070";
}

.fa-store-slash:before {
  content: "\e071";
}

.fa-strava:before {
  content: "\f428";
}

.fa-stream:before {
  content: "\f550";
}

.fa-street-view:before {
  content: "\f21d";
}

.fa-strikethrough:before {
  content: "\f0cc";
}

.fa-stripe:before {
  content: "\f429";
}

.fa-stripe-s:before {
  content: "\f42a";
}

.fa-stroopwafel:before {
  content: "\f551";
}

.fa-studiovinari:before {
  content: "\f3f8";
}

.fa-stumbleupon:before {
  content: "\f1a4";
}

.fa-stumbleupon-circle:before {
  content: "\f1a3";
}

.fa-subscript:before {
  content: "\f12c";
}

.fa-subway:before {
  content: "\f239";
}

.fa-suitcase:before {
  content: "\f0f2";
}

.fa-suitcase-rolling:before {
  content: "\f5c1";
}

.fa-sun:before {
  content: "\f185";
}

.fa-superpowers:before {
  content: "\f2dd";
}

.fa-superscript:before {
  content: "\f12b";
}

.fa-supple:before {
  content: "\f3f9";
}

.fa-surprise:before {
  content: "\f5c2";
}

.fa-suse:before {
  content: "\f7d6";
}

.fa-swatchbook:before {
  content: "\f5c3";
}

.fa-swift:before {
  content: "\f8e1";
}

.fa-swimmer:before {
  content: "\f5c4";
}

.fa-swimming-pool:before {
  content: "\f5c5";
}

.fa-symfony:before {
  content: "\f83d";
}

.fa-synagogue:before {
  content: "\f69b";
}

.fa-sync:before {
  content: "\f021";
}

.fa-sync-alt:before {
  content: "\f2f1";
}

.fa-syringe:before {
  content: "\f48e";
}

.fa-table:before {
  content: "\f0ce";
}

.fa-table-tennis:before {
  content: "\f45d";
}

.fa-tablet:before {
  content: "\f10a";
}

.fa-tablet-alt:before {
  content: "\f3fa";
}

.fa-tablets:before {
  content: "\f490";
}

.fa-tachometer-alt:before {
  content: "\f3fd";
}

.fa-tag:before {
  content: "\f02b";
}

.fa-tags:before {
  content: "\f02c";
}

.fa-tape:before {
  content: "\f4db";
}

.fa-tasks:before {
  content: "\f0ae";
}

.fa-taxi:before {
  content: "\f1ba";
}

.fa-teamspeak:before {
  content: "\f4f9";
}

.fa-teeth:before {
  content: "\f62e";
}

.fa-teeth-open:before {
  content: "\f62f";
}

.fa-telegram:before {
  content: "\f2c6";
}

.fa-telegram-plane:before {
  content: "\f3fe";
}

.fa-temperature-high:before {
  content: "\f769";
}

.fa-temperature-low:before {
  content: "\f76b";
}

.fa-tencent-weibo:before {
  content: "\f1d5";
}

.fa-tenge:before {
  content: "\f7d7";
}

.fa-terminal:before {
  content: "\f120";
}

.fa-text-height:before {
  content: "\f034";
}

.fa-text-width:before {
  content: "\f035";
}

.fa-th:before {
  content: "\f00a";
}

.fa-th-large:before {
  content: "\f009";
}

.fa-th-list:before {
  content: "\f00b";
}

.fa-the-red-yeti:before {
  content: "\f69d";
}

.fa-theater-masks:before {
  content: "\f630";
}

.fa-themeco:before {
  content: "\f5c6";
}

.fa-themeisle:before {
  content: "\f2b2";
}

.fa-thermometer:before {
  content: "\f491";
}

.fa-thermometer-empty:before {
  content: "\f2cb";
}

.fa-thermometer-full:before {
  content: "\f2c7";
}

.fa-thermometer-half:before {
  content: "\f2c9";
}

.fa-thermometer-quarter:before {
  content: "\f2ca";
}

.fa-thermometer-three-quarters:before {
  content: "\f2c8";
}

.fa-think-peaks:before {
  content: "\f731";
}

.fa-thumbs-down:before {
  content: "\f165";
}

.fa-thumbs-up:before {
  content: "\f164";
}

.fa-thumbtack:before {
  content: "\f08d";
}

.fa-ticket-alt:before {
  content: "\f3ff";
}

.fa-tiktok:before {
  content: "\e07b";
}

.fa-times:before {
  content: "\f00d";
}

.fa-times-circle:before {
  content: "\f057";
}

.fa-tint:before {
  content: "\f043";
}

.fa-tint-slash:before {
  content: "\f5c7";
}

.fa-tired:before {
  content: "\f5c8";
}

.fa-toggle-off:before {
  content: "\f204";
}

.fa-toggle-on:before {
  content: "\f205";
}

.fa-toilet:before {
  content: "\f7d8";
}

.fa-toilet-paper:before {
  content: "\f71e";
}

.fa-toilet-paper-slash:before {
  content: "\e072";
}

.fa-toolbox:before {
  content: "\f552";
}

.fa-tools:before {
  content: "\f7d9";
}

.fa-tooth:before {
  content: "\f5c9";
}

.fa-torah:before {
  content: "\f6a0";
}

.fa-torii-gate:before {
  content: "\f6a1";
}

.fa-tractor:before {
  content: "\f722";
}

.fa-trade-federation:before {
  content: "\f513";
}

.fa-trademark:before {
  content: "\f25c";
}

.fa-traffic-light:before {
  content: "\f637";
}

.fa-trailer:before {
  content: "\e041";
}

.fa-train:before {
  content: "\f238";
}

.fa-tram:before {
  content: "\f7da";
}

.fa-transgender:before {
  content: "\f224";
}

.fa-transgender-alt:before {
  content: "\f225";
}

.fa-trash:before {
  content: "\f1f8";
}

.fa-trash-alt:before {
  content: "\f2ed";
}

.fa-trash-restore:before {
  content: "\f829";
}

.fa-trash-restore-alt:before {
  content: "\f82a";
}

.fa-tree:before {
  content: "\f1bb";
}

.fa-trello:before {
  content: "\f181";
}

.fa-tripadvisor:before {
  content: "\f262";
}

.fa-trophy:before {
  content: "\f091";
}

.fa-truck:before {
  content: "\f0d1";
}

.fa-truck-loading:before {
  content: "\f4de";
}

.fa-truck-monster:before {
  content: "\f63b";
}

.fa-truck-moving:before {
  content: "\f4df";
}

.fa-truck-pickup:before {
  content: "\f63c";
}

.fa-tshirt:before {
  content: "\f553";
}

.fa-tty:before {
  content: "\f1e4";
}

.fa-tumblr:before {
  content: "\f173";
}

.fa-tumblr-square:before {
  content: "\f174";
}

.fa-tv:before {
  content: "\f26c";
}

.fa-twitch:before {
  content: "\f1e8";
}

.fa-twitter:before {
  content: "\f099";
}

.fa-twitter-square:before {
  content: "\f081";
}

.fa-typo3:before {
  content: "\f42b";
}

.fa-uber:before {
  content: "\f402";
}

.fa-ubuntu:before {
  content: "\f7df";
}

.fa-uikit:before {
  content: "\f403";
}

.fa-umbraco:before {
  content: "\f8e8";
}

.fa-umbrella:before {
  content: "\f0e9";
}

.fa-umbrella-beach:before {
  content: "\f5ca";
}

.fa-uncharted:before {
  content: "\e084";
}

.fa-underline:before {
  content: "\f0cd";
}

.fa-undo:before {
  content: "\f0e2";
}

.fa-undo-alt:before {
  content: "\f2ea";
}

.fa-uniregistry:before {
  content: "\f404";
}

.fa-unity:before {
  content: "\e049";
}

.fa-universal-access:before {
  content: "\f29a";
}

.fa-university:before {
  content: "\f19c";
}

.fa-unlink:before {
  content: "\f127";
}

.fa-unlock:before {
  content: "\f09c";
}

.fa-unlock-alt:before {
  content: "\f13e";
}

.fa-unsplash:before {
  content: "\e07c";
}

.fa-untappd:before {
  content: "\f405";
}

.fa-upload:before {
  content: "\f093";
}

.fa-ups:before {
  content: "\f7e0";
}

.fa-usb:before {
  content: "\f287";
}

.fa-user:before {
  content: "\f007";
}

.fa-user-alt:before {
  content: "\f406";
}

.fa-user-alt-slash:before {
  content: "\f4fa";
}

.fa-user-astronaut:before {
  content: "\f4fb";
}

.fa-user-check:before {
  content: "\f4fc";
}

.fa-user-circle:before {
  content: "\f2bd";
}

.fa-user-clock:before {
  content: "\f4fd";
}

.fa-user-cog:before {
  content: "\f4fe";
}

.fa-user-edit:before {
  content: "\f4ff";
}

.fa-user-friends:before {
  content: "\f500";
}

.fa-user-graduate:before {
  content: "\f501";
}

.fa-user-injured:before {
  content: "\f728";
}

.fa-user-lock:before {
  content: "\f502";
}

.fa-user-md:before {
  content: "\f0f0";
}

.fa-user-minus:before {
  content: "\f503";
}

.fa-user-ninja:before {
  content: "\f504";
}

.fa-user-nurse:before {
  content: "\f82f";
}

.fa-user-plus:before {
  content: "\f234";
}

.fa-user-secret:before {
  content: "\f21b";
}

.fa-user-shield:before {
  content: "\f505";
}

.fa-user-slash:before {
  content: "\f506";
}

.fa-user-tag:before {
  content: "\f507";
}

.fa-user-tie:before {
  content: "\f508";
}

.fa-user-times:before {
  content: "\f235";
}

.fa-users:before {
  content: "\f0c0";
}

.fa-users-cog:before {
  content: "\f509";
}

.fa-users-slash:before {
  content: "\e073";
}

.fa-usps:before {
  content: "\f7e1";
}

.fa-ussunnah:before {
  content: "\f407";
}

.fa-utensil-spoon:before {
  content: "\f2e5";
}

.fa-utensils:before {
  content: "\f2e7";
}

.fa-vaadin:before {
  content: "\f408";
}

.fa-vector-square:before {
  content: "\f5cb";
}

.fa-venus:before {
  content: "\f221";
}

.fa-venus-double:before {
  content: "\f226";
}

.fa-venus-mars:before {
  content: "\f228";
}

.fa-vest:before {
  content: "\e085";
}

.fa-vest-patches:before {
  content: "\e086";
}

.fa-viacoin:before {
  content: "\f237";
}

.fa-viadeo:before {
  content: "\f2a9";
}

.fa-viadeo-square:before {
  content: "\f2aa";
}

.fa-vial:before {
  content: "\f492";
}

.fa-vials:before {
  content: "\f493";
}

.fa-viber:before {
  content: "\f409";
}

.fa-video:before {
  content: "\f03d";
}

.fa-video-slash:before {
  content: "\f4e2";
}

.fa-vihara:before {
  content: "\f6a7";
}

.fa-vimeo:before {
  content: "\f40a";
}

.fa-vimeo-square:before {
  content: "\f194";
}

.fa-vimeo-v:before {
  content: "\f27d";
}

.fa-vine:before {
  content: "\f1ca";
}

.fa-virus:before {
  content: "\e074";
}

.fa-virus-slash:before {
  content: "\e075";
}

.fa-viruses:before {
  content: "\e076";
}

.fa-vk:before {
  content: "\f189";
}

.fa-vnv:before {
  content: "\f40b";
}

.fa-voicemail:before {
  content: "\f897";
}

.fa-volleyball-ball:before {
  content: "\f45f";
}

.fa-volume-down:before {
  content: "\f027";
}

.fa-volume-mute:before {
  content: "\f6a9";
}

.fa-volume-off:before {
  content: "\f026";
}

.fa-volume-up:before {
  content: "\f028";
}

.fa-vote-yea:before {
  content: "\f772";
}

.fa-vr-cardboard:before {
  content: "\f729";
}

.fa-vuejs:before {
  content: "\f41f";
}

.fa-walking:before {
  content: "\f554";
}

.fa-wallet:before {
  content: "\f555";
}

.fa-warehouse:before {
  content: "\f494";
}

.fa-watchman-monitoring:before {
  content: "\e087";
}

.fa-water:before {
  content: "\f773";
}

.fa-wave-square:before {
  content: "\f83e";
}

.fa-waze:before {
  content: "\f83f";
}

.fa-weebly:before {
  content: "\f5cc";
}

.fa-weibo:before {
  content: "\f18a";
}

.fa-weight:before {
  content: "\f496";
}

.fa-weight-hanging:before {
  content: "\f5cd";
}

.fa-weixin:before {
  content: "\f1d7";
}

.fa-whatsapp:before {
  content: "\f232";
}

.fa-whatsapp-square:before {
  content: "\f40c";
}

.fa-wheelchair:before {
  content: "\f193";
}

.fa-whmcs:before {
  content: "\f40d";
}

.fa-wifi:before {
  content: "\f1eb";
}

.fa-wikipedia-w:before {
  content: "\f266";
}

.fa-wind:before {
  content: "\f72e";
}

.fa-window-close:before {
  content: "\f410";
}

.fa-window-maximize:before {
  content: "\f2d0";
}

.fa-window-minimize:before {
  content: "\f2d1";
}

.fa-window-restore:before {
  content: "\f2d2";
}

.fa-windows:before {
  content: "\f17a";
}

.fa-wine-bottle:before {
  content: "\f72f";
}

.fa-wine-glass:before {
  content: "\f4e3";
}

.fa-wine-glass-alt:before {
  content: "\f5ce";
}

.fa-wix:before {
  content: "\f5cf";
}

.fa-wizards-of-the-coast:before {
  content: "\f730";
}

.fa-wodu:before {
  content: "\e088";
}

.fa-wolf-pack-battalion:before {
  content: "\f514";
}

.fa-won-sign:before {
  content: "\f159";
}

.fa-wordpress:before {
  content: "\f19a";
}

.fa-wordpress-simple:before {
  content: "\f411";
}

.fa-wpbeginner:before {
  content: "\f297";
}

.fa-wpexplorer:before {
  content: "\f2de";
}

.fa-wpforms:before {
  content: "\f298";
}

.fa-wpressr:before {
  content: "\f3e4";
}

.fa-wrench:before {
  content: "\f0ad";
}

.fa-x-ray:before {
  content: "\f497";
}

.fa-xbox:before {
  content: "\f412";
}

.fa-xing:before {
  content: "\f168";
}

.fa-xing-square:before {
  content: "\f169";
}

.fa-y-combinator:before {
  content: "\f23b";
}

.fa-yahoo:before {
  content: "\f19e";
}

.fa-yammer:before {
  content: "\f840";
}

.fa-yandex:before {
  content: "\f413";
}

.fa-yandex-international:before {
  content: "\f414";
}

.fa-yarn:before {
  content: "\f7e3";
}

.fa-yelp:before {
  content: "\f1e9";
}

.fa-yen-sign:before {
  content: "\f157";
}

.fa-yin-yang:before {
  content: "\f6ad";
}

.fa-yoast:before {
  content: "\f2b1";
}

.fa-youtube:before {
  content: "\f167";
}

.fa-youtube-square:before {
  content: "\f431";
}

.fa-zhihu:before {
  content: "\f63f";
}

.sr-only {
  border: 0;
  clip: rect(0, 0, 0, 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.sr-only-focusable:active,
.sr-only-focusable:focus {
  clip: auto;
  height: auto;
  margin: 0;
  overflow: visible;
  position: static;
  width: auto;
}

@font-face {
  font-family: 'Font Awesome 5 Brands';
  font-style: normal;
  font-weight: 400;
  font-display: block;
  src: url("../webfonts/fa-brands-400.eot");
  src: url("../webfonts/fa-brands-400.eot?#iefix") format("embedded-opentype"), url("../webfonts/fa-brands-400.woff2") format("woff2"), url("../webfonts/fa-brands-400.woff") format("woff"), url("../webfonts/fa-brands-400.ttf") format("truetype"), url("../webfonts/fa-brands-400.svg#fontawesome") format("svg");
}

.fab {
  font-family: 'Font Awesome 5 Brands';
  font-weight: 400;
}

@font-face {
  font-family: 'Font Awesome 5 Free';
  font-style: normal;
  font-weight: 400;
  font-display: block;
  src: url("../webfonts/fa-regular-400.eot");
  src: url("../webfonts/fa-regular-400.eot?#iefix") format("embedded-opentype"), url("../webfonts/fa-regular-400.woff2") format("woff2"), url("../webfonts/fa-regular-400.woff") format("woff"), url("../webfonts/fa-regular-400.ttf") format("truetype"), url("../webfonts/fa-regular-400.svg#fontawesome") format("svg");
}

.far {
  font-family: 'Font Awesome 5 Free';
  font-weight: 400;
}

@font-face {
  font-family: 'Font Awesome 5 Free';
  font-style: normal;
  font-weight: 900;
  font-display: block;
  src: url("../webfonts/fa-solid-900.eot");
  src: url("../webfonts/fa-solid-900.eot?#iefix") format("embedded-opentype"), url("../webfonts/fa-solid-900.woff2") format("woff2"), url("../webfonts/fa-solid-900.woff") format("woff"), url("../webfonts/fa-solid-900.ttf") format("truetype"), url("../webfonts/fa-solid-900.svg#fontawesome") format("svg");
}

.fa,
.fas {
  font-family: 'Font Awesome 5 Free';
  font-weight: 900;
}

/* //font awesome css */

/* dark and light mode styling */
.mode-container {
  width: 24px;
  height: 24px;
  padding: 0px 0;
  margin-left: 10px;
  color: var(--heading-color);
}

.mode-container:hover {
  color: var(--primary-color);
}

.gg-sun {
  position: relative;
  transform: scale(var(--ggs, 1));
  height: 24px;
  background: linear-gradient(180deg, currentColor 4px, transparent 0) no-repeat 5px -6px/2px 6px, linear-gradient(180deg, currentColor 4px, transparent 0) no-repeat 5px 14px/2px 6px, linear-gradient(180deg, currentColor 4px, transparent 0) no-repeat -8px 5px/6px 2px, linear-gradient(180deg, currentColor 4px, transparent 0) no-repeat 14px 5px/6px 2px;
  border-radius: 100px;
  box-shadow: inset 0 0 0 2px;
  border: 6px solid transparent;
}

.gg-moon {
  overflow: hidden;
  position: relative;
  transform: rotate(-135deg) scale(var(--ggs, 1));
  width: 20px;
  height: 20px;
  border: 2px solid;
  border-bottom: 2px solid transparent;
}

.gg-moon,
.gg-moon:after {
  display: block;
  box-sizing: border-box;
  border-radius: 50%;
}

.nav-fixed .gg-moon,
.nav-fixed .gg-moon:after {
  color: var(--heading-color);
}

.gg-moon:after {
  content: "";
  position: absolute;
  width: 12px;
  height: 18px;
  border: 2px solid transparent;
  box-shadow: 0 0 0 2px;
  top: 8px;
  left: 2px;
}

.gg-sun,
.gg-sun:after,
.gg-sun:before {
  box-sizing: border-box;
  display: block;
  width: 24px;
}

.gg-sun:after,
.gg-sun:before {
  content: "";
  position: absolute;
  height: 2px;
  border-right: 4px solid;
  border-left: 4px solid;
  left: -6px;
  top: 5px;
}

.gg-sun:before {
  transform: rotate(-45deg);
}

.gg-sun:after {
  transform: rotate(45deg);
}

.mode-container i.gg-sun {
  display: none;
}

.mode-container i.gg-moon {
  display: block;
  cursor: pointer;
}

input:checked+.mode-container i.gg-sun {
  display: block;
  cursor: pointer;
}

input:checked+.mode-container i.gg-moon {
  display: none;
}

.nav-fixed .navbar .navbar-brand {
  color: var(--heading-color);
}

.nav-fixed .navbar-expand-lg .navbar-nav .nav-link {
  color: var(--heading-color);
}

.nav-fixed .navbar .navbar-brand:hover {
  color: var(--heading-color);
}

.nav-fixed .navbar-expand-lg .navbar-nav .show>.nav-link,
.nav-fixed .navbar-expand-lg .navbar-nav .active>.nav-link,
.nav-fixed .navbar-expand-lg .navbar-nav .nav-link.show,
.nav-fixed .navbar-expand-lg .navbar-nav .nav-link.active,
.nav-fixed .navbar-expand-lg .navbar-nav .nav-link:hover {
  color: var(--primary-color);
}

/* //dark and light mode styling */

/* Magnific Popup CSS */
.mfp-bg {
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1042;
  overflow: hidden;
  position: fixed;
  background: #0b0b0b;
  opacity: 0.8;
}

.mfp-wrap {
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1043;
  position: fixed;
  outline: none !important;
  -webkit-backface-visibility: hidden;
}

.mfp-container {
  text-align: center;
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  padding: 0 8px;
  box-sizing: border-box;
}

.mfp-container:before {
  content: '';
  display: inline-block;
  height: 100%;
  vertical-align: middle;
}

.mfp-align-top .mfp-container:before {
  display: none;
}

.mfp-content {
  position: relative;
  display: inline-block;
  vertical-align: middle;
  margin: 0 auto;
  text-align: left;
  z-index: 1045;
}

.mfp-inline-holder .mfp-content,
.mfp-ajax-holder .mfp-content {
  width: 100%;
  cursor: auto;
}

.mfp-ajax-cur {
  cursor: progress;
}

.mfp-zoom-out-cur,
.mfp-zoom-out-cur .mfp-image-holder .mfp-close {
  cursor: zoom-out;
}

.mfp-zoom {
  cursor: pointer;
  cursor: zoom-in;
}

.mfp-auto-cursor .mfp-content {
  cursor: auto;
}

.mfp-close,
.mfp-arrow,
.mfp-preloader,
.mfp-counter {
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.mfp-loading.mfp-figure {
  display: none;
}

.mfp-hide {
  display: none !important;
}

.mfp-preloader {
  color: #CCC;
  position: absolute;
  top: 50%;
  width: auto;
  text-align: center;
  margin-top: -0.8em;
  left: 8px;
  right: 8px;
  z-index: 1044;
}

.mfp-preloader a {
  color: #CCC;
}

.mfp-preloader a:hover {
  color: #FFF;
}

.mfp-s-ready .mfp-preloader {
  display: none;
}

.mfp-s-error .mfp-content {
  display: none;
}

button.mfp-close,
button.mfp-arrow {
  overflow: visible;
  cursor: pointer;
  border: 0;
  -webkit-appearance: none;
  display: block;
  outline: none;
  padding: 0;
  z-index: 1046;
  box-shadow: none;
  touch-action: manipulation;
}

button::-moz-focus-inner {
  padding: 0;
  border: 0;
}

.mfp-close {
  line-height: 40px;
  position: absolute;
  right: 0px;
  top: -40px;
  text-decoration: none;
  text-align: center;
  padding: 0 0 18px 10px;
  color: #FFF;
  font-style: normal;
  font-size: 28px;
  background: transparent;
}

.mfp-close-btn-in .mfp-close {
  color: #fff;
}

.mfp-image-holder .mfp-close,
.mfp-iframe-holder .mfp-close {
  color: #FFF;
  right: -6px;
  text-align: right;
  padding-right: 6px;
  width: 100%;
}

.mfp-counter {
  position: absolute;
  top: 0;
  right: 0;
  color: #CCC;
  font-size: 12px;
  line-height: 18px;
  white-space: nowrap;
}

.mfp-arrow {
  position: absolute;
  opacity: 0.65;
  margin: 0;
  top: 50%;
  margin-top: -55px;
  padding: 0;
  width: 90px;
  height: 110px;
  -webkit-tap-highlight-color: transparent;
}

.mfp-arrow:active {
  margin-top: -54px;
}

.mfp-arrow:hover,
.mfp-arrow:focus {
  opacity: 1;
}

.mfp-arrow:before,
.mfp-arrow:after {
  content: '';
  display: block;
  width: 0;
  height: 0;
  position: absolute;
  left: 0;
  top: 0;
  margin-top: 35px;
  margin-left: 35px;
  border: medium inset transparent;
}

.mfp-arrow:after {
  border-top-width: 13px;
  border-bottom-width: 13px;
  top: 8px;
}

.mfp-arrow:before {
  border-top-width: 21px;
  border-bottom-width: 21px;
  opacity: 0.7;
}

.mfp-arrow-left {
  left: 0;
}

.mfp-arrow-left:after {
  border-right: 17px solid #FFF;
  margin-left: 31px;
}

.mfp-arrow-left:before {
  margin-left: 25px;
  border-right: 27px solid #3F3F3F;
}

.mfp-arrow-right {
  right: 0;
}

.mfp-arrow-right:after {
  border-left: 17px solid #FFF;
  margin-left: 39px;
}

.mfp-arrow-right:before {
  border-left: 27px solid #3F3F3F;
}

.mfp-iframe-holder {
  padding-top: 40px;
  padding-bottom: 40px;
}

.mfp-iframe-holder .mfp-content {
  line-height: 0;
  width: 100%;
  max-width: 900px;
}

.mfp-iframe-holder .mfp-close {
  top: -40px;
}

.mfp-iframe-scaler {
  width: 100%;
  height: 0;
  overflow: hidden;
  padding-top: 56.25%;
}

.mfp-iframe-scaler iframe {
  position: absolute;
  display: block;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  box-shadow: 0 0 8px rgba(0, 0, 0, 0.6);
  background: #000;
}

/* Main image in popup */
img.mfp-img {
  width: auto;
  max-width: 100%;
  height: auto;
  display: block;
  line-height: 0;
  box-sizing: border-box;
  padding: 40px 0 40px;
  margin: 0 auto;
}

/* The shadow behind the image */
.mfp-figure {
  line-height: 0;
}

.mfp-figure:after {
  content: '';
  position: absolute;
  left: 0;
  top: 40px;
  bottom: 40px;
  display: block;
  right: 0;
  width: auto;
  height: auto;
  z-index: -1;
  box-shadow: 0 0 8px rgba(0, 0, 0, 0.6);
  background: #444;
}

.mfp-figure small {
  color: #BDBDBD;
  display: block;
  font-size: 12px;
  line-height: 14px;
}

.mfp-figure figure {
  margin: 0;
}

.mfp-bottom-bar {
  margin-top: -36px;
  position: absolute;
  top: 100%;
  left: 0;
  width: 100%;
  cursor: auto;
}

.mfp-title {
  text-align: left;
  line-height: 18px;
  color: #F3F3F3;
  word-wrap: break-word;
  padding-right: 36px;
}

.mfp-image-holder .mfp-content {
  max-width: 100%;
}

.mfp-gallery .mfp-image-holder .mfp-figure {
  cursor: pointer;
}

@media screen and (max-width: 800px) and (orientation: landscape),
screen and (max-height: 300px) {

  /**
       * Remove all paddings around the image on small screen
       */
  .mfp-img-cont-ser .mfp-image-holder {
    padding-left: 0;
    padding-right: 0;
  }

  .mfp-img-cont-ser img.mfp-img {
    padding: 0;
  }

  .mfp-img-cont-ser .mfp-figure:after {
    top: 0;
    bottom: 0;
  }

  .mfp-img-cont-ser .mfp-figure small {
    display: inline;
    margin-left: 5px;
  }

  .mfp-img-cont-ser .mfp-bottom-bar {
    background: rgba(0, 0, 0, 0.6);
    bottom: 0;
    margin: 0;
    top: auto;
    padding: 3px 5px;
    position: fixed;
    box-sizing: border-box;
  }

  .mfp-img-cont-ser .mfp-bottom-bar:empty {
    padding: 0;
  }

  .mfp-img-cont-ser .mfp-counter {
    right: 5px;
    top: 3px;
  }

  .mfp-img-cont-ser .mfp-close {
    top: 0;
    right: 0;
    width: 35px;
    height: 35px;
    line-height: 35px;
    background: rgba(0, 0, 0, 0.6);
    position: fixed;
    text-align: center;
    padding: 0;
  }
}

@media all and (max-width: 900px) {
  .mfp-arrow {
    transform: scale(0.75);
  }

  .mfp-arrow-left {
    transform-origin: 0;
  }

  .mfp-arrow-right {
    transform-origin: 100%;
  }

  .mfp-container {
    padding-left: 6px;
    padding-right: 6px;
  }
}

/* Styles for dialog window */
#small-dialog {
  max-width: 750px;
  margin: 40px auto;
  position: relative;
}

div#small-dialog iframe {
  width: 100%;
  height: 420px;
  display: block;
  border-radius: 10px;
}

/**
   * Fade-zoom animation for first dialog
   */
/* start state */
.my-mfp-zoom-in .zoom-anim-dialog {
  opacity: 0;
  transition: all 0.2s ease-in-out;
  transform: scale(0.8);
}

/* animate in */
.my-mfp-zoom-in.mfp-ready .zoom-anim-dialog {
  opacity: 1;
  transform: scale(1);
}

/* animate out */
.my-mfp-zoom-in.mfp-removing .zoom-anim-dialog {
  transform: scale(0.8);
  opacity: 0;
}

/* Dark overlay, start state */
.my-mfp-zoom-in.mfp-bg {
  opacity: 0;
  transition: opacity 0.3s ease-out;
}

/* animate in */
.my-mfp-zoom-in.mfp-ready.mfp-bg {
  opacity: 0.95;
}

/* animate out */
.my-mfp-zoom-in.mfp-removing.mfp-bg {
  opacity: 0;
}

/**
   * Fade-move animation for second dialog
   */
/* at start */
.my-mfp-slide-bottom .zoom-anim-dialog {
  opacity: 0;
  transition: all 0.2s ease-out;
  transform: translateY(-20px) perspective(600px) rotateX(10deg);
}

/* animate in */
.my-mfp-slide-bottom.mfp-ready .zoom-anim-dialog {
  opacity: 1;
  transform: translateY(0) perspective(600px) rotateX(0);
}

/* animate out */
.my-mfp-slide-bottom.mfp-removing .zoom-anim-dialog {
  opacity: 0;
  transform: translateY(-10px) perspective(600px) rotateX(10deg);
}

/* Dark overlay, start state */
.my-mfp-slide-bottom.mfp-bg {
  opacity: 0;
  transition: opacity 0.3s ease-out;
}

/* animate in */
.my-mfp-slide-bottom.mfp-ready.mfp-bg {
  opacity: 0.8;
}

/* animate out */
.my-mfp-slide-bottom.mfp-removing.mfp-bg {
  opacity: 0;
}

/* //Magnific Popup CSS */

/* movetop styling */
#movetop {
  position: fixed;
  bottom: 90px;
  right: 15px;
  z-index: 9;
  font-size: 16px;
  border: none;
  outline: none;
  cursor: pointer;
  color: #fff;
  width: 40px;
  height: 40px;
  background: var(--primary-color);
  border-radius: 50%;
  -webkit-border-radius: 50%;
  -o-border-radius: 50%;
  -moz-border-radius: 50%;
  -ms-border-radius: 50%;
  padding: 0;
}

#movetop:hover {
  opacity: .8;
}

/* //movetop styling */

/* header */
/* navigation styling */
.navbar .navbar-brand {
  margin: 0;
  padding: 0;
  font-size: 34px;
  font-weight: 600;
  color: var(--heading-color);
  margin-left: 28px;
}

.navbar .navbar-brand i {
  color: var(--primary-color);
  transform: rotate(-45deg);
  position: absolute;
  left: 0px;
  top: 0px;
}

.navbar-light .navbar-brand:hover,
.navbar-light .navbar-brand:focus {
  color: var(--heading-color);
}

.navbar-expand-lg .navbar-nav .nav-item {
  padding: 0 16px;
}

.navbar-nav .nav-link:focus {
  color: var(--primary-color);
}

.navbar-expand-lg .navbar-nav .show>.nav-link,
.navbar-expand-lg .navbar-nav .active>.nav-link,
.navbar-expand-lg .navbar-nav .nav-link.show,
.navbar-expand-lg .navbar-nav .nav-link.active,
.navbar-expand-lg .navbar-nav .nav-link:hover {
  color: var(--primary-color);
}

.navbar-expand-lg .navbar-nav .nav-link {
  padding: 0;
  font-size: 16px;
  color: var(--heading-color);
  font-weight: 500;
  padding: 0px;
}

.navbar-nav .dropdown-menu li {
  width: 100%;
}

a.dropdown-item {
  font-size: 16px;
  color: var(--heading-color);
  padding: 5px 24px;
  font-weight: 600;
}

a.dropdown-item:hover {
  color: var(--primary-color);
  background: none;
}

a.dropdown-item.active {
  background: transparent;
  color: var(--primary-color);
}

.navbar-expand-lg .navbar-nav .dropdown-menu {
  transform: translateX(-30px);
  background: var(--bg-color);
  border: 1px solid var(--border-color);
  box-shadow: rgb(12 12 12 / 6%) 0px 1px 20px 0px;
}

.navbar-expand-lg .navbar-nav .dropdown-menu:before {
  content: '';
  width: 14px;
  height: 14px;
  background: var(--bg-color);
  border: 1px solid var(--border-color);
  display: block;
  border-right: none;
  border-bottom: none;
  transform: translateX(-50%) rotateZ(45deg);
  position: absolute;
  top: -7px;
  left: 49%;
  z-index: 1001;
}

header {
  background-color: transparent;
  padding: 0;
  transition: all 0.4s ease 0s;
  height: 90px;
  display: grid;
  align-items: center;
  /* box-shadow: 0 3px 9px rgba(0, 0, 0, 0.05); */
}

header.nav-fixed {
  padding: 0;
  background-color: var(--bg-color);
  height: 80px;
  border-bottom: none;
  box-shadow: 0 3px 6px 0 rgba(0, 0, 0, 0.05);
  z-index: 10 !important;
  /* for z-index:10 to display gallery popup */
}

.dropdown-toggle::after {
  display: none;
}

/*-- search --*/
.navbar .search-btn i {
  color: var(--heading-color);
}

.nav-fixed .navbar .search-btn i {
  color: var(--heading-color);
}

.nav-fixed .search-right a {
  color: var(--heading-color);
}

.navbar .search-right a:hover {
  color: #fff;
  opacity: 1;
}

.navbar form.search-box {
  display: flex;
}

.navbar .search-right .popup form input[type="search"] {
  font-style: normal;
  font-weight: normal;
  font-size: 30px;
  line-height: 20px;
  color: var(--heading-color);
  border: none;
  height: 60px;
  background: var(--bg-color);
  padding: 45px 30px;
  width: 100%;
  border-radius: 0;
}

.navbar .search-right .popup form button {
  border: none;
  cursor: pointer;
  font-size: 28px;
  text-align: center;
  color: #fff;
  width: 90px;
  background: var(--primary-color);
  line-height: 35px;
  display: inline-block;
  transition: 0.5s ease-out;
  font-weight: 700;
  display: block;
  height: 90px;
  line-height: 70px;
  margin: 0 auto;
  border-radius: 0;
}

.navbar .search-right .popup form button:hover {
  background: var(--secondary-color);
  color: #fff;
  outline: none;
  border: none;
}

.navbar .search-right .popup form input:focus {
  outline: none;
  border: none;
}

.navbar .search-right .pop-overlay {
  position: fixed;
  top: 0px;
  left: 0;
  right: 0;
  transition: opacity 0ms;
  visibility: hidden;
  opacity: 0;
  z-index: 99;
  background: rgba(25, 23, 23, 0.81);
  box-shadow: 1px 1px 4px 0 rgba(0, 0, 0, 0.85);
  height: 100vh;
}

.navbar .search-right .pop-overlay:target {
  visibility: visible;
  opacity: 1;
}

.navbar .search-right .popup {
  margin: 0rem auto;
  padding: 40px 50px;
  max-width: 700px;
  border-radius: 3px;
  position: relative;
  top: 50%;
  transform: translateY(-50%);
}

.navbar .search-right .search-top {
  display: grid;
  grid-template-columns: auto 1fr 1fr;
  grid-gap: 30px;
  margin-top: 24px;
}

.navbar .search-right .search-top h4 {
  font-size: 20px;
  color: #fff;
  margin-bottom: 16px;
}

.navbar .search-right .search-top span.fa {
  padding-right: 10px;
}

.navbar .search-right .search-top li {
  display: block;
}

.navbar .search-right .search-top li a {
  font-size: 16px;
  color: #fff;
  line-height: 28px;
}

.navbar .search-right .search-top li a:hover {
  color: #fff;
}

.navbar .search-right .close {
  position: absolute;
  top: 14px;
  right: 0;
  font-size: 40px;
  color: #fff;
  margin-right: 4.3em;
}

.navbar .search-right .close:hover {
  opacity: 0.8;
  background: none;
}

/*--//search--*/
/* serach */
.search-header input {
  font-size: 15px;
  border-radius: 30px 0 0 30px;
  background: var(--bg-color);
  padding: 8px 15px;
  color: var(--heading-color);
  border: 2px solid var(--border-color-light);
  border-right: none;
}

.search-header input:focus {
  box-shadow: none;
  border-color: var(--border-color-light);
  background: var(--bg-color);
  color: var(--heading-color);
}

.search-header button.btn-style {
  border-radius: 0 30px 30px 0;
  box-shadow: none;
  padding: 6px 16px;
  font-size: 15px;
}

.search-header button.btn-style:hover {
  color: var(--secondary-color);
  color: #fff;
}

.nav-fixed .navbar .navbar-brand {
  color: var(--heading-color);
}

/* //serach */
@media only screen and (max-width: 991px) {
  header.nav-fixed {
    height: auto;
    padding: 14px 0;
  }

  header {
    height: auto;
    padding: 17px 0;
  }

  nav.navbar.navbar-expand-lg.navbar-light {
    padding: 0;
  }

  .navbar-collapse {
    max-height: calc(100vh - 80px);
    overflow-y: scroll;
  }

  .navbar-toggler {
    padding: 0rem !important;
    border: none;
  }

  .navbar-toggler:focus {
    box-shadow: none;
  }

  .navbar-collapse {
    float: left;
    text-align: center;
    width: 100%;
    background: var(--bg-color);
    padding: 20px;
    box-shadow: 0 6px 19px rgba(0, 0, 0, 0.05);
  }

  .navbar-expand-lg .navbar-nav .nav-item {
    padding: 6px 0px;
  }

  .navbar-nav .dropdown-menu {
    text-align: center;
  }

  .navbar-expand-lg .navbar-nav .nav-link {
    display: inline-block;
    text-align: center;
  }

  .navbar-expand-lg .navbar-nav .dropdown-menu {
    transform: translateX(0px);
    border: 1px solid var(--border-color-light);
  }

  .navbar-expand-lg .navbar-nav .dropdown-menu:before {
    border: 1px solid var(--border-color-light);
    border-right: none;
    border-bottom: none;
  }

  .navbar-toggler-icon {
    background-image: none;
    padding: 0;
    width: 34px;
    height: 34px;
    display: inline-block;
    background: #272121;
    border-radius: 4px;
    text-align: center;
  }

  .navbar-toggler-icon.fa {
    font-size: 20px;
    line-height: 1.2em;
    background: var(--primary-color);
    line-height: 34px;
    color: #fff;
  }

  .nav-fixed .navbar-expand-lg .navbar-nav .nav-link {
    color: var(--heading-color);
  }

  button.navbar-toggler .icon-close {
    display: block;
  }

  button.navbar-toggler .icon-expand {
    display: none;
  }

  button.navbar-toggler.collapsed .icon-close {
    display: none;
  }

  button.navbar-toggler.collapsed .icon-expand {
    display: block;
  }

  .cont-ser-position {
    position: absolute;
    right: 50px;
    top: 17px;
  }

  .navbar .search-right .close {
    margin-right: 3em;
  }

  .navbar .navbar-brand i {
    left: 1px;
    top: -7px;
  }
}

@media only screen and (max-width: 768px) {
  .navbar .search-right .close {
    margin-right: 2em;
  }
}

@media only screen and (max-width: 568px) {
  .navbar .search-right .close {
    margin-right: 1.5em;
  }
}

@media only screen and (max-width: 480px) {
  .cont-ser-position {
    top: 14px;
  }

  .navbar .search-right .popup form input[type="search"] {
    font-size: 22px;
    padding: 35px 20px;
  }

  .navbar .search-right .popup form button {
    font-size: 20px;
    height: 70px;
    line-height: 60px;
  }

  .navbar .search-right .popup {
    padding: 40px 20px;
  }

  .navbar .search-right .close {
    margin-right: 1em;
  }
}

/* //navigation styling */
/* //header  */

/* button style */
.btn-style {
  padding: 12px 36px 14px;
  font-size: 16px;
  color: #fff;
  border-radius: var(--border-radius-full);
  font-weight: bold;
  outline: none;
  border: none;
  background: var(--primary-color);
  transition: all 1.8s ease-in-out;
}

.btn-style:hover {
  color: #fff;
  background: var(--secondary-color);
}

.btn-style-2 {
  color: var(--heading-color);
  background: var(--bg-color);
}

.btn-style-2:hover {
  color: #fff;
  background: var(--primary-color);
}

.btn-style-3 {
  background: var(--secondary-color);
}

.btn-style-3:hover {
  background: var(--primary-color);
}

.btn-style-primary {
  padding: 0;
  font-weight: 600;
  font-size: 15px;
  color: var(--heading-color);
}

.btn-style-primary:hover {
  color: var(--primary-color);
}

.btn-style-primary i {
  margin-left: 4px;
}

/* //button style */

/* title style */
h3.title-style {
  font-size: 45px;
  line-height: 55px;
  font-weight: bold;
}

@media (max-width:991px) {
  h3.title-style {
    font-size: 40px;
    line-height: 50px;
  }
}

@media (max-width:568px) {
  h3.title-style {
    font-size: 35px;
    line-height: 45px;
  }
}

@media (max-width:320px) {
  h3.title-style {
    font-size: 30px;
    line-height: 40px;
  }
}

/* //title style */

/* banner section */
.w3l-banner {
  background-size: 400% 400%;
  animation: gradient 15s ease infinite;
  min-height: 100vh;
  position: relative;
  z-index: 1;
  background: url(../images/banner.jpg) no-repeat center;
}

.w3l-banner:before {
  content: "";
  position: absolute;
  width: 100%;
  height: 100%;
  background: var(--banner-layer);
  z-index: -1;
  top: 0;
}

@keyframes gradient {
  0% {
    background-position: 0% 50%;
  }

  50% {
    background-position: 100% 50%;
  }

  100% {
    background-position: 0% 50%;
  }
}

.w3l-banner {
  display: grid;
  align-items: center;
  min-height: 100vh;
}

h4.small-text-banner {
  font-size: 22px;
  font-weight: 400;
  margin-bottom: 5px;
}

.w3l-banner h3 {
  font-size: 74px;
  line-height: 84px;
  font-weight: 700;
}

.w3l-banner h3 span {
  font-weight: 100;
}

p.banner-sub {
  font-size: 20px;
  line-height: 30px;
}

.sub-banner-image {
  border-radius: 67% 33% 28% 72% / 59% 51% 49% 41%;
  text-align: center;
  max-width: 450px;
  max-height: 450px;
  background: var(--gradient-color-banner);
  margin-top: 80px;
}

.sub-banner-image img {
  position: absolute;
  top: -162px;
  right: 0px;
}

.banner-style-1 {
  top: 0;
  left: -20px;
}

.banner-style-2 {
  background: var(--secondary-color);
  padding: 25px 30px;
  border-radius: 50%;
}

.banner-style-2 h4 {
  color: #fff;
}

.banner-style-2:before {
  content: "";
  position: absolute;
  top: 99%;
  left: 50%;
  margin-left: 0px;
  border-width: 10px;
  border-style: solid;
  border-color: var(--secondary-color) var(--secondary-color) transparent transparent;
}

@media (max-width: 1440px) {
  .sub-banner-image {
    max-width: 400px;
    max-height: 400px;
  }

  .sub-banner-image img {
    width: 94%;
  }
}

@media (max-width: 1200px) {
  .banner-style-2 h4 {
    font-size: 18px;
  }

  .banner-style-2 {
    padding: 20px 30px;
  }
}

@media (max-width: 1050px) {
  .sub-banner-image {
    max-width: 360px;
    max-height: 360px;
  }
}

@media (max-width: 1199px) {
  .w3l-banner h3 {
    font-size: 55px;
    line-height: 65px;
  }

  p.banner-sub {
    font-size: 16px;
    line-height: 28px;
  }
}

@media (max-width:991px) {
  .w3l-banner {
    animation: gradient 30s ease infinite;
  }

  .w3l-banner h3 {
    font-size: 45px;
    line-height: 55px;
  }

  .sub-banner-image {
    max-width: 320px;
    max-height: 320px;
  }

  .sub-banner-image img {
    top: -130px;
  }

  .banner-style-1 {
    left: -60px;
  }
}

@media (max-width: 768px) {
  .banner-style-1 {
    left: 0px;
  }
}

@media (max-width: 480px) {
  .w3l-banner h3 {
    font-size: 40px;
    line-height: 45px;
  }

  p.banner-sub {
    font-size: 15px;
    line-height: 26px;
  }
}

@media (max-width: 414px) {
  .sub-banner-image {
    margin-top: 7em;
  }

  .banner-style-2 h4 {
    font-size: 16px;
  }
}

@media (max-width: 330px) {
  .w3l-banner h3 {
    font-size: 35px;
    line-height: 40px;
  }
}

/* //banner section */

/* home 4grids block */
.services-w3l-block .icon-box {
  padding: 30px;
  position: relative;
  overflow: hidden;
  background: var(--bg-color);
  box-shadow: var(--box-shadow);
  transition: all 0.3s ease-in-out;
  text-align: center;
  border: 1px solid var(--bg-color);
}

.services-w3l-block .icon i {
  margin: 0 auto 20px auto;
  display: inline-block;
  text-align: center;
  border-radius: 50%;
  width: 72px;
  height: 72px;
  font-size: 34px;
  line-height: 72px;
}

.services-w3l-block .title a {
  font-weight: bold;
  margin-bottom: 15px;
  font-size: 23px;
  line-height: 33px;
  color: var(--heading-color);
  display: block;
}

.services-w3l-block .title a:hover {
  color: var(--secondary-color);
}

.services-w3l-block .icon-box-clr-1 .icon i {
  background: rgb(245 112 118 / 14%);
  color: #fd5c63;
}

.services-w3l-block .icon-box-clr-1:hover {
  border-color: #fd5c63;
}

.services-w3l-block .icon-box-clr-2 .icon i {
  background: rgb(0 164 228 / 8%);
  color: #00a4e4;
}

.services-w3l-block .icon-box-clr-2:hover {
  border-color: #00a4e4;
}

.services-w3l-block .icon-box-clr-3 .icon i {
  background: rgb(249 188 46 / 10%);
  color: #ffc845;
}

.services-w3l-block .icon-box-clr-3:hover {
  border-color: #ffc845;
}

.services-w3l-block .icon-box-clr-4 .icon i {
  background: rgb(0 193 110 / 9%);
  color: #00c16e;
}

.services-w3l-block .icon-box-clr-4:hover {
  border-color: #00c16e;
}

/* //home 4grids block */

/* home image with content block */
.w3l-servicesblock ul.list-style-lis li {
  margin-top: 14px;
}

.w3l-servicesblock ul.list-style-lis li i {
  color: var(--primary-color);
  margin-right: 6px;
}

.imginfo__box {
  background-color: var(--bg-color);
  color: #fff;
  position: absolute;
  right: -60px;
  bottom: -100px;
  padding: 35px 40px 38px;
  box-shadow: var(--box-shadow);
  border-radius: var(--border-radius);
}

.imginfo__box .imginfo__title {
  font-size: 20px;
  line-height: 30px;
  font-weight: 700;
  margin-bottom: 10px;
}

.imginfo__box a {
  font-size: 22px;
  font-weight: 600;
  line-height: 32px;
  margin-top: 20px;
  display: block;
}

.imginfo__box a i {
  color: var(--primary-color);
}

@media (max-width: 1199px) {
  .imginfo__box {
    right: 18px;
  }
}

@media (max-width: 991px) {
  .imginfo__box {
    bottom: -60px;
  }
}

@media (max-width: 855px) {
  .home-block-3-left::before {
    right: -10px;
  }
}

@media (max-width: 840px) {
  .home-block-3-left::before {
    right: -50px;
  }
}

@media (max-width: 820px) {
  .home-block-3-left::before {
    right: -40px;
  }
}

@media (max-width: 800px) {
  .home-block-3-left::before {
    right: -20px;
  }
}

@media (max-width: 780px) {
  .home-block-3-left::before {
    right: -10px;
  }
}

@media (max-width: 580px) {
  .home-block-3-left::before {
    right: 0px;
  }
}

@media (max-width: 440px) {
  .left-wthree-img {
    padding-left: 10px;
    padding-right: 10px;
  }

  .imginfo__box {
    position: static;
    margin-top: 15px;
  }

  .col-xl-5.col-lg-6.offset-xl-1.mt-lg-0.mt-5.pt-lg-0.pt-5 {
    padding-top: 0 !important;
    margin-top: 1em !important;
  }
}

/* //home image with content block */

/* courses section */
.home-course-bg {
  background: var(--bg-grey);
}

.top-content-border h6 {
  font-size: 20px;
  font-weight: bold;
}

.w3l-grids-block-6 {
  background: var(--bg-color);
}

.w3l-grids-block-5 .content-main-top h4 a {
  color: var(--heading-color);
  font-size: 22px;
  margin-bottom: 8px;
  display: block;
  font-weight: 600;
  line-height: 32px;
}

.w3l-grids-block-5 .content-main-top h4 a:hover {
  color: var(--primary-color);
}

.w3l-grids-block-5 .coursecard-single {
  box-shadow: 0px 30px 40px 0px rgb(1 11 60 / 10%);
  transition: .3s ease;
  -webkit-transition: .3s ease;
  background: var(--bg-color);
  border-radius: var(--border-radius);
}

.w3l-grids-block-5 .grids5-info {
  overflow: hidden;
  border-top-left-radius: 8px;
  border-top-right-radius: 8px;
}

.w3l-grids-block-5 .grids5-info img {
  display: block;
  width: 100%;
  border-top-left-radius: 8px;
  border-top-right-radius: 8px;
  transition: 0.3s ease-in-out;
}

.w3l-grids-block-5 .coursecard-single:hover img {
  overflow: hidden;
  transform: scale(1.1);
  transition: 0.3s ease-in-out;
}

.w3l-grids-block-5 .content-main-top {
  padding: 20px;
  border: none;
  border-bottom-left-radius: 8px;
  border-bottom-right-radius: 8px;
}

ul.rating-list li {
  display: inline-block;
}

ul.rating-list li a {
  color: #ffc949;
  font-size: 15px;
}

ul.rating-list li a.review-color {
  color: var(--heading-color);
}

.meta-list {
  position: absolute;
  left: 30px;
  top: 15px;
}

.meta-list a {
  background: #1DC295;
  display: inline-block;
  border-radius: 3px;
  font-size: 12px;
  font-weight: 600;
  padding: 4px 10px;
  color: #FFFFFF !important;
  text-transform: capitalize;
  display: inline-block;
  margin-right: 5px;
}

.meta-list a.sec-2 {
  background-color: #FFA100;
}

.meta-list a.sec-3 {
  background: #037ef3;
}

.course-price-item {
  position: absolute;
  right: 25px;
  bottom: -15px;
}

.content-top li {
  color: var(--heading-color);
}

.content-top li i.fa-book-open {
  color: var(--secondary-color);
}

.content-top li i.fa-star {
  color: var(--primary-color);
}

.top-content-border {
  border-top: 1px solid var(--border-color-light)
}

/* //courses section */

/* why choose block */
.w3l-service-1 .content23-grid {
  background-size: cover;
  min-height: 300px;
  display: grid;
  align-content: center;
  position: relative;
  z-index: 1;
  border-radius: var(--border-radius);
  overflow: hidden;
  padding: 50px 30px;
  transition: .5s;
}

.w3l-service-1 .content23-grid:hover:before {
  background: rgb(0 110 165 / 79%);
  transform: scale(1);
  transition: .5s;
}

.w3l-service-1 .content23-grid1 {
  background: url("../images/bg1.jpg") no-repeat center;
  background-size: cover;
}

.w3l-service-1 .content23-grid2 {
  background: url("../images/bg2.jpg") no-repeat center;
  background-size: cover;
}

.w3l-service-1 .content23-grid:before {
  content: '';
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  background: rgb(4 4 4 / 50%);
  z-index: -1;
  border-radius: var(--border-radius);
}

.w3l-service-1 .content23-grid h4 a {
  font-size: 30px;
  line-height: 40px;
  text-align: center;
  color: #fff;
  display: inline-block;
  font-weight: bold;
}

.w3l-service-1 .content23-grid h4 a:hover {
  color: var(--primary-color);
}

@media all and (max-width: 768px) {
  .w3l-service-1 .content23-grid {
    padding: 60px 20px;
  }

  .w3l-service-1 .content23-grid h4 a {
    font-size: 24px;
  }
}

@media all and (max-width: 568px) {
  .w3l-service-1 .content23-grid {
    min-height: 250px;
  }
}

@media all and (max-width: 500px) {
  .w3l-service-1 .content23-grid h4 a {
    font-size: 22px;
  }
}

/* //why choose block */

/* stats block */
.counter i {
  color: var(--secondary-color);
  text-align: center;
  width: 80px;
  height: 80px;
  line-height: 80px;
  border-radius: 50%;
  background: rgb(210 128 75 / 6%);
  font-size: 32px;
}

.timer {
  font-size: 2.5em;
  font-weight: 600;
  color: var(--heading-color);
}

p.count-text {
  color: var(--heading-color);
}

@media (max-width: 1080px) {
  .timer {
    font-size: 2.5em;
  }
}

@media (max-width: 991px) {
  .timer {
    font-size: 2em;
  }

  p.count-text {
    font-size: 14px;
    line-height: 22px;
  }

  .w3-stats .col-md-3 {
    display: grid;
    align-items: stretch;
  }
}

/* //stats block */

/* blog block */
.w3l-blog-block-5 .grids5-info h4 a {
  color: var(--heading-color);
  font-size: 22px;
  line-height: 32px;
  display: block;
  font-weight: bold;
  margin-bottom: 10px;
}

.blog-card-single {
  border: 1px solid var(--border-color-light);
  box-shadow: 0px 30px 40px 0px rgb(1 11 60 / 10%);
  transition: .3s ease;
  -webkit-transition: .3s ease;
  background: var(--bg-color);
  border-radius: var(--border-radius);
}

.w3l-blog-block-5 .blog-card-single:hover h4 a {
  color: var(--primary-color);
}

.w3l-blog-block-5 .grids5-info p.date-text {
  font-size: 14px;
}

.w3l-blog-block-5 .grids5-info p.date-text i {
  color: var(--primary-color);
}

.w3l-blog-block-5 .grids5-info span.small {
  font-weight: 500;
}

.w3l-blog-block-5 .grids5-info a {
  overflow: hidden;
  display: block;
  border-top-left-radius: var(--border-radius);
  border-top-right-radius: var(--border-radius);
}

.w3l-blog-block-5 .grids5-info a img {
  display: block;
  width: 100%;
  border-top-left-radius: var(--border-radius);
  border-top-right-radius: var(--border-radius);
  transition: 0.3s ease-in-out;
}

.w3l-blog-block-5 .grids5-info:hover img {
  overflow: hidden;
  transform: scale(1.1);
  transition: 0.3s ease-in-out;
}

.w3l-blog-block-5 .grids5-info:hover .blog-info img {
  transform: scale(1);
}

.w3l-blog-block-5 .blog-info {
  padding: 25px;
  background: var(--bg-color);
  border-radius: var(--border-radius);
}

.blog-info img {
  border-radius: 50% !important;
}

.w3l-blog-block-5 .col-lg-4.col-md-6 {
  display: flex;
  align-items: stretch;
}

/* pagination blog page */
.pagination-style {
  display: block;
}

.pagination-style ul li {
  display: inline-block;
}

.pagination-style ul li span.fa {
  color: var(--heading-color);
}

.pagination-style ul li a:hover span.fa {
  color: #fff;
}

.pagination-style a {
  display: inline-block;
  color: var(--heading-color);
  width: 40px;
  height: 40px;
  text-align: center;
  line-height: 40px;
  border-radius: 50%;
  font-weight: 600;
}

.pagination-style a span {
  margin: 0;
}

.pagination-style a.active,
.pagination-style a:hover {
  background-color: var(--secondary-color);
  color: #fff;
}

.pagination-style ul li a.not-allowed span.fa {
  cursor: not-allowed;
  color: #c3c2c2;
}

.pagination-style .not-allowed:hover {
  opacity: 1;
  background: transparent;
  color: #c3c2c2;
}

/* //pagination blog page */
@media all and (max-width: 1200px) {
  .section-heading p.lead {
    font-size: 1.1rem;
  }
}

@media all and (max-width: 768px) {
  .section-heading p.lead {
    font-size: 1rem;
  }
}

@media all and (max-width: 414px) {
  .w3l-blog-block-5 .wrapper {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
  }
}

@media all and (max-width: 375px) {
  .w3l-blog-block-5 .grids5-info h4 a {
    font-size: 20px;
  }
}

/* //blog block */

/* testimonials block */
.w3l-index4 {
  background: url(../images/bg3.jpg) no-repeat;
  background-size: cover;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  -ms-background-size: cover;
  position: relative;
  z-index: 0;
}

.w3l-index4:before {
  content: "";
  background: var(--layer);
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  z-index: -1;
}

.w3l-index4 * {
  transition: none;
}

.w3l-index4 .head-bg {
  width: 70%;
  margin: 0 auto;
}

.w3l-index4 .content-slider {
  width: 100%;
}

.w3l-index4 .clients-slider {
  max-width: 680px;
  margin: 0 auto;
  overflow: visible;
  position: relative;
}

.w3l-index4 .mask {
  overflow: hidden;
  height: 320px;
}

.w3l-index4 .clients-slider ul {
  margin: 0;
  padding: 0;
  position: relative;
}

.w3l-index4 .clients-slider li {
  width: 100%;
  height: 320px;
  position: absolute;
  top: -325px;
  list-style: none;
}

.w3l-index4 .clients-slider .quote {
  font-size: 20px;
  line-height: 38px;
  color: #fff;
  margin-top: .5rem;
}

.w3l-index4 .clients-slider .source {
  font-size: 30px;
  margin-top: 1.5rem;
  color: #fff;
  font-weight: bold;
}

.w3l-index4 .clients-slider li img {
  width: 100px;
}

.w3l-index4 .clients-slider li.anim1 {
  -webkit-animation: cycle 15s linear infinite;
  animation: cycle 15s linear infinite;
}

.w3l-index4 .clients-slider li.anim2 {
  -webkit-animation: cycle2 15s linear infinite;
  animation: cycle2 15s linear infinite;
}

.w3l-index4 .clients-slider li.anim3 {
  -webkit-animation: cycle3 15s linear infinite;
  animation: cycle3 15s linear infinite;
}

.w3l-index4 .clients-slider li.anim4 {
  -webkit-animation: cycle4 15s linear infinite;
  animation: cycle4 15s linear infinite;
}

.w3l-index4 .clients-slider li.anim5 {
  -webkit-animation: cycle5 15s linear infinite;
  animation: cycle5 15s linear infinite;
}

.w3l-index4 .clients-slider:hover li {
  -webkit-animation-play-state: paused;
  animation-play-state: paused;
}

@-webkit-keyframes cycle {
  0% {
    top: 0px;
  }

  4% {
    top: 0px;
  }

  16% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  20% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  21% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  50% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  92% {
    top: -325px;
    opacity: 0;
    z-index: 0;
  }

  96% {
    top: -325px;
    opacity: 0;
  }

  100% {
    top: 0px;
    opacity: 1;
  }
}

@keyframes cycle {
  0% {
    top: 0px;
  }

  4% {
    top: 0px;
  }

  16% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  20% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  21% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  50% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  92% {
    top: -325px;
    opacity: 0;
    z-index: 0;
  }

  96% {
    top: -325px;
    opacity: 0;
  }

  100% {
    top: 0px;
    opacity: 1;
  }
}

@-webkit-keyframes cycle2 {
  0% {
    top: -325px;
    opacity: 0;
  }

  16% {
    top: -325px;
    opacity: 0;
  }

  20% {
    top: 0px;
    opacity: 1;
  }

  24% {
    top: 0px;
    opacity: 1;
  }

  36% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  40% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  41% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@keyframes cycle2 {
  0% {
    top: -325px;
    opacity: 0;
  }

  16% {
    top: -325px;
    opacity: 0;
  }

  20% {
    top: 0px;
    opacity: 1;
  }

  24% {
    top: 0px;
    opacity: 1;
  }

  36% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  40% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  41% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@-webkit-keyframes cycle3 {
  0% {
    top: -325px;
    opacity: 0;
  }

  36% {
    top: -325px;
    opacity: 0;
  }

  40% {
    top: 0px;
    opacity: 1;
  }

  44% {
    top: 0px;
    opacity: 1;
  }

  56% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  60% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  61% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@keyframes cycle3 {
  0% {
    top: -325px;
    opacity: 0;
  }

  36% {
    top: -325px;
    opacity: 0;
  }

  40% {
    top: 0px;
    opacity: 1;
  }

  44% {
    top: 0px;
    opacity: 1;
  }

  56% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  60% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  61% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@-webkit-keyframes cycle4 {
  0% {
    top: -325px;
    opacity: 0;
  }

  56% {
    top: -325px;
    opacity: 0;
  }

  60% {
    top: 0px;
    opacity: 1;
  }

  64% {
    top: 0px;
    opacity: 1;
  }

  76% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  80% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  81% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@keyframes cycle4 {
  0% {
    top: -325px;
    opacity: 0;
  }

  56% {
    top: -325px;
    opacity: 0;
  }

  60% {
    top: 0px;
    opacity: 1;
  }

  64% {
    top: 0px;
    opacity: 1;
  }

  76% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  80% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }

  81% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }

  100% {
    top: -325px;
    opacity: 0;
    z-index: -1;
  }
}

@-webkit-keyframes cycle5 {
  0% {
    top: -325px;
    opacity: 0;
  }

  76% {
    top: -325px;
    opacity: 0;
  }

  80% {
    top: 0px;
    opacity: 1;
  }

  84% {
    top: 0px;
    opacity: 1;
  }

  96% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  100% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }
}

@keyframes cycle5 {
  0% {
    top: -325px;
    opacity: 0;
  }

  76% {
    top: -325px;
    opacity: 0;
  }

  80% {
    top: 0px;
    opacity: 1;
  }

  84% {
    top: 0px;
    opacity: 1;
  }

  96% {
    top: 0px;
    opacity: 1;
    z-index: 0;
  }

  100% {
    top: 325px;
    opacity: 0;
    z-index: 0;
  }
}

@media screen and (max-width: 1080px) {
  .w3l-index4 .clients-slider .quote {
    font-size: 18px;
    line-height: 30px;
  }

  .w3l-index4 .clients-slider .source {
    font-size: 30px;
  }

  .w3l-index4 .mask {
    height: 280px;
  }
}

@media screen and (max-width: 500px) {
  .w3l-index4 .clients-slider .source {
    font-size: 26px;
  }
}

@media screen and (max-width: 480px) {
  .w3l-index4 .clients-slider .quote {
    font-size: 16px;
    line-height: 25px;
  }
}

@media screen and (max-width: 436px) {
  .w3l-index4 .mask {
    height: 300px;
  }
}

/* //testimonials block */

/* call block */
.w3l-call-to-action-6 {
  background: var(--gradient-color);
}

h3.title-big {
  font-weight: 800;
  font-size: 30px;
  color: #fff;
  text-transform: uppercase;
}

.w3l-call-to-action-6 .buttons li {
  list-style: none;
  display: inline-block;
}

.w3l-call-to-action-6 .buttons li.green {
  margin: 0 20px;
}

.w3l-call-to-action-6 .buttons li.phone-sec a.call-style-w3 {
  font-size: 20px;
  color: #fff;
  font-weight: 600;
}

.w3l-call-to-action-6 .buttons li.phone-sec a.call-style-w3:hover {
  color: #222;
}

.buttons li.phone-sec i {
  font-size: 38px;
  color: #fff;
  transform: rotate(-26deg);
}

@media (max-width: 992px) {
  .w3l-call-to-action-6 .buttons li {
    display: block;
  }
}

@media (max-width: 567px) {
  .w3l-call-to-action-6 .buttons li.phone-sec a.call-style-w3 {
    font-size: 18px;
  }

  li.phone-sec span {
    font-size: 28px;
  }
}

/* //call block */

/* footer block */
.w3l-footer-29-main {
  background: #09131d;
}

.w3l-footer-29-main h6.footer-title-29 {
  font-size: 20px;
  line-height: 30px;
  margin-bottom: 24px;
  font-weight: 600;
  color: #fff;
}

.w3l-footer-29-main .footer-list-29 ul li {
  list-style: none;
  margin-bottom: 10px;
}

.w3l-footer-29-main .footer-list-29 ul li:last-child {
  margin-bottom: 0px;
}

.w3l-footer-29-main .footer-list-29 ul li a,
.w3l-footer-29-main .footer-list-29 p a,
.w3l-footer-29-main .footer-list-29 p {
  font-size: 15px;
  color: #ababab;
  padding-bottom: 4px;
}

.w3l-footer-29-main .footer-list-29 ul li a {
  display: block;
}

.w3l-footer-29-main .footer-list-29 ul li a:hover,
.w3l-footer-29-main .footer-list-29 p a:hover {
  color: #fff;
}

.w3l-footer-29-main .footer-list-29 ul li:last-child a,
.w3l-footer-29-main .footer-list-29 p {
  border-bottom: none;
}

p.copy-footer-29 {
  font-size: 15px;
  color: #fff;
}

p.copy-footer-29 a {
  color: var(--secondary-color);
}

p.copy-footer-29 a:hover {
  color: var(--primary-color);
}

.w3l-footer-29-main input[type="email"] {
  background: var(--subscribe-footer-input);
  border: none;
  padding: 16px 12px;
  font-size: 15px;
  outline: none;
  width: 80%;
  color: var(--heading-color);
  border-radius: 4px 0 0 4px;
}

.w3l-footer-29-main button {
  border: none;
  outline: none;
  font-size: 16px;
  padding: 16px 12px;
  cursor: pointer;
  width: 20%;
  color: #fff;
  background: var(--secondary-color);
  border-radius: 0 4px 4px 0;
}

@media (max-width: 991px) {
  .w3l-footer-29-main h6.footer-title-29 {
    margin-bottom: 20px;
    font-size: 20px;
  }
}

@media (max-width: 415px) {

  .w3l-footer-29-main .footer-list-29 ul li,
  .w3l-footer-29-main .midd-footer-29:nth-child(1) .footer-list-29 ul li:last-child {
    margin-bottom: 8px;
  }

  .col-4.footer-list-29 {
    flex: 0 0 auto;
    width: 100%;
  }

  .w3l-footer-29-main h6.footer-title-29 {
    margin-bottom: 10px;
  }
}

/* //footer block */

/* inner banner */
.inner-banner {
  background: url(../images/banner3.jpg) no-repeat center;
  background-size: cover;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  -ms-background-size: cover;
  position: relative;
  z-index: 0;
}

.inner-banner::before {
  content: "";
  position: absolute;
  top: 0;
  min-height: 100%;
  left: 0;
  right: 0;
  z-index: -1;
  background: var(--banner-layer);
}

.w3l-breadcrumb {
  display: block;
  margin: 0 auto;
  z-index: 100;
  z-index: 99;
}

.breadcrumbs-custom-path {
  text-align: center;
  display: inline-block;
  margin-top: 6px;
}

h4.inner-text-title {
  color: var(--heading-color);
  font-size: 32px;
  line-height: 40px;
  font-weight: bold;
}

.breadcrumbs-custom-path li {
  position: relative;
  display: inline-block;
  vertical-align: middle;
  font-size: 15px;
  text-transform: capitalize;
  color: var(--font-color);
  font-weight: 400;
}

.breadcrumbs-custom-path li i {
  font-size: 12px;
  margin: 0 5px;
}

.breadcrumbs-custom-path a,
.breadcrumbs-custom-path a:active {
  color: var(--heading-color);
  font-weight: bold;
}

.breadcrumbs-custom-path a:hover {
  color: var(--primary-color);
}

@media (max-width: 800px) {
  .breadcrumbs-custom-path li {
    font-size: 16px;
  }

  h4.inner-text-title {
    font-size: 28px;
  }
}

@media (max-width: 568px) {
  .breadcrumbs-custom-path li {
    font-size: 15px;
  }

  .breadcrumbs-custom-path {
    margin-top: 2px;
  }
}

/* //inner banner */

/* holidays section */
.w3l-timeline-1 {
  background: var(--bg-light);
}

.w3l-timeline-1 .timeline {
  max-width: 900px;
  margin: 0 auto;
  margin-bottom: 40px;
  position: relative;
}

.w3l-timeline-1 .timeline:before {
  content: "";
  position: absolute;
  top: 10px;
  left: 55px;
  width: 3px;
  height: calc(100% - 10px);
  background: var(--primary-color);
}

.w3l-timeline-1 .timeline .column {
  margin: 0px 40px 40px 120px;
}

.w3l-timeline-1 h5.sub-title-timeline {
  font-size: 24px;
  line-height: 34px;
  margin-bottom: 1em;
  margin-left: 2em;
}

.w3l-timeline-1 h5.sub-title-timeline i {
  color: var(--primary-color);
}

.w3l-timeline-1 .timeline .column .title h2 {
  font-size: 21px;
  line-height: 31px;
  font-weight: 600;
  position: relative;
}

.w3l-timeline-1 .timeline .column .title h2:before {
  content: "";
  position: absolute;
  left: -73px;
  top: 10px;
  width: 18px;
  height: 18px;
  background: var(--bg-color);
  border: 3px solid var(--primary-color);
  border-radius: 50%;
}

.description h6 {
  color: var(--primary-color);
  margin-top: 15px;
}

.w3l-timeline-1 .main {
  width: 80%;
  margin-left: 10%;
  margin-top: 80px;
}

.w3l-timeline-1 .main h1 {
  font-size: 80px;
  line-height: 60px;
}

.w3l-timeline-1 .main p {
  font-size: 13px;
  line-height: 20px;
  font-family: serif;
  text-align: right;
}

@media (max-width: 1280px) {}

@media (max-width: 1080px) {}

@media (max-width: 800px) {
  .w3l-timeline-1 .timeline .column {
    margin: 0px 0px 40px 120px;
  }
}

@media (max-width: 568px) {
  .w3l-timeline-1 .timeline .column {
    margin: 0px 0px 40px 60px;
  }

  .w3l-timeline-1 .timeline::before {
    left: 15px;
  }

  .w3l-timeline-1 .timeline .column .title h2:before {
    left: -53px;
    top: 7px;
  }

  .w3l-timeline-1 h5.sub-title-timeline {
    margin-left: .4em;
  }
}

@media (max-width: 400px) {
  .w3l-timeline-1 .timeline .column {
    margin: 0px 0px 40px 40px;
  }

  .w3l-timeline-1 .timeline .column .title h2 {
    font-size: 19px;
    line-height: 28px;
  }

  .w3l-timeline-1 .timeline .column .title h2:before {
    left: -32px;
    top: 4px;
  }
}

/* holidays section */

/* contact section */
.contact-block input,
.contact-block textarea {
  width: 100%;
  color: var(--heading-color);
  background: var(--bg-grey);
  font-size: 16px;
  padding: 14px;
  border: 2px solid var(--border-color-light);
  outline: none;
  margin-bottom: 20px;
  border-radius: var(--border-radius);
}

.cont-left.text-center i {
  color: var(--secondary-color);
  font-size: 26px;
}

.contact-block textarea {
  height: 180px;
  margin: 0 0 20px 0;
}

.contact-block input:focus,
.contact-block textarea:focus {
  border: 2px solid var(--secondary-color);
  background: var(--bg-color);
}

.contact-left {
  box-shadow: var(--box-shadow);
  padding: 40px;
}

.cont-details p a:hover {
  color: var(--secondary-color);
}

.cont-details h6 {
  font-size: 18px;
  font-weight: 600;
  line-height: 18px;
  margin-bottom: 8px;
}

.map iframe {
  -webkit-filter: var(--iframe-filter);
  -moz-filter: var(--iframe-filter);
  -ms-filter: var(--iframe-filter);
  -o-filter: var(--iframe-filter);
  filter: var(--iframe-filter);
}

/* //contact section */

/* login section */
.login-block input,
.login-block textarea {
  width: 100%;
  color: var(--heading-color);
  background: var(--bg-grey);
  font-size: 16px;
  padding: 14px;
  border: 2px solid var(--border-color-light);
  outline: none;
  margin-bottom: 20px;
  border-radius: var(--border-radius);
}

.log-left.text-center i {
  color: var(--secondary-color);
  font-size: 26px;
}

.login-block textarea {
  height: 180px;
  margin: 0 0 20px 0;
}

.login-block input:focus,
.login-block textarea:focus {
  border: 2px solid var(--secondary-color);
  background: var(--bg-color);
}

.login-left {
  box-shadow: var(--box-shadow);
  padding: 40px;
}

.login-center {
    float: none;
    margin: auto;
}

.log-details p a:hover {
  color: var(--secondary-color);
}

.log-details h6 {
  font-size: 18px;
  font-weight: 600;
  line-height: 18px;
  margin-bottom: 8px;
}

.new-user {
    color: var(--secondary-color);
    margin-left: 40%;
}

/* //login section */

/* //error section */
.page_404  img{
    width:100%;
}

.four_zero_four_bg{
    background-image: url(/assets/images/dribbble.gif);
    height: 400px;
    background-position: center;
 }

.four_zero_four_bg h1{
    font-size:80px;
 }

.four_zero_four_bg h3{
    font-size:80px;
}

.link_404{
    padding: 10px 20px;
    margin: 20px 0;
    display: inline-block;
 }

.contant_box_404{
    margin-top:-50px;
}

/* //error section */

/* team block */
.w3l-team-13 .left-side h4 {
  font-size: 22px;
  line-height: 32px;
  margin-top: 15px;
  font-weight: bold;
  transition: .3s;
  -webkit-transition: .3s;
  -moz-transition: .3s;
  -ms-transition: .3s;
  -o-transition: .3s;
}

.image-one:hover h4 {
  color: var(--secondary-color);
  transition: .3s;
  -webkit-transition: .3s;
  -moz-transition: .3s;
  -ms-transition: .3s;
  -o-transition: .3s;
}

.w3l-team-13 img {
  transition: .3s;
  background: var(--bg-grey);
  border-radius: 8px 8px 0 0;
}

.w3l-team-13 img:hover {
  transition: .3s;
  background: var(--secondary-color);
}

.w3l-team-13 .image-one {
  box-shadow: var(--box-shadow);
  padding-bottom: 15px;
}

.w3l-team-13 .buttons-teams2 a i {
  font-size: 24px;
  margin: 0 3px;
}

.w3l-team-13 .buttons-teams2 a .fa-facebook-square {
  color: #3b5998;
}

.w3l-team-13 .buttons-teams2 a .fa-twitter-square {
  color: #00acee;
}

.w3l-team-13 .buttons-teams2 a .fa-google-plus-square {
  color: #DD4B39;
}

@media (max-width: 480px) {
  .w3l-team-13 .left-side h4 {
    font-size: 18px;
    line-height: 25px;
  }
}

/* //team block */