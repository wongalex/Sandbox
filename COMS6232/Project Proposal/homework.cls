\LoadClass[12pt]{article}
\ProvidesClass{homework}

\RequirePackage{ifthen}
\RequirePackage{fancyhdr}
\RequirePackage{amsmath,amsthm,amsfonts,amssymb}
\RequirePackage{pstricks}
\RequirePackage{pst-node}
\RequirePackage[margin=1.2in]{geometry}

\theoremstyle{plain}
\theoremstyle{definition}
\theoremstyle{remark}

\newtheorem{theorem}{Theorem}
\newtheorem{corollary}{Corollary}
\newtheorem{lemma}{Lemma}
\newtheorem{proposition}{Proposition}
\newtheorem{defn}{Definition}
\newtheorem{Conjecture}{Conjecture}
\newtheorem{claim}{Claim}
\newtheorem{property}{Property}
\newtheorem*{sketch}{Sketch}
\newtheorem{remark}{Remark}
\newtheorem{example}{Example}

\newcommand{\studname}[1]{\gdef\@studname{#1}}
\newcommand{\studmail}[1]{\gdef\@studmail{#1}}
\newcommand{\uni}[1]{\gdef\@uni{#1}}
\newcommand{\coursename}[1]{\gdef\@coursename{#1}}
\newcommand{\hwNo}[1]{\gdef\@hwNo{#1}}

\let\Oldmaketitle\maketitle
\renewcommand{\maketitle}
{

	\Oldmaketitle
	\thispagestyle{plain}
}

\newcounter{begin}
\setcounter{begin}{1}

\newcommand{\problemNo}[1]{
	\ifthenelse{\equal{\value{begin}}{1}}
	{
		\setcounter{begin}{0}
	}
	{
		\skipevenpage
	}
	\setcounter{prob}{#1}
	\section*{Proposal:}
}


\fancypagestyle{plain}
{
	\fancyhead{}
	\fancyfoot{}
	\fancyfoot[LE,LO]{\@coursename}
	\fancyfoot[RE,RO] {\thepage}
	\renewcommand{\headrulewidth}{0pt}
}

\newcounter{prob}

\pagestyle{fancy}

\fancyhead{}
\fancyfoot{}
\fancyhead[RE,RO]{Project Proposal}
\fancyhead[CE,CO]{}
\fancyhead[LE,LO]{\@studname \ (\@uni)}
\fancyfoot[LE,LO]{\@coursename}
\fancyfoot[RE,RO] {\thepage}
\renewcommand{\footrulewidth}{0.4 pt}

\newcounter{emptypages}
\setcounter{emptypages}{0}

\newcounter{sum}

\newcommand*{\skipevenpage}{
	\newpage
	\if@twoside
	\setcounter{sum}{\value{page}}
	\addtocounter{sum}{\value{emptypages}}
	\ifthenelse{\isodd{\value{sum}}}
	{
	}
	{
		\thispagestyle{empty}
		\hbox{}
		\newpage
		\addtocounter{page}{-1}
		\addtocounter{emptypages}{1}
	}
	{
	}
	\fi
}

\title{\@coursename \ - Project Proposal: Summary of the Current Best Asymmetric TSP Approximation Algorithms}
\author{\@studname \ (\@uni) \ - \texttt{\@studmail}}
\date{\today}

\endinput