# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

Personal transcripts and exercise solutions for the author's university courses at DHBW Karlsruhe (cohort TINF25B4) plus a maths prep course (KA-T25 Vorkurs Mathe). Content is overwhelmingly **Markdown lecture notes** — typically one dated file per session (`YYYY-MM-DD.md`) inside a per-course directory (`ka-tinf25b4-<course>/`). There is no application to build or test at the repo root; "the code" here is the notes themselves.

Some sessions also contain small standalone Java exercises (see `ka-tinf25b4-programming/<date>/<exercise>/*.java`) and SVG solutions for the Incredible Proof Machine. PDFs and images in `external/` are course materials and are tracked via **Git LFS** (`*.pdf`, `*.png`, `*.svg` per `.gitattributes`) — you need `git lfs` installed to pull them.

The top-level `README.md` is a hand-maintained index of every note file. **When you add a new dated note, append a link to it under the matching course section in `README.md`** — that is the only "build step" this repo has.

## Working with the notes

- Notes are in **German** (mostly) with technical terms in English; preserve that mix when editing.
- Markdown is rendered with **Markdown Preview Enhanced** (`shd101wyy.markdown-preview-enhanced`) using **MathJax** for math — use `$...$` / `$$...$$` LaTeX, not other math dialects. All features supported by GitHub Markdown are allowed, e.g. Mermaid for Charts.

## Markdown formatting conventions

Follow the author's existing style when authoring or extending a note:

- **Top of file is `# <Title>` then a "Material" / source block.** Lecture notes start with `# Material` followed by either a link to the slides (e.g. `[Theoretische-Informatik-II.pdf](https://moodle.dhbw.de/...)`) or `TODO` if the slides aren't available yet. Übungsblätter start with `# Übungsblatt N` and the sources. Never bury the source mid-document.
- **Section headlines use `##`.** Don't use `#` for anything except the file title, and avoid `###`+ — instead use `**Bold inline headlines**` on their own line for sub-sections within an `##` topic, e.g. `**Master-Theorem**`.
- **Separate logical chunks with a `---` horizontal rule.** Each worked example, exercise sub-part, or distinct example gets its own block delimited by `---`. Number them inline (`1.`, `a)`, `Aufgabe 3`, `Beispiel 2` - usually the assignment number referenced) rather than via Markdown headings.
- **Blockquotes (`>`) hold informal/intuitive glosses** of a formal definition — short paraphrases in plain language, e.g. `> "Welche Funktion wächst langfristig schneller?"` next to the formal Landau definition, or a `>` line restating a case of the Master-Theorem in words. Don't use `>` for citations or warnings.
- **Math: always wrap multi-line derivations in `\begin{align*} … \end{align*}`** inside a `$$ … $$` block, with `&` alignment on `=`/`\le`/etc. and `\\` line breaks. MathJax in Markdown Preview Enhanced does **not** auto-number, but it *does* require `align*` (not bare `align`, not `eqnarray`) — that is how every multi-step calculation in this repo is written, and the convention must be preserved or rendering breaks. End completed proofs with `&&\square` on the last line.
- Single-line formulas use `$...$` inline or a standalone `$$...$$` block; don't wrap a one-liner in `align*`.
- **Tables: Markdown pipe-tables for simple grid content; raw HTML `<table>` only when you need rowspan/colspan, multi-line cells, or embedded block content.** Don't reach for HTML by default.
- **Code fences carry a language tag** (` ```java `, ` ```html `, etc.).
- **External assets live in `external/`** (tracked via LFS). The original authors are mentioned in COPYRIGHT.md
- **TODOs are fine** — `TODO`, `TODO: source`, `TODO b,c` appear throughout as placeholders for things to fill in later. Leave existing ones alone unless asked to resolve them.

## Helping the author

The author is a student working through this material — don't short-circuit the learning by handing over finished solutions.

- **Default to guidance, not solutions.** When asked for help on an exercise or proof, respond with hints, the next step to try, or the relevant theorem/technique — not a worked-out answer. Only produce a full solution when the author explicitly asks ("give me the full solution", "just solve it", etc.).
- **Don't edit files unless asked.** When the author asks a question about a note, respond in chat. Touch files only on an explicit edit request.
- **When editing, follow the formatting conventions above**
- **Keep edits precise and minimal.** Change exactly what was asked for; don't reflow surrounding paragraphs, don't restructure the document, don't add extra emphasis, callouts, or bullet hierarchies. KISS — match the existing tone, which is plain and compact.

## Java exercises (programming course only)

The Java files under `ka-tinf25b4-programming/<date>/<exercise>/` are small didactic snippets — single-file or a handful of files, no Maven/Gradle. They are meant to be opened in IntelliJ (hence the `.iml` files).

There is no test suite, no linter config, and no CI. Don't introduce a build system unless asked.