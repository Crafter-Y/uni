---
name: document-review
description: Review a single Markdown note in this repo for formatting, spelling, writing-style issues, and outright mistakes, then apply safe fixes. Use when the user asks to "review", "check", or "proofread" a specific file. Requires a file path as argument.
---

# Document review

A two-step pass over one Markdown file: first analyze and report, then apply only the *safe* fixes automatically. Everything else waits for the author to ask.

## Inputs

A single file path (absolute or repo-relative). If the user didn't provide one, ask before continuing. Do not review more than one file per invocation unless explicitly told to.

## Step 1 — Review and report

Read the file end-to-end. Check it against the conventions in `CLAUDE.md` ("Markdown formatting conventions") and against general writing quality. Specifically scan for:

- **Formatting drift from the repo conventions**
  - Wrong heading levels (`#` used below the title, `###`+ instead of `**bold**` sub-headlines)
  - Missing `# Material` / source block at the top
  - Missing `---` separators between examples / exercise parts
  - Multi-line math not wrapped in `\begin{align*} … \end{align*}`, or using `align` / `eqnarray` instead of `align*`
  - Single-line formulas wrapped in `align*` unnecessarily
  - `>` blockquotes used for something other than informal glosses
  - Code fences without a language tag
  - HTML `<table>` used where a Markdown pipe-table would do
- **Spelling and typos** (German and English — preserve the mixed-language style)
- **Writing-style problems** (incoherent sentences, dangling references like "siehe oben" with no referent, abrupt cut-offs that aren't marked `TODO`, broken Markdown links, duplicated paragraphs)
- **Outright wrong content** (math errors, factual mistakes, mismatched variable names between equation lines, claims that contradict an earlier line in the same file). Be conservative — only flag things you're confident are wrong, not stylistic preferences.
- **TODOs present in the file** (`TODO`, `TODO: source`, `TODO b,c`, etc.). Note them — do **not** attempt to fill them in.

Present findings in chat grouped into exactly these three sections, in this order. Omit any section that has no entries. Cite line numbers (`file.md:42`) so the author can jump to them.

### Auto-fixable

Trivial, mechanical issues that step 2 will resolve. One short line each, no elaboration. Examples: missing trailing newline, inconsistent capitalization, stray double spaces, missing language tag on a code fence, `align` instead of `align*`, missing `---` between two clearly distinct examples, obvious spelling mistakes, simple casing/punctuation drift.

### Outstanding tasks

Every TODO marker found in the file, with its line number and the surrounding context in a few words. Do **not** propose answers, do **not** suggest content — just list them so the author knows what's still open.

### Things that need attention

Substantive issues that require a judgment call from the author: math that looks wrong, contradictory statements, broken or stale links, paragraphs that don't parse, ambiguous variable reuse, structural problems. Each entry gets one or two sentences of explanation — no proposed rewrite unless they ask.

## Step 2 — Apply safe fixes

Immediately after the report, apply **only** the items from the *Auto-fixable* group. Follow `CLAUDE.md` ("Markdown formatting conventions" and "Helping the author") — keep edits precise and minimal, match the existing tone, don't reflow surrounding paragraphs, don't restructure the document.

What qualifies as a safe edit:

- Obvious spelling and typo corrections (only where there is a single unambiguous fix)
- Punctuation and capitalization drift
- Stray double spaces, missing trailing newline, trailing whitespace
- Adding a language tag to an untagged code fence where the language is obvious from the content
- `align` → `align*`, `eqnarray` → `align*`
- Inserting a missing `---` separator between two examples that are already clearly delimited by their numbering
- Consistency fixes inside a single file (e.g. variable name spelled two different ways where one is clearly a typo)

What does **not** qualify — leave for the author to request explicitly:

- The TODOs (never touched by this skill)
- Rewriting sentences for clarity
- Restructuring sections, changing heading levels, promoting/demoting `**bold**` sub-headlines
- Fixing math errors or factual content
- Rewrapping multi-line math into `align*` (structural change — ask first)
- Converting an HTML `<table>` to a Markdown table or vice versa
- Anything listed under *Things that need attention*

After applying the safe edits, report a short summary of what was changed (one line per edit, with line number). If *Auto-fixable* was empty, say so and skip the edit phase.

## Rules

- Step 1 is read-only. No edits before the report is delivered.
- Never touch TODOs in either step.
- If in doubt whether an edit is "safe", treat it as not safe and surface it in *Things that need attention* instead.
